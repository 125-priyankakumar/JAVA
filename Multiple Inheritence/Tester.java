package com.org.tyson;

public class Tester{
	   public static void main(String[] args){
	      Hockey hockey = new Hockey() {
	         public void start() {
	            System.out.println("Start Event");
	         }
	         public void play() {
	            System.out.println("Play Sports.");
	         }
	         public void show() {
	            System.out.println("Show Hockey.");
	         }
	      };

	      hockey.start();
	      hockey.play();
	      hockey.show();
	   }
	}