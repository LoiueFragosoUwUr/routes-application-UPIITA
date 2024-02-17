import java.util.*; 
import java.lang.*; 
import java.io.*; 
/**
 *
 * @author biosh
 */
public class da_peso {

	public int minDistance(int dist[], Boolean sptSet[]) 
	{ 
		int min = Integer.MAX_VALUE, min_index = -1; 

		for (int v = 0; v < dist.length; v++) 
			if (sptSet[v] == false && dist[v] <= min) 
                        { 
				min = dist[v]; 
				min_index = v; 
			} 
		return min_index; 
	} 
	public int printSolution(int dist[],int array_largo,int source,int target) 
	{ 
                return dist[target];
	} 
	public int dijkstra(int graph[][], int source,int target) 
	{ 
            int peso_total=0;
	     int array_length=graph.length;	
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
			int u = minDistance(dist, sptSet); 
			sptSet[u] = true; 
			for (int v = 0; v < array_length; v++) 
                        {
                	if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
                                {
                                    dist[v] = dist[u] + graph[u][v]; 
                                } 
                        }
		} 
		return peso_total=printSolution(dist, array_length,source,target); 
	}
        public int recibimos_index_matriz (int num_ingresado_por_usuario)
        {
             int salones_nums[]=new int[]{100,101,102,103,104,105,106,110,111,112,113,114,115,116,120,121,122,123,124,125,126,911,921,931,81,82,200,201,202,203,204,205,206,210,211,212,213,214,215,216,220,221,222,223,224,225,226,912,922,932,300,303,304,305,306,310,311,312,313,314,315,316,320,321,322,323,324,325,326,913,923,933,400,401,402,403,404,405,406,410,411,412,413,414,415,416,420,421,422,423,424,425,426,914,924,934,500,501,502,503,504,505,506,507,510,511,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,915,925,935,70,60,65,91,92};                 
             ArrayList<Integer> salones_recibe_instruccion= new ArrayList<>();
             int index_dentro_de_array=0;
             for (int i = 0; i < salones_nums.length; i++)
             {
                salones_recibe_instruccion.add(i, salones_nums[i]);
             }
             return index_dentro_de_array=salones_recibe_instruccion.indexOf(num_ingresado_por_usuario);
        }
        public ArrayList<Integer> recibimos_array_list_de_salones ()
        {
             int salones_nums[]=new int[]{100,101,102,103,104,105,106,110,111,112,113,114,115,116,120,121,122,123,124,125,126,911,921,931,81,82,200,201,202,203,204,205,206,210,211,212,213,214,215,216,220,221,222,223,224,225,226,912,922,932,300,303,304,305,306,310,311,312,313,314,315,316,320,321,322,323,324,325,326,913,923,933,400,401,402,403,404,405,406,410,411,412,413,414,415,416,420,421,422,423,424,425,426,914,924,934,500,501,502,503,504,505,506,507,510,511,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,915,925,935,70,60,65,91,92};                 
             ArrayList<Integer> salones_en_array_list= new ArrayList<>();
             int index_dentro_de_array=0;
             for (int i = 0; i < salones_nums.length; i++)
             {
                salones_en_array_list.add(i, salones_nums[i]);
             }
             return salones_en_array_list;
        }
        
	public static void main(String[] args) 
	{ 
		algortimo recibimos_matriz_gran_nacion_chichimeca=new algortimo();
                int peso_final=0;
                da_peso t = new da_peso(); 
                int c=0;
                int source=0;
                int target=60;
		peso_final=t.dijkstra(recibimos_matriz_gran_nacion_chichimeca.devuelve(), source,target); 
                System.out.println(" la cantidad de tiempo del salon "+recibimos_matriz_gran_nacion_chichimeca.salones_nums[source]
                +" al salon "+recibimos_matriz_gran_nacion_chichimeca.salones_nums[target]+" es: "+peso_final);
	} 
} 