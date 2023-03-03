public static int a ( ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int s = 1 ;
  int c = 0 ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    s += ( input . charAt ( i ) == '+' ) ;
    s -= ( input . charAt ( i ) == '-' ) ;
    if ( s == b + 1 ) {
      c ++ ;
      s = 1 ;
    }
  }
  System . out . println ( c ) ;
  return c ;
}
