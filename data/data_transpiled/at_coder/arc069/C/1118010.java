public static int [ ] readIntRange ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int t = A [ 0 ] ;
  List < Integer > indices = new ArrayList < > ( ) ;
  List < Integer > list = new ArrayList < > ( ) ;
  list . add ( t ) ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( A [ i ] > t ) {
      t = A [ i ] ;
      indices . add ( i ) ;
      list . add ( t ) ;
    }
  }
  int M = list . size ( ) ;
  int [ ] delta = new int [ M - 1 ] ;
  for ( int i = 0 ;
  i < M - 1 ;
  i ++ ) delta [ i ] = list . get ( 0 ) ;
  delta [ i + 1 ] = list . get ( i + 1 ) - list . get ( i ) ;
  int [ ] temp = new int [ M ] ;
  int [ ] count = new int [ M ] ;
  synchronized ( temp ) {
    for ( int a : A ) {
      int p = temp . length ;
      count [ p ] += a - list . get ( p ) ;
      temp [ p ] ++ ;
    }
  }
  int t = 0 ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    t += temp [ i ] ;
    temp [ i ] = t ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) count [ i ] += temp [ i ] * delta [ i ] ;
  int [ ] result = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int c = indices . get ( i ) ;
    result [ i ] = c ;
  }
  for ( int r : result ) {
    System . out . println ( r ) ;
  }
  return result ;
}
