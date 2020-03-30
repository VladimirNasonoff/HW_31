package core;

import static org.junit.Assert.*;
import org.junit.*;

public class CalcTest {

static double divide(double a, double b)                      {return a / b;}
static double divide(double a, double b, double c)            {return a / b / c;}
static double divide(double a, double b, double c, double d)  {return a / b / c / d;}
static double divide(double a, double b, double c, double d, double e)  {return a / b / c / d / e;}
static double divide(double a, double b, double c, double d, double e, double f)  {return a / b / c / d / e / f;}
static double divide(double a, double b, double c, double d, double e, double f, double g)  {return a / b / c / d / e / f / g;}

static double add(double a, double b)                          {return a + b;}
static double add(double a, double b, double c)                {return a + b + c;}
static double add(double a, double b, double c, double d)      {return a + b + c + d;}
static double add(double a, double b, double c, double d, double e)      {return a + b + c + d + e;}
static double add(double a, double b, double c, double d, double e, double f)      {return a + b + c + d + e + f;}
static double add(double a, double b, double c, double d, double e, double f, double g)      {return a + b + c + d + e + f + g;}

static double subtract(double a, double b)                     {return a - b;}
static double subtract(double a, double b, double c)           {return a - b - c;}
static double subtract(double a, double b, double c, double d) {return a - b - c - d;}
static double subtract(double a, double b, double c, double d, double e) {return a - b - c - d - e;}
static double subtract(double a, double b, double c, double d, double e, double f) {return a - b - c - d - e - f;}
static double subtract(double a, double b, double c, double d, double e, double f, double g) {return a - b - c - d - e - f -g;}

static double multiply(double a, double b)                     {return a * b;}
static double multiply(double a, double b, double c)           {return a * b * c;}
static double multiply(double a, double b, double c, double d) {return a * b * c * d;}
static double multiply(double a, double b, double c, double d, double e) {return a * b * c * d * e;}
static double multiply(double a, double b, double c, double d, double e, double f) {return a * b * c * d * e * f;}
static double multiply(double a, double b, double c, double d, double e, double f, double g) {return a * b * c * d * e * f * g;}

@Test
public void test_01() {assertEquals("Method divide is not correct", divide(90.0, 7.0), 12.9, 0.09);}
@Test
public void test_02() {assertEquals("Method divide is not correct", divide(44.0, 3.0), 14.6, 0.09);}
@Test
public void test_03() {assertEquals("Method divide is not correct", divide(37.0, 17.0), 2.1, 0.09);}
@Test
public void test_04() {assertEquals("Method divide is not correct", divide(90.0, 5.3), 16.9, 0.09);}
@Test
public void test_05() {assertEquals("Method divide is not correct", divide(96.0, 1.6), 60.0, 0.09);}
@Test
public void test_06() {assertEquals("Method divide is not correct", divide(57.5, 7.8), 7.3, 0.09);}

@Test // @Ignore
public void test_07() {assertEquals("Method add is not correct", add(60.0, 5.0, 7.0), 72.0, 0.09);}
@Test // @Ignore
public void test_08() {assertEquals("Method add is not correct", add(66.0, 3.0, 71.0), 140.0, 0.09);}
@Test // @Ignore
public void test_09() {assertEquals("Method add is not correct", add(3.0, 15.0, 5.0), 23.0, 0.09);}
@Test // @Ignore
public void test_10() {assertEquals("Method add is not correct", add(12.0, 83.0, 1.0), 96.0, 0.09);}
@Test // @Ignore
public void test_11() {assertEquals("Method add is not correct", add(3.0, 1.0, 77.0), 81.0, 0.09);}
@Test // @Ignore
public void test_12() {assertEquals("Method add is not correct", add(41.0, 15.0, 19.0), 75.0, 0.09);}

@Test // @Ignore
public void test_13() {assertEquals("Method subtract is not correct", subtract(100.0, 22.0), 78.0, 0.09);}
@Test // @Ignore
public void test_14() {assertEquals("Method subtract is not correct", subtract(100.0, 11.0), 89.0, 0.09);}
@Test // @Ignore
public void test_15() {assertEquals("Method subtract is not correct", subtract(120.0, 100.0), 20.0, 0.09);}
@Test // @Ignore
public void test_16() {assertEquals("Method subtract is not correct", subtract(47.0, 11.0), 36.0, 0.09);}
@Test // @Ignore
public void test_17() {assertEquals("Method subtract is not correct", subtract(19.0, 2.0), 17.0, 0.09);}
@Test // @Ignore
public void test_18() {assertEquals("Method subtract is not correct", subtract(180.0, 58.0), 122.0, 0.09);}

@Test // @Ignore
public void test_19() {assertEquals("Method multiply is not correct", multiply(9.0, 5.0, 2.0), 90.0, 0.09);}
@Test // @Ignore
public void test_20() {assertEquals("Method multiply is not correct", multiply(4.0, 4.0, 8.0), 128.0, 0.09);}
@Test // @Ignore
public void test_21() {assertEquals("Method multiply is not correct", multiply(19.0, 15.0, 12.0), 3420.0, 0.09);}
@Test // @Ignore
public void test_22() {assertEquals("Method multiply is not correct", multiply(7.0, 24.0, 9.0), 1512.0, 0.09);}
@Test // @Ignore
public void test_23() {assertEquals("Method multiply is not correct", multiply(3.0, 7.0, 1.0), 21.0, 0.09);}
@Test // @Ignore
public void test_24() {assertEquals("Method multiply is not correct", multiply(8.0, 34.0, 6.0), 1632.0, 0.09);}
}