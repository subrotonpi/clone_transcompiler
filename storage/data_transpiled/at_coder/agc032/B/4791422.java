public static String [ ] getans ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  int ban = N % 2 != 0 ? N : N + 1 ;
  String [ ] ans = new String [ N ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    for ( int j = i + 1 ;
    j <= N ;
    j ++ ) {
      if ( i + j == ban ) continue ;
      ans [ i ] = String . valueOf ( i ) + " " + String . valueOf ( j ) ;
    }
  }
  System . out . println ( ans . length ) ;
  System . out . println ( ( String [ ] ) ans . clone ( ) ) ;
  return ans ;
}
