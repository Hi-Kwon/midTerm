package midTerm;

public class enemies
	{
		String name;
		int health;
		int damage;
		public enemies(String n, int h, int d)
		{
			name = n;
			health = h;
			damage = d;
		}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public int getHealth()
			{
				return health;
			}
		public void setHealth(int health)
			{
				this.health = health;
			}
		public int getDamage()
			{
				return damage;
			}
		public void setDamage(int damage)
			{
				this.damage = damage;
			}

	}
