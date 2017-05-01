package com.gctse.rcsolver.models;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gctse.rcsolver.models.Cube.Color;
import com.gctse.rcsolver.models.Cube.Face;
import com.gctse.rcsolver.models.Cube.Column;
import com.gctse.rcsolver.models.Cube.Row;

public class CubeTest {

	@Test
	public void GivenANewCube_WhenSettingTheColors_ThenTheColorsAreSet() {
		// Given
		Cube aCube = new Cube();
		
		// When
		setBlueFaceColors(aCube);
		setGreenFaceColors(aCube);	
		setOrangeFaceColors(aCube);
		setRedFaceColors(aCube);
		setYellowFaceColors(aCube);
		setWhiteFaceColors(aCube);
		
		// Then
		assertBlueFaceIsSet(aCube);
		assertGreenFaceIsSet(aCube);
		assertOrangeFaceIsSet(aCube);		
		assertRedFaceIsSet(aCube);
		assertYellowFaceIsSet(aCube);	
		assertWhiteFaceIsSet(aCube);
	}

	private void setBlueFaceColors(Cube aCube) {
		aCube.setColor(Face.BLUE, Row.FIRST, Column.SECOND, Color.BLUE);
		aCube.setColor(Face.BLUE, Row.SECOND, Column.SECOND, Color.RED);
		aCube.setColor(Face.BLUE, Row.THIRD, Column.THIRD, Color.ORANGE);
	}

	private void setGreenFaceColors(Cube aCube) {
		aCube.setColor(Face.GREEN, Row.FIRST, Column.SECOND, Color.ORANGE);
		aCube.setColor(Face.GREEN, Row.SECOND, Column.FIRST, Color.RED);
		aCube.setColor(Face.GREEN, Row.THIRD, Column.THIRD, Color.WHITE);
	}

	private void setOrangeFaceColors(Cube aCube) {
		aCube.setColor(Face.ORANGE, Row.FIRST, Column.SECOND, Color.GREEN);
		aCube.setColor(Face.ORANGE, Row.SECOND, Column.FIRST, Color.WHITE);
		aCube.setColor(Face.ORANGE, Row.THIRD, Column.THIRD, Color.YELLOW);
	}

	private void setRedFaceColors(Cube aCube) {
		aCube.setColor(Face.RED, Row.FIRST, Column.FIRST, Color.BLUE);
		aCube.setColor(Face.RED, Row.SECOND, Column.FIRST, Color.WHITE);
		aCube.setColor(Face.RED, Row.THIRD, Column.SECOND, Color.GREEN);
	}

	private void setYellowFaceColors(Cube aCube) {
		aCube.setColor(Face.YELLOW, Row.FIRST, Column.FIRST, Color.YELLOW);
		aCube.setColor(Face.YELLOW, Row.SECOND, Column.FIRST, Color.RED);
		aCube.setColor(Face.YELLOW, Row.THIRD, Column.SECOND, Color.ORANGE);
	}

	private void setWhiteFaceColors(Cube aCube) {
		aCube.setColor(Face.WHITE, Row.FIRST, Column.THIRD, Color.BLUE);
		aCube.setColor(Face.WHITE, Row.SECOND, Column.THIRD, Color.GREEN);
		aCube.setColor(Face.WHITE, Row.THIRD, Column.FIRST, Color.WHITE);
	}

	private void assertBlueFaceIsSet(Cube aCube) {
		assertEquals(Color.BLUE, aCube.getColor(Face.BLUE, Row.FIRST, Column.SECOND));
		assertEquals(Color.RED, aCube.getColor(Face.BLUE, Row.SECOND, Column.SECOND));
		assertEquals(Color.ORANGE, aCube.getColor(Face.BLUE, Row.THIRD, Column.THIRD));
	}

	private void assertGreenFaceIsSet(Cube aCube) {
		assertEquals(Color.ORANGE, aCube.getColor(Face.GREEN, Row.FIRST, Column.SECOND));
		assertEquals(Color.RED, aCube.getColor(Face.GREEN, Row.SECOND, Column.FIRST));
		assertEquals(Color.WHITE, aCube.getColor(Face.GREEN, Row.THIRD, Column.THIRD));
	}

	private void assertOrangeFaceIsSet(Cube aCube) {
		assertEquals(Color.GREEN, aCube.getColor(Face.ORANGE, Row.FIRST, Column.SECOND));
		assertEquals(Color.WHITE, aCube.getColor(Face.ORANGE, Row.SECOND, Column.FIRST));
		assertEquals(Color.YELLOW, aCube.getColor(Face.ORANGE, Row.THIRD, Column.THIRD));
	}

	private void assertRedFaceIsSet(Cube aCube) {
		assertEquals(Color.BLUE, aCube.getColor(Face.RED, Row.FIRST, Column.FIRST));
		assertEquals(Color.WHITE, aCube.getColor(Face.RED, Row.SECOND, Column.FIRST));
		assertEquals(Color.GREEN, aCube.getColor(Face.RED, Row.THIRD, Column.SECOND));
	}

	private void assertYellowFaceIsSet(Cube aCube) {
		assertEquals(Color.YELLOW, aCube.getColor(Face.YELLOW, Row.FIRST, Column.FIRST));
		assertEquals(Color.RED, aCube.getColor(Face.YELLOW, Row.SECOND, Column.FIRST));
		assertEquals(Color.ORANGE, aCube.getColor(Face.YELLOW, Row.THIRD, Column.SECOND));
	}

	private void assertWhiteFaceIsSet(Cube aCube) {
		assertEquals(Color.BLUE, aCube.getColor(Face.WHITE, Row.FIRST, Column.THIRD));
		assertEquals(Color.GREEN, aCube.getColor(Face.WHITE, Row.SECOND, Column.THIRD));
		assertEquals(Color.WHITE, aCube.getColor(Face.WHITE, Row.THIRD, Column.FIRST));
	}

}
