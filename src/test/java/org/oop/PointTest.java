package org.oop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.lang.Math.PI;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class PointTest {

    @Test
    @DisplayName("Two points with same x and y coordinates should have distance of zero")
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);
        Double expected = 0.0;

        Double distance = origin.distance(origin);

        assertThat(distance, is(equalTo(expected)));
    }


    @Test
    @DisplayName("Distance between origin and points on unit circle should be one")
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);
        Double expected = 1.0;

        Double distance = origin.distance(point1);
        Double distance1 = origin.distance(point2);

        assertThat(distance, is(equalTo(expected)));
        assertThat(distance1, is(equalTo(expected)));
    }

    @Test
    @DisplayName("Distance between two opposite points on unit circle should be two")
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);
        Double expected = 2.0;

        double distance = point1.distance(point2);

        assertThat(distance, is(equalTo(expected)));
    }

    @Test
    @DisplayName("Origin and point on positive x axis should be zero radians away")
    void originAndPointOnPositiveXAxisShouldBeZeroRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);
        Double expected = 0.0;

        double direction = origin.direction(point1);
        double direction1 = origin.direction(point2);

        assertThat(direction, is(equalTo(expected)));
        assertThat(direction1, is(equalTo(expected)));
    }


    @Test
    @DisplayName("Origin and point on negative x axis should be Pi radians away")
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);
        Double expected = PI;

        double direction = origin.direction(point1);
        double direction1 = origin.direction(point2);

        assertThat(direction, is(equalTo(expected)));
        assertThat(direction1, is(equalTo(expected)));
    }

    @Test
    @DisplayName("Origin and point on y axis should be half Pi radians away")
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);
        Double expected = PI / 2;

        double direction = origin.direction(point1);
        double direction1 = origin.direction(point2);

        assertThat(direction, is(equalTo(expected)));
        assertThat(direction1, is(equalTo(expected)));
    }
}
