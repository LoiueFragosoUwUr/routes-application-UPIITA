
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author biosh
 */

public class CaminoMinimo {
private int [][] Pesos;
private int [] ultimo;
private int [] D;
public String la_ruta=new String();      
private boolean [] F;
private int s, n;// vértice origen y número de vértices
public  CaminoMinimo(GrafMatPeso gp, int origen)
{
    n = gp.numeroDeVertices();
    s = origen;
    Pesos = gp.matPeso;
    ultimo = new int [n];
    D = new int [n];
    F = new boolean [n];
}    

public void caminoMinimos(){// valores iniciales
    for (int i = 0; i < n; i++)
    {
        F[i] = false;
        D[i] = Pesos[s][i];
        ultimo[i] = s;
    }
    F[s] = true; 
    D[s] = 0;
// Pasos para marcar los n-1 vértices

for (int i = 1; i < n; i++)
{
    int v = minimo();
    F[v] = true;
/* selecciona vértice no marcado de menor distancia */
// actualiza distancia de vértices no marcados 
for (int w = 1; w < n; w++)
    if (!F[w])
        if ((D[v] + Pesos[v][w]) < D[w])
        {
            D[w] = D[v] + Pesos[v][w];
            ultimo[w] = v;
        }
}
}
private int minimo()
{
    int mx = GrafMatPeso.INFINITO;
    int v = 1;
    for (int j = 1; j < n; j++)
        if (!F[j] && (D[j]<= mx))
        {
            mx = D[j];
            v = j;
        }
    return v;
}
public String recuperaCamino(int v){
       da_peso matriz_salones=new da_peso();
        ArrayList<Integer> salones= new ArrayList<>();
        String cadena_a_retornar=new String();
       cadena_a_retornar=("");
        salones=matriz_salones.recibimos_array_list_de_salones();
    int anterior = ultimo[v];

if (v != s)
{
 recuperaCamino(anterior);
 // vuelve al último del último
 System.out.print(" -> V salon "/* + v+*/+" "+salones.get(v));
  setLa_ruta(getLa_ruta()+" -> V salon "/* + v+*/+" "+salones.get(v));   
}else
{
    System.out.print("V salon "/* + s+*/+" "+salones.get(s));
    setLa_ruta(getLa_ruta()+" -> V salon "/* + v+*/+" "+salones.get(v));
}

return  cadena_a_retornar= getLa_ruta();
}



    public static void main(String[] args) 
    {   
        da_peso matriz_salones=new da_peso();
         ArrayList<Integer> salones= new ArrayList<>();
        salones=matriz_salones.recibimos_array_list_de_salones();
        algortimo matriz_ady =new algortimo();
        int [][] de_matriz_a_vertices=new int [131][131];
         int num_vertices=131;
         GrafMatPeso gra =new GrafMatPeso(num_vertices);

        de_matriz_a_vertices=matriz_ady.devuelve();
            /*crear vertices*/
        for (int i = 0; i < 131; i++)
        {
        gra.nuevoVertice(salones.get(i));
        //System.out.println(gra.numVertice(i));
        }
        
        
        /*generar arcos entre ellos*/
            
           
        for (int i = 0; i < 131; i++) 
        {
            for (int j = 0; j < 131; j++)
            {
                if (de_matriz_a_vertices[i][j]!=0&&de_matriz_a_vertices[i][j]!=de_matriz_a_vertices[j][i])
                {   
                    /*creamos enlace dirigido*/
                    gra.nuevoArco(salones.get(i),salones.get(j), de_matriz_a_vertices[i][j]);
                 }else if (de_matriz_a_vertices[i][j]!=0&&de_matriz_a_vertices[i][j]==de_matriz_a_vertices[j][i]) 
                {
                    /*creamos enlace bidireccional*/
                 gra.nuevoArco(salones.get(i),salones.get(j), de_matriz_a_vertices[i][j]);
                 gra.nuevoArco(salones.get(j), salones.get(i), de_matriz_a_vertices[j][i]);
                }
            }
        }
    int origen =0;
      CaminoMinimo nuevo =new CaminoMinimo(gra,origen);
    nuevo.caminoMinimos();
    int destino=60;
    nuevo.recuperaCamino(destino);
    }

    /**
     * @return the la_ruta
     */
    public String getLa_ruta() {
        return la_ruta;
    }

    /**
     * @param la_ruta the la_ruta to set
     */
    public void setLa_ruta(String la_ruta) {
        this.la_ruta = la_ruta;
    }
} 
