package com.simplilearn.streams;

import java.util.Arrays;
import java.util.List;

public class _10_Reducers {

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

	}

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
		
//		int totalLikesDetailed = movies.stream().map(movie -> movie.getLikes()).reduce((accumulator, currentValue) -> {
//			System.out.println("accumulator :- " + accumulator + " currentValue :- " + currentValue);
//			return accumulator + currentValue;
//		}).get();
//
//		System.out.println("totalLikesDetailed : " + totalLikesDetailed);

		//Task :- Get total number of likes for all movies..
		int totalLikes = movies.stream().map(movie -> movie.getLikes()).reduce((a, x) -> a + x).get();
		System.out.println("totalLikes : " + totalLikes);
		
		int totalLikesWIV = movies.stream().map(movie -> movie.getLikes()).reduce(0, (a, x) -> a + x);
		System.out.println("totalLikes with initValue : " + totalLikesWIV);
		
		int totalLikesUsingSum = movies.stream().map(movie -> movie.getLikes()).reduce(Integer::sum).get();
		System.out.println("totalLikesUsingSum : " + totalLikesUsingSum);
		
		int totalLikesUsingSumWIV = movies.stream().map(movie -> movie.getLikes()).reduce(0, Integer::sum);
		System.out.println("totalLikesUsingSum with initValue : " + totalLikesUsingSumWIV);
	}
}
