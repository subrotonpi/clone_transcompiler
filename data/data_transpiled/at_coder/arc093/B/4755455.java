public static void print ( int a , int b ) {
  int [ ] [ ] grid = new int [ a ] [ b ] ;
  for ( int i = 0 ;
  i < grid . length ;
  i ++ ) {
    grid [ i ] [ 0 ] = '#' ;
    grid [ i ] [ 1 ] = '.' ;
    grid [ i ] [ 2 ] = '#' ;
  }
  for ( int i = 0 ;
  i < grid . length ;
  i ++ ) {
    grid [ i ] [ 0 ] = '#' ;
    grid [ i ] [ 1 ] = '.' ;
  }
  for ( int i = 0 ;
  i < grid . length ;
  i ++ ) {
    grid [ i ] [ 0 ] = '#' ;
    grid [ i ] [ 1 ] = '#' ;
  }
  for ( int i = 0 ;
  i < grid . length ;
  i ++ ) {
    grid [ i ] [ 0 ] = '#' ;
    grid [ i ] [ 1 ] = '.' ;
  }
  for ( int i = 0 ;
  i < grid . length ;
  i ++ ) {
    grid [ i ] [ 0 ] = '#' ;
    grid [ i ] [ 1 ] = '#' ;
    grid [ i ] [ 2 ] = '#' ;
  }
  System . out . println ( 100 + " " + 100 ) ;
  for ( int g : grid ) {
    System . out . print ( ( char ) g ) ;
  }
}
