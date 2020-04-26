package com.observer;


public class ObserverClient {
	public static void main(String args[]){
		Blogger observable = new Blogger();
		BlogReader observer = new BlogReader();
		 
		observable.addObserver(observer);
		observable.setPost("O padrão de design observer é show bb!");
		if((observer.getPost() == "O padrão de design observer é show bb!")) {
			System.out.println("O Leitor visualizou a notícia: " + observer.getPost());
		}
	}
}
