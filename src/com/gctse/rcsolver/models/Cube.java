package com.gctse.rcsolver.models;

public class Cube {
	public enum Face { BLUE, GREEN, ORANGE, RED, YELLOW, WHITE };
	public enum Row { FIRST, SECOND, THIRD };
	public enum Column { FIRST, SECOND, THIRD };
	public enum Color { BLUE, GREEN, ORANGE, RED, YELLOW, WHITE }
	
	private static final int NUMBER_OF_FACES = 6;
	private static final int NUMBER_OF_ROWS = 3;
	private static final int NUMBER_OF_COLUMNS = 3;
	
	private Color[][][] cube;
	
	public Cube()
	{
		cube = new Color[NUMBER_OF_FACES][NUMBER_OF_ROWS][NUMBER_OF_COLUMNS];
	}
	
	public void setColor(Face face, Row row, Column column, Color color) {
		cube[face.ordinal()][row.ordinal()][column.ordinal()] = color;
	}

	public Color getColor(Face face, Row row, Column column) {
		return cube[face.ordinal()][row.ordinal()][column.ordinal()];
	};
	
}
