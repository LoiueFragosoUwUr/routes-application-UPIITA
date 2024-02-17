import java.util.ArrayList;
/**
 *
 * @author biosh
 */
public class algortimo {
       public ArrayList<Integer> salones_recibe_instruccion= new ArrayList<>();
	public int minDistance(int dist[], Boolean sptSet[],int tamanio_array) 
	{ 
		int min = Integer.MAX_VALUE, min_index = -1; 

		for (int v = 0; v < tamanio_array; v++) 
			if (sptSet[v] == false && dist[v] <= min) { 
				min = dist[v]; 
				min_index = v; 
			} 
		return min_index; 
	} 

	 public void printSolution(int dist[], int n,int tamanio_array) 
	{ 
		System.out.println("Vertex Distance from Source"); 
		for (int i = 0; i < tamanio_array; i++) 
	          // / if (true)
                  //  {
                    System.out.println(i + " tt " + dist[i]); 
                        
                    //}
	           
        } 

	public void dijkstra(int grafo_a_usar[][], int source,int target) 
	{ 
                int array_length=grafo_a_usar.length;
		int dist[] = new int[array_length]; 
                Boolean sptSet[] = new Boolean[array_length]; 

		for (int i = 0; i < array_length; i++) 
                { 
			dist[i] = Integer.MAX_VALUE; 
			sptSet[i] = false; 
		} 

		dist[source] = 0; 

		for (int count = 0; count < array_length - 1; count++)
                { 
			int u = minDistance(dist, sptSet,array_length); 

			sptSet[u] = true; 

			for (int v = 0; v < array_length; v++) 

				if (!sptSet[v] && grafo_a_usar[u][v] != 0 && 
				dist[u] != Integer.MAX_VALUE && dist[u] + grafo_a_usar[u][v] < dist[v]) 
			        dist[v] = dist[u] + grafo_a_usar[u][v]; 
		} 

		printSolution(dist, array_length,array_length); 
	} 
         public int[][] devuelve()
         {
                int nuevo [][] =new int[131][131];
                Grafo prueba = new Grafo();
                Grafo2 prueba2 = new Grafo2();
                 for (int i = 0; i < 66; i++) 
                {
                    for (int j = 0; j < 131; j++) 
                    {
                        nuevo[i][j]=prueba2.grafo_a_usar3[i][j];
                    }
                 } 
                for (int i = 66; i < 131; i++) 
                {
                    for (int j = 0; j < 131; j++) 
                    {
                        nuevo[i][j]=prueba.grafo_a_usar[i-66][j];
                    }
                 }
               // System.out.println(" 巨大なマトリクス");
             //  System.out.println(""); 
               for (int i = 0; i < 130; i++) 
                {
                    for (int j = 0; j < 131; j++) 
                    {
                        if (nuevo[i][j]!=0&&nuevo[i][j]==nuevo[j][i])
                        {
                       //    System.out.print("[@"+nuevo[i][j]+"]"/*+"("+i+","+j+") y"+"("+j+","+i+") "*/);   
                        }else
                        {
                            if (nuevo[i][j]!=0) 
                            {
                         //    System.out.print("[>"+nuevo[i][j]+"]");   
                            }
                            else
                            {
                       //  System.out.print("["+nuevo[i][j]+"]");   
                                
                            }
                        }
                    }
                   // System.out.println();
                 } 
               return nuevo;
          }
         int salones_nums[]=new int[]{100,101,102,103,104,105,106,110,111,112,113,114,115,116,120,121,122,123,124,125,126,911,921,931,81,82,200,201,202,203,204,205,206,210,211,212,213,214,215,216,220,221,222,223,224,225,226,912,922,932,300,303,304,305,306,310,311,312,313,314,315,316,320,321,322,323,324,325,326,913,923,933,400,401,402,403,404,405,406,410,411,412,413,414,415,416,420,421,422,423,424,425,426,914,924,934,500,501,502,503,504,505,506,507,510,511,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,915,925,935,70,60,65,91,92};                 
                
	public static void main(String[] args) 
	{      
                int salones_nums[]=new int[]{100,101,102,103,104,105,106,110,111,112,113,114,115,116,120,121,122,123,124,125,126,911,921,931,81,82,200,201,202,203,204,205,206,210,211,212,213,214,215,216,220,221,222,223,224,225,226,912,922,932,300,303,304,305,306,310,311,312,313,314,315,316,320,321,322,323,324,325,326,913,923,933,400,401,402,403,404,405,406,410,411,412,413,414,415,416,420,421,422,423,424,425,426,914,924,934,500,501,502,503,504,505,506,507,510,511,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,915,925,935,70,60,65,91,92};                 
                int nuevo [][] =new int[130][130];
                for (int i = 0; i < 131; i++)
                {
                    System.out.print(salones_nums[i]);
                }
                algortimo prueba=new algortimo();
                prueba.devuelve();
                //Shortest_path_algorithm prueba = new Shortest_path_algorithm(); 
                int source=1,target=6;
                for (int i = 0; i < salones_nums.length; i++) 
                { 
                  /*      prueba.getSalones_recibe_instruccion().add(i, salones_nums[i]);
                        System.out.println(prueba.getSalones_recibe_instruccion().get(i));
                    */     
                }
                
		//prueba.dijkstra(graph_2,source-1,target-1); 
	} 

    /**
     * @return the salones_recibe_instruccion
     */
    public ArrayList<Integer> getSalones_recibe_instruccion() {
        return salones_recibe_instruccion;
    }

    /**
     * @param salones_recibe_instruccion the salones_recibe_instruccion to set
     */
    public void setSalones_recibe_instruccion(ArrayList<Integer> salones_recibe_instruccion) {
        this.salones_recibe_instruccion = salones_recibe_instruccion;
    }

} 


