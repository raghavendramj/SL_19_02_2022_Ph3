package com.simplilearn.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _06_SortingStreams {
	
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
				new Movie("G", 45),
				new Movie("H", 12),
				new Movie("B", 17),
				new Movie("A", 56),
				new Movie("Y", 23),
				new Movie("R", 43),
				new Movie("O", 33), 
				new Movie("C", 19));
		
		//Sorting with old way
		System.out.println("\n\n (a, b) -> a.getTitle().compareTo(b.getTitle())");
		movies.stream().sorted((a, b) -> a.getTitle().compareTo(b.getTitle())).forEach(System.out::println);
		
		
		System.out.println("\n\nASCENDING - Using Comparator.comparing(movie -> movie.getTitle())");
		//Sorting with Comparing
		movies.stream().sorted(Comparator.comparing(movie -> movie.getTitle())).forEach(System.out::println);
		
		System.out.println("\n\nUsing Method Reference ASCENDING - Using Comparator.comparing(movie -> movie.getTitle())");
		movies.stream().sorted(Comparator.comparing(Movie::getTitle)).forEach(System.out::println);
		
		//Sorting with Comparing
		System.out.println("\n\nDESCEDING - Using Comparator.comparing(movie -> movie.getTitle())");
		movies.stream().sorted(Comparator.comparing(Movie::getTitle).reversed()).forEach(System.out::println);
		
		System.out.println("\n\nDESCEDING - Using Comparator.comparing(Movie::getLikes).reversed()");
		movies.stream().sorted(Comparator.comparing(Movie::getLikes).reversed()).forEach(System.out::println);
	
		
	
	
	}
}
