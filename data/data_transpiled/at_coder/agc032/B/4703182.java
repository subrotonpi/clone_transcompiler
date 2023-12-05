public static void print ( int N ) {
  int [ ] X = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = 0 ;
  }
  if ( N % 2 == 0 ) {
    for ( int i = 0 ;
    i < N / 2 ;
    i ++ ) {
      X [ i ] = i + 1 ;
      X [ X . length - i - 1 ] = i + 1 ;
    }
  }
  else {
    for ( int i = 0 ;
    i < N / 2 ;
    i ++ ) {
      X [ i ] = i + 1 ;
      X [ X . length - i - 2 ] = i + 1 ;
    }
    X [ X . length - 1 ] = N / 2 + 1 ;
  }
  ArrayList < Point > edge = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( i <= j ) continue ;
      if ( X [ i ] != X [ j ] ) {
        edge . add ( new Point ( i + 1 , j + 1 ) ) ;
      }
    }
  }
  System . out . println ( edge . size ( ) ) ;
  for ( Point line : edge ) {
    int x = line . x ;
    int y = line . y ;
    System . out . println ( x + " " + y ) ;
  }
}
