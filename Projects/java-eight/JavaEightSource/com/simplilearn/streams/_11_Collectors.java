package com.simplilearn.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.simplilearn.streams._10_Reducers.Movie;

public class _11_Collectors {

	static class Movie {
		private String title;
		private int likes;

		public Movie(String title, int likes) {
			this.setTitle(title);
			this.likes = likes;
		}

		public int getLikes() {
			return likes;
		}

		public void setLikes(int likes) {
			this.likes = likes;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		@Override
		public String toString() {
			return "Movie [title=" + title + ", likes=" + likes + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + likes;
			result = prime * result + ((title == null) ? 0 : title.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Movie other = (Movie) obj;
			if (likes != other.likes)
				return false;
			if (title == null) {
				if (other.title != null)
					return false;
			} else if (!title.equals(other.title))
				return false;
			return true;
		}
	}

	// Terminal functions -> forEach, toArray, reduce, collect, min, max,
	// count, anyMatch, allMatch, noneMatch, findFirst and findAny

	public static void main(String[] args) {
		List<Movie> movies = Arrays.asList(
				new Movie("Gehraiyaan", 45),
				new Movie("Badhaai Do", 12),
				new Movie("A Thursday", 17),
				new Movie("Toolsidas Junior", 56),
				new Movie("The Kashmir Files", 23),
				new Movie("Bachchhan Paandey", 43),
				new Movie("Runway 34", 33), 
				new Movie("Rocket Gang", 19));

		List<Movie> grt20Likes = movies.stream().filter(movie -> movie.getLikes() > 20).collect(Collectors.toList());
		System.out.println("\n grt20LikesInLIst \n"
				+ movies.stream().filter(movie -> movie.getLikes() > 20).collect(Collectors.toList()));
		System.out.println("\n***************************************\n");
		System.out.println("\ngrt20LikesInSet \n"
				+ movies.stream().filter(movie -> movie.getLikes() > 20).collect(Collectors.toSet()));
		System.out.println("\n***************************************\n");

		// Task :- Gehraiyaan -> [title=Gehraiyaan, likes=45] => map
		System.out.println("Map with any key inside the object to object itself as value\n");
		Map<String, Object> mappedMovies =  movies.stream()
											.filter(movie -> movie.getLikes() > 20)
											.collect(Collectors.toMap(Movie::getTitle, movie -> movie));
		System.out.println(mappedMovies);
		
		System.out.println("\n***************************************\n");
		System.out.println("simplified -> Map with any key inside the object to object itself as value\n");
		Map<String, Object> simplified =  movies.stream()
				.filter(movie -> movie.getLikes() > 20)
				.collect(Collectors.toMap(Movie::getTitle, Function.identity()));
		System.out.println(mappedMovies);
		
		
		int sumOfAllLikesGtThan20 = movies.stream().filter(movie -> movie.getLikes() > 20).collect(Collectors.summingInt(Movie::getLikes));
		System.out.println("sumOfAllLikesGtThan20 -> "+ sumOfAllLikesGtThan20);
		
		System.out.println("\n***************************************\n");
		
		IntSummaryStatistics summarizingIntForLikesGtThan20 = movies.stream().filter(movie -> movie.getLikes() > 20).collect(Collectors.summarizingInt(Movie::getLikes));
		System.out.println("sumOfAllLikesGtThan20 -> "+ summarizingIntForLikesGtThan20);
		
		String joinedTitles = movies.stream().map(Movie::getTitle).collect(Collectors.joining(", "));
		System.out.println("joinedTitles :- "+ joinedTitles);
	}
}
