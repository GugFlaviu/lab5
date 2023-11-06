public class cub {
    private int latura;

    public void set_latura(int new_latura){
        this.latura=new_latura;
    }
    public int get_latura(){
        return latura;
    }
    public float Calculeaza_Aria(){
        float aria;
        aria=6*(latura*latura);
        return aria;
    }
    public float Calculeaza_Perimetru(){
        float perimetru;
        perimetru=12*latura;
        return perimetru;
    }
}
