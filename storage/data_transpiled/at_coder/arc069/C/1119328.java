public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] a = Integer . parseInt ( input ) ;
  int [ ] [ ] b = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    b [ i ] = new int [ ] {
      a [ i ] , i , 0 }
      ;
    }
    Arrays . sort ( b , new Comparator < int [ ] > ( ) {
      public int compare ( int [ ] o1 , int [ ] o2 ) {
        return ( - o1 [ 0 ] ) - ( o2 [ 1 ] ) ;
      }
    }
    ) ;
    int mini = 0 ;
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      if ( b [ i ] [ 1 ] < b [ mini ] [ 1 ] ) {
        mini = i ;
      }
      b [ mini ] = b [ mini ] [ 0 ] ;
      b [ mini ] = b [ mini ] [ 1 ] ;
      b [ mini ] = b [ mini ] [ 2 ] + ( b [ i ] [ 0 ] - b [ i + 1 ] [ 0 ] ) * ( i + 1 ) ;
    }
    if ( b [ N - 1 ] [ 1 ] < b [ mini ] [ 1 ] ) {
      mini = N - 1 ;
    }
    b [ mini ] = b [ mini ] [ 0 ] ;
    b [ mini ] = b [ mini ] [ 1 ] ;
    b [ mini ] = b [ mini ] [ 2 ] + ( b [ N - 1 ] [ 0 ] ) * N ;
    Arrays . sort ( b , new Comparator < int [ ] > ( ) {
      public int compare ( int [ ] o1 , int [ ] o2 ) {
        return o1 [ 1 ] - o2 [ 0 ] ;
      }
    }
    ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      System . out . println ( b [ i ] [ 2 ] ) ;
    }
  }
  