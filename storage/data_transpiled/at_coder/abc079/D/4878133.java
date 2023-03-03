@ GwtIncompatible ( "collections" ) public static void main ( final String [ ] args ) {
  final List < Integer > asList = Lists . newArrayList ( Integer . parseInt ( input ( args ) ) ) ;
  class Graph implements Collection < Graph > {
    {
      final Graph graph = new Graph ( ) ;
      @ Override public int size ( ) {
        return graph . size ( ) ;
      }
      @ Override public void addEdge ( int a , int b , int w ) {
        graph . addEdge ( a , b , w ) ;
      }
      @ Override public Set < Node > getNodes ( ) {
        return graph . keySet ( ) ;
      }
    }
    ;
  }
  class Dijkstra implements LinkedList < DijkstraEdge > {
    private final Graph g = new Graph ( ) ;
    private final HashMap < Node , Integer > dist = new HashMap < Node , Integer > ( ) ;
    private final HashMap < Node , Integer > dist = new HashMap < Node , Integer > ( ) ;
    private final HashMap < Node , Integer > prev = new HashMap < Node , Integer > ( ) ;
    private final PriorityQueue < Node > Q = new PriorityQueue < Node > ( ) ;
    private final Dijkstra stra ( Graph graph , int s ) {
      final Graph g = graph . getGraph ( ) ;
      dist . put ( s , Double . MAX_VALUE ) ;
      dist . put ( s , 0 ) ;
      prev . put ( s , null ) ;
      Q . add ( g . get ( u ) ) ;
      while ( Q . size ( ) > 0 ) {
        final int distU = Q . poll ( ) ;
        final int u = g . get ( u ) ;
        if ( dist . get ( u ) < distU ) continue ;
        for ( int v = 0 ;
        v < g . size ( ) ;
        v ++ ) {
          final int w = g . get ( v ) ;
          final int alt = distU + w ;
          if ( dist . get ( v ) > alt ) {
            dist . put ( v , alt ) ;
            prev . put ( v , u ) ;
            Q . add ( g . get ( v ) ) ;
          }
        }
      }
    }
    private final HashMap < Node , Integer > s_d ( final Node goal ) {
      return dist . get ( goal ) ;
    }
    private final HashMap < Node , Integer > s_p ( final Node goal ) {
      final ArrayList < Node > path = new ArrayList < Node > ( ) ;
      Node node = goal ;
      while ( node != null ) {
        path . add ( node ) ;
        node = prev . get ( node ) ;
      }
      return path .