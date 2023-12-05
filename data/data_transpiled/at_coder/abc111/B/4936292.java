public static int n = Integer . parseInt ( input ) {
  int x = n ;
  do {
    flag = false ;
    String firstS = Integer . toString ( x ) . substring ( 0 , 1 ) ;
    if ( Arrays . equals ( firstS , String . valueOf ( x ) ) ) {
      System . out . println ( x ) ;
      exit ( ) ;
    }
    x ++ ;
  }
  while ( x < n ) ;
  return x ;
}
