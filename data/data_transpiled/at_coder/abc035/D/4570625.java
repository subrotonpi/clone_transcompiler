@ GwtIncompatible ( "java.util.concurrent.atomic.LinkedList" ) public static int [ ] [ ] graph ( int N ) {
  class Graph {
    int N ;
    int [ ] Edges , T , ans ;
    Edges = new int [ N ] [ N ] , ans ;
    revEdges = new int [ N ] [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) ans = max ( ( T - dist1 [ i ] ) * A [ i ] , ans ) ;
  }
  class Graph {
    int N = 0 ;
    int [ ] Edges = new int [ N ] , T = 0 ;
    int [ ] revEdges = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      Edges [ i ] [ 0 ] = t ;
      revEdges [ i ] [ 0 ] = c ;
    }
  }
  {
    int [ ] dist = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) dist [ i ] = 10 * 20 ;
    dist [ s ] = 0 ;
    int [ ] h = new int [ N ] ;
    heapify ( h , 0 , s ) ;
    while ( ( h = heapify ( h , 0 , s ) ) != null ) {
      int [ ] p = new int [ h . length ] ;
      int dv = p [ 0 ] , v = p [ 1 ] ;
      if ( dv > dist [ v ] ) continue ;
      for ( int i = 0 ;
      i < Edges [ v ] . length ;
      i ++ ) {
        int u = Edges [ v ] [ i ] [ 0 ] ;
        int cost = Edges [ v ] [ i ] [ 1 ] ;
        if ( dv + cost < dist [ u ] ) {
          dist [ u ] = dv + cost ;
          heapify ( h , dist , u ) ;
        }
      }
    }
    return dist ;
  }
  void Rev_Dijkstra ( int N , int M , T ) {
    int [ ] dist = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) dist [ i ] = 10 * 20 ;
    dist [ s ] = 0 ;
    h = new int [ N ] ;
    heapify ( h , 0 , s ) ;
    while ( ( h = heapify ( h , 0 , s ) ) != null ) {
      int [ ] p = new int [ M ] ;
      int dv = p [ 0 ] , v = p [ 1 ] ;
      if ( dv > dist