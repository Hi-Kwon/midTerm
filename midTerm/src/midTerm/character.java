package midTerm;

public class character
	{
		String role;
		String weapons;
		int health;
		int damage;
		int option;
		public character(int o, String r, String w, int h , int d)
			{
				role = r;
				weapons = w;
				health = h;
				damage = d;
				option = o;
			}
		public String getRole()
			{
				return role;
			}
		public void setRole(String role)
			{
				this.role = role;
			}
		public String getWeapons()
			{
				return weapons;
			}
		public void setWeapons(String weapons)
			{
				this.weapons = weapons;
			}
		public int getDamage()
			{
				return damage;
			}
		public void setDamage(int damage)
			{
				this.damage = damage;
			}
		public int getHealth()
			{
				return health;
			}
		public void setHealth(int health)
			{
				this.health = health;
			}
		public int getOption()
			{
				return option;
			}
		public void setOption(int option)
			{
				this.option = option;
			}
		
		
	}
