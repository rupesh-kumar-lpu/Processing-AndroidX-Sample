package com.example.processing_androidx_sample_api30;

import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

  PImage leaf;

  public void settings() {
    fullScreen();
  }

  public void setup() {
    leaf = loadImage("leaf.png");
    imageMode(CENTER);
  }

  public void draw() {
    background(9);
    image(leaf, mouseX, mouseY);
  }
}