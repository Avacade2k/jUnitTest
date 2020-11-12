package jUnitTest;

public class TestFunc {
	
	
		public long lowestLong(long a, long b) {
			return Math.min(a, b);
		}
		
		public float lowestFloat(float a, float b) {
			return Math.min(a, b);
		}
		
		public int lowestInt(int a, int b) {
			return Math.min(a, b);
		}
		
		public double lowestDouble(double a, double b) {
			return Math.min(a, b);
		}
		
		public int highestInt(int a, int b) {
			return Math.max(a, b);
		}
		
		public double highestDouble(double a, double b) {
			return Math.max(a, b);
		}
		
		public long highestLong(long a, long b) {
			return Math.max(a, b);
		}
		
		public double powCheck(double a, double b) {
			return Math.pow(a, b);
		}
		
		public int addInt(int a) {
			if(a < Integer.MAX_VALUE) ++a;
			return a;
		}
		
		public long addLong(long a) {
			if(a < Long.MAX_VALUE) ++a;
			return a;
		}
		
		public int subInt(int a) {
			if(a > Integer.MIN_VALUE) --a;
			return a;
		}
		
		public long subLong(long a) {
			if(a > Long.MIN_VALUE) --a;
			return a;
		}
		
		public double squareRootDouble(double a) {
			return Math.sqrt(a);
		}
		
		public double cubicRootDouble(double a) {
			return Math.cbrt(a);
		}
}
