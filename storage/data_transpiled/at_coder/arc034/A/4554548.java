public static int c ( ) {
  int c = 0 ;
  for ( int i = 0 ;
  i < Integer . parseInt ( input . nextLine ( ) ) ;
  i ++ ) {
    int [ ] a = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    c = Math . max ( c , Integer . valueOf ( a [ 4 ] ) - a [ 4 ] * 790 / 900 ) ;
  }
  return c ;
}
