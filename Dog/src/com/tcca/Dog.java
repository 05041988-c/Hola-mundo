package com.tcca;

public class Dog {

	private int weight;
	private int loudness;
	private String barkNoise;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
		
			public void bark(String b){
			System.out.println(b);
			}
			public static void bark(){
			System.out.println("Woof");
			}
			//		
		public Dog(){
			setWeight(12);
			setLoudness(4);
			setBarkNoise("Woof");
			}
			public Dog(int w, int l){
			setWeight(w);
			setLoudness(l);
			setBarkNoise("ARF!");
			}
			public Dog(int w, int l, String bark){
			setWeight(w);
			setLoudness(l);
			setBarkNoise(bark);
			
			}

			public int getWeight() {
				return weight;
			}

			public void setWeight(int weight) {
				this.weight = weight;
			}

			public int getLoudness() {
				return loudness;
			}

			public void setLoudness(int loudness) {
				this.loudness = loudness;
			}

			public String getBarkNoise() {
				return barkNoise;
			}

			public void setBarkNoise(String barkNoise) {
				this.barkNoise = barkNoise;
			}
			
			
	

	}


