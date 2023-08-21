package com.successStory.main.Dto;

public class IbdpResultFractionDto {

	
	    private int numerator;
	    private int denominator;

	    public IbdpResultFractionDto() {
	        // Default constructor
	    }

		public IbdpResultFractionDto(int numerator, int denominator) {
			super();
			this.numerator = numerator;
			this.denominator = denominator;
		}

		public int getNumerator() {
			return numerator;
		}

		public void setNumerator(int numerator) {
			this.numerator = numerator;
		}

		public int getDenominator() {
			return denominator;
		}

		public void setDenominator(int denominator) {
			this.denominator = denominator;
		}
	    
	    

	   	}

	

