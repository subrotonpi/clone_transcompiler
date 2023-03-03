public static String print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    if ( a [ i ] % 2 == 1 ) {
      odd ++ ;
    }
  }
  return "YES" ;
}
