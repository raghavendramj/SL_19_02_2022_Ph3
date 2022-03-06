package com.simplilearn.streams;

import java.util.Arrays;
import java.util.List;

import com.simplilearn.streams._06_SortingStreams.Movie;

public class _08_PeekingElements {

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
		
		movies.stream()
				 //Filter and peek -> Movies filtered
				.filter(movie -> movie.getLikes() > 10)
				.peek(movie -> System.out.println("Filtered Data : " + movie))
				//Map and peek -> Movie title mapped
				.map(Movie::getTitle)
				.peek(title -> System.out.println("Mapped Data : " + title))
				.forEach(System.out::println);

	}

}
