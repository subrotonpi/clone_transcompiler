@ Nonnull public static LinkedHashMap < Integer , Integer > getGraph ( ) {
  class Graph {
    private final HashMap < Integer , Integer > graph ;
    {
      this . graph = new HashMap < Integer , Integer > ( ) ;
    }
    public int size ( ) {
      return graph . size ( ) ;
    }
    public void addEdge ( int a , int b , int w ) {
      graph . put ( a , new Integer ( b ) ) ;
    }
    public Set < Integer > getNodes ( ) {
      return graph . keySet ( ) ;
    }
  }
  class Dijkstra {
    private final HashMap < Integer , Integer > g ;
    {
      this . g = graph ;
      dist = new HashMap < Integer , Integer > ( ) {
        {
          this . dist . put ( s , 0 ) ;
        }
      }
      ;
      prev = new HashMap < Integer , Integer > ( ) {
        {
          this . x = 0 ;
          this . y = 0 ;
        }
      }
      ;
    }
    public int x = 0 ;
    int y = 0 ;
    private final PriorityQueue < Integer > Q = new PriorityQueue < Integer > ( ) {
      private static final long serialVersionUID = - 59258744692587L ;
      @ Override public void add ( Integer x , Integer y ) {
        super . add ( x , y ) ;
      }
    }
    ;
    private PriorityQueue < Integer > dist = new PriorityQueue < Integer > ( ) {
      private static final long serialVersionUID = - 59258744692587L ;
      @ Override public Integer add ( Integer x , Integer y ) {
        return x ;
      }
    }
    ;
    private PriorityQueue < Integer > dist = new PriorityQueue < Integer > ( ) {
      private static final long serialVersionUID = 59258744692587L ;
      @ Override public Integer add ( Integer x , Integer y ) {
        return x ;
      }
    }
    ;
    private PriorityQueue < Integer > dist = new PriorityQueue < Integer > ( ) {
      private static final long serialVersionUID = 59258744692587L ;
      @ Override public Integer add ( Integer x , Integer y ) {
        return x ;
      }
    }
    ;
    private PriorityQueue < Integer > dist = new PriorityQueue < Integer > ( ) {
      private static final long serialVersionUID = 59258744692587L ;
      @ Override public Integer add ( Integer x , Integer y ) {
        return x ;
      }
    }
    ;
    private PriorityQueue < Integer > dist = new PriorityQueue < Integer > ( ) {
      private static final long serialVersionUID = 59258744692587L ;
      @ Override public Integer add ( Integer x , Integer y ) {
        return x ;
      }
    }
    ;
  }
  public static void s_d ( Graph goal ) {
    return dist ;
    