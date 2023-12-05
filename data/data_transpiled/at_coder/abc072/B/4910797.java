public static String print ( ) {
  S = list ( input ( ) ) ;
  StringBuilder ss = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i <= S . length ( ) ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      ss . append ( S [ i ] ) ;
    }
  }
  return ss . toString ( ) ;
}
