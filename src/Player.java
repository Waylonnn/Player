public class Player {
    private int numPlayers;
    private int x;
    private int y;
    private int z;
    private int direction;
    private int hp;
    private String name;

    public Player(){
        numPlayers++;
        x = 0;
        y = 0;
        z = 0;
        direction = 1;
        hp = 20;
        name = ("P" + getNumPlayers());
    }
    public Player(String name, int x, int y, int z){
        numPlayers++;
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
        direction = 1;
        hp = 20;
    }
    public Player(String name, int x, int y, int z, int hp, int direction){
        numPlayers++;
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
        this.direction = direction;
        this.hp = hp;
    }
    public int getNumPlayers(){
        return numPlayers;
    }
    public String getName(){
        return name;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getZ(){
        return z;
    }
    public int getHP(){
        return hp;
    }
    public int getDirection(){
        return direction;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
    public void setDirection(int dir){
        direction = dir;
    }
    public void move(int dir, int units){
        if(dir == 1)
            x += units;
        else if (dir == 2)
            x -= units;
        else if (dir == 3)
            y += units;
        else if (dir == 4)
            y -= units;
        else if (dir == 5)
            z += units;
        else
            z -= units;
    }
    public void teleport(Player player){
        x = player.getX();
        y = player.getY();
        z = player.getZ();
    }
    public void teleport(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void attack(Player player, int damage){
        player.setHp(player.getHP() - damage);
        setHp(getHP() + damage/2);
    }
    public String toString(){
        return ("Name: " + name + "\nHealth: " + hp + "\nCoordinates: " + "X " + x + "Y " + y + "Z " + z + "\nDirection: " + direction);
    }

    public double getDistance(int x, int y, int z){
        return Math.sqrt((Math.pow(this.x - x, 2)) + (Math.pow(this.y - y, 2)) + (Math.pow(this.z - z, 2)));
    }

    public double getDistance(Player player){
        return Math.sqrt((Math.pow(this.x - player.getX(), 2)) + (Math.pow(this.y - player.getY(), 2)) + (Math.pow(this.z - player.getZ(), 2)));
    }
}
