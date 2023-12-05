public static Graph < Integer > createGraph ( int N ) {
  {
    int N = N ;
    Edges = new int [ N ] [ N ] ;
    int [ ] revEdges = new int [ N ] [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      Edges [ i ] [ i ] = new int [ N ] ;
    }
    Edges [ i ] = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      edges [ i ] [ i ] = new int [ N ] ;
    }
    Edges [ i ] = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      edges [ i ] [ i ] = new int [ N ] ;
    }
    Edges [ i ] = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      edges [ i ] [ i ] = new int [ N ] ;
    }
    Arrays . fill ( edges , 0 ) ;
    int [ ] dist = new int [ N ] , h = 0 ;
    HeapSort < Integer > swap = new HeapSort < Integer > ( ) ;
    while ( ( h = HeapSort . heapheapsort ( dist ) ) != null ) {
      int [ ] p = new int [ N ] ;
      int dv = p [ 0 ] , v = p [ 1 ] ;
      if ( dv > dist [ v ] ) continue ;
      for ( int i = 0 ;
      i < Edges [ v ] . length ;
      i ++ ) {
        int u = Edges [ v ] [ i ] [ 0 ] ;
        int cost = Edges [ v ] [ i ] [ 1 ] ;
        if ( dv + cost < dist [ u ] ) {
          dist [ u ] = dv + cost ;
          HeapSort < Integer > swap = new HeapSort < Integer > ( ) ;
        }
      }
    }
    return new Graph < Integer > ( N ) ;
  }
  int M = Integer . parseInt ( input ( ) ) ;
  int T = Integer . parseInt ( input ( ) ) ;
  Graph < Integer > g = new Graph < Integer > ( N ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    int c = Integer . parseInt ( input ( ) ) ;
    g . Append_Edge ( a - 1 , b - 1 , c ) ;
  }
  int dist1 = g . Dijkstra