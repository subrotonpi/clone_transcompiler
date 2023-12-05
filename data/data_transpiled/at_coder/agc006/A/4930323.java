public static void input ( ) {
  N = Integer . parseInt ( input ) ;
  s = input . nextLine ( ) ;
  t = input . nextLine ( ) ;
  int y = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    q = s . nextLine ( ) - ( i + 1 ) ;
    r = t . nextLine ( ) ;
    if ( q == r ) {
      x = q ;
      y = i + 1 ;
    }
  }
  System . out . println ( N * 2 - y ) ;
}
