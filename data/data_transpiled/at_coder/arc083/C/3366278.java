public static HashMap < Integer , Boolean > solve ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] P = new int [ N ] ;
  int [ ] X = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P [ i ] = i ;
    X [ i ] = i ;
  }
  int [ ] [ ] V = new int [ N ] [ N ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    V [ P [ i ] - 1 ] [ 0 ] ++ ;
  }
  @ SuppressWarnings ( "unchecked" ) Queue < Integer > Open = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < V . length ;
  i ++ ) {
    if ( V [ i ] [ 0 ] == 0 ) {
      Open . add ( i ) ;
    }
  }
  while ( Open . size ( ) != 0 ) {
    int iv = Open . poll ( ) ;
    V = V [ iv ] ;
    if ( V [ 1 ] . size ( ) == 0 ) {
      System . out . println ( "IMPOSSIBLE" ) ;
      exit ( ) ;
    }
    V [ 3 ] = V [ 2 ] - Collections . max ( V [ 1 ] . keySet ( ) ) ;
    int u = P [ iv ] - 1 ;
    if ( u == - 1 ) {
      System . out . println ( "POSSIBLE" ) ;
      exit ( ) ;
    }
    V [ u ] [ 0 ] -- ;
    if ( V [ u ] [ 0 ] == 0 ) {
      Open . add ( u ) ;
    }
    V [ u ] [ 2 ] += X [ iv ] + V [ 3 ] ;
    HashMap < Integer , Boolean > newdic = new HashMap < Integer , Boolean > ( ) ;
    for ( Map . Entry < Integer , Boolean > entry : V [ u ] [ 1 ] . entrySet ( ) ) {
      if ( entry . getKey ( ) + X [ iv ] <= X [ u ] ) {
        newdic . put ( entry . getKey ( ) + X [ iv ] , true ) ;
      }
      if ( entry . getKey ( ) + v [ 3 ] <= X [ u ] ) {
        newdic . put ( entry . getKey ( ) + v [ 3 ] , true ) ;
      }
    }
    V [ u ] [ 1 ] = newdic ;
  }
  throw new IllegalArgumentException ( ) ;
}
