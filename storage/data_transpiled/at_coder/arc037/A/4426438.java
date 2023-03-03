public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] m = list ( Integer . parseInt ( input ) ) ;
  int res = 0 ;
  for ( int i : m ) {
    if ( i < 80 ) {
      res += 80 - i ;
    }
  }
  System . out . println ( res ) ;
}
