public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  char [ ] [ ] grid = new char [ 100 ] [ 50 ] ;
  for ( int i = 0 ;
  i < grid . length ;
  i ++ ) {
    grid [ i ] [ 0 ] = '#' ;
  }
  A -- ;
  B -- ;
  for ( int i = 0 ;
  i < 43 ;
  i += 2 ) {
    for ( int j = 0 ;
    j < 100 ;
    j += 2 ) {
      if ( A <= 0 ) break ;
      grid [ j ] [ i ] = '.' ;
      A -- ;
    }
  }
  for ( int i = 66 ;
  i < 100 ;
  i += 2 ) {
    for ( int j = 0 ;
    j < 100 ;
    j += 2 ) {
      if ( B <= 0 ) break ;
      grid [ j ] [ i ] = '#' ;
      B -- ;
    }
  }
  System . out . println ( 100 + " " + grid [ 0 ] [ 0 ] ) ;
  for ( int i = 0 ;
  i < 100 ;
  i ++ ) {
    System . out . println ( new String ( grid [ i ] ) ) ;
  }
  return A ;
}
