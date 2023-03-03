public static int [ ] getDistance ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] d = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    d [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  Arrays . sort ( d ) ;
  int counter = 1 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    if ( d [ i ] - d [ i + 1 ] != 0 ) {
      counter ++ ;
    }
  }
  System . out . println ( counter ) ;
  return d ;
}
