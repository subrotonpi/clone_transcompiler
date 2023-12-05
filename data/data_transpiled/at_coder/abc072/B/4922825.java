public static String print ( ) {
  A = input ( ) ;
  B = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      B . append ( A . charAt ( i ) ) ;
    }
    else {
      continue ;
    }
  }
  System . out . println ( "" + B ) ;
  return B . toString ( ) ;
}
