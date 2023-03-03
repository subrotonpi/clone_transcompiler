public static int S ( ) {
  int a , b ;
  for ( int i = 0 ;
  i < S . length - 1 ;
  i ++ ) {
    a = S [ i ] ;
    b = S [ i + 1 ] ;
    if ( a == b ) {
      System . out . println ( i + 1 , i + 3 ) ;
      exit ( ) ;
    }
  }
  return - 1 ;
}
