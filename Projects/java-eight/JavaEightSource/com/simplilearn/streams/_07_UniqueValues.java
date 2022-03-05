package com.simplilearn.streams;

import java.util.Arrays;
import java.util.List;

import com.simplilearn.streams._06_SortingStreams.Movie;

public class _07_UniqueValues {
	
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
	
	public static void main(String[] args) {
		List<Movie> movies = Arrays.asList(
				new Movie("G", 45),
				new Movie("H", 12),
				new Movie("B", 17),
				new Movie("B", 17),
				new Movie("B", 17),
				new Movie("B", 17),
				new Movie("A", 56),
				new Movie("Y", 23),
				new Movie("R", 43),
				new Movie("O", 33), 
				new Movie("C", 19));
		
		movies.stream().distinct().forEach(System.out::println);
		movies.stream().map(movie -> movie.getTitle()).distinct().forEach(System.out::println);
	}
}
