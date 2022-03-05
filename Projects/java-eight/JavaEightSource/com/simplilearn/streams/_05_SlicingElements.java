package com.simplilearn.streams;

import java.util.Arrays;
import java.util.List;

public class _05_SlicingElements {
	
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
				new Movie("A", 10),
				new Movie("B", 15), 
				new Movie("C", 20));
		
		System.out.println("\n\nSlicied to only 2 movies...");
		movies.stream().limit(2).forEach(System.out::println);
		
		System.out.println("\n\nSkipped till 2 movies..");
		movies.stream().skip(2).forEach(System.out::println);
	}

}
