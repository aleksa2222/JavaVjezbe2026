 class Player{
		
		private int x;
		private int y;
		private int width;
		private int height;
		private int health;
		
		public Player(int x, int y, int width, int height, int health) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
			this.health = health;
		}
		
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}
		
		public int getWidth() {
			return width;
		}
		
		public int getHeight() {
			return height;
		}
		
		public int getHealth() {
			return health;
		}
		
		public void setX(int x) {
			this.x = x;
		}
		
		public void setY(int y) {
			this.y = y;
		}
		
		public void setWidth(int width) {
			this.width = width;
		}
		
		public void setHeight(int height) {
			this.height = height;
		}
		
		public void setHealth(int health) {
			if(this.health > 0) {
				this.health = health;
			}else {
				System.out.println("Mrtav si");
			}
			
		}
		
		
	}
 
 class Enemy{
	 
	 private int x;
	 private int y;
	 private int width;
	 private int height;
	 private int damage;
	 
	 public Enemy(int x, int y, int width, int height, int damage) {
		 this.x = x;
		 this.y = y;
		 this.width = width;
		 this.height = height;
		 this.damage = damage;
	 }
	 
	 public int getX() {
		 return x;
	 }
	 
	 public int getY() {
		 return y;
	 }
	 
	 public int getWidth() {
		 return width;
	 }
	 
	 public int getHeight() {
		 return height;
	 }
	 
	 public int getDamage() {
		 return damage;
	 }
	 
	 public void setX(int x) {
		 this.x = x;
	 }
	 
	 public void setY(int y) {
		 this.y = y;
	 }
	 
	 public void setWidth(int width) {
		 this.width = width;
	 }
	 
	 public void setHeight(int height) {
		 this.height = height;
	 }
	 
	 public void setDamage(int damage) {
		 this.damage = damage;
	 }
	 
	 
	 
 }

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
