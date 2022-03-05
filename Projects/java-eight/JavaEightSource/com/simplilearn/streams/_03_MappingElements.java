package com.simplilearn.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _03_MappingElements {
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
	}

	public static void main(String[] args) {

		List<Movie> movies = Arrays.asList(new Movie("DDLJ", 20), new Movie("AAA", 15), new Movie("KKKK", 10));

		// Intermediate functions -> map, filter, distinct, sorted, limit, skip
		// Terminal functions -> forEach, toArray, reduce, collect, min, max,
		// count, anyMatch, allMatch, noneMatch, findFirst and findAny

		List<String> movieTitles = movies.stream().map(movie -> movie.getTitle()) // Intermediate operations
				.collect(Collectors.toList()); // Terminal operations
		System.out.println("movieTitles " + movieTitles);

		int likesCountOld = 0;
		for (Movie eachMovie : movies) {
			likesCountOld += eachMovie.getLikes();
		}
		System.out.println("Likes likesCountOld " + likesCountOld);

		long likesCountAll = movies.stream().map(movie -> movie.getLikes()).reduce(0, (a, b) -> a + b);
		System.out.println("Likes count " + likesCountAll);

	}
}
