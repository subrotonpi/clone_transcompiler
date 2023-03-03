private static String S ( ) {
  StringBuilder sb = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    sb . append ( i ) ;
  }
  int count = 0 ;
  if ( sb . charAt ( 0 ) == 'A' ) {
    count ++ ;
  }
  return sb . substring ( 1 , count ) ;
}
