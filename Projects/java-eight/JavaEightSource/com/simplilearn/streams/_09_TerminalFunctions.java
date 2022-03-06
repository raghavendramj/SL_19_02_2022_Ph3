package com.simplilearn.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _09_TerminalFunctions {

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
		
		// Terminal functions -> forEach, toArray, reduce, collect, min, max,
		// count, anyMatch, allMatch, noneMatch, findFirst and findAny
		
		boolean anyMatch = movies.stream().anyMatch(movie -> movie.getLikes() > 20);
		System.out.println("Any matched movie : "+ movies.stream().anyMatch(movie -> movie.getLikes() > 20));
		System.out.println("All matched movie : "+ movies.stream().allMatch(movie -> movie.getLikes() > 10));
		System.out.println("None matched movie : "+ movies.stream().noneMatch(movie -> movie.getLikes() > 10));
		
		System.out.println("Find first movie : "+ movies.stream().findFirst().get());
		System.out.println("Find any movie : "+ movies.stream().findAny().get());
		
		System.out.println("Max likes movie: "+ movies.stream().max((a, b) -> a.getLikes() > b.getLikes() ? 1 : -1) .get());
		System.out.println("Min likes movie: "+ movies.stream().max((a, b) -> a.getLikes() > b.getLikes() ? -1 : 1) .get());
		
		System.out.println("Max likes Comparator.comparing(Movie::getTitle) : "+ movies.stream().max(Comparator.comparing(Movie::getLikes)) .get());
		System.out.println("Min likes Comparator.comparing(Movie::getTitle): "+ movies.stream().min(Comparator.comparing(Movie::getLikes)) .get());
	}
}
