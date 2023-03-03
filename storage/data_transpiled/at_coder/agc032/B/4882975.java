public static String [ ] getStrings ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] ans = new String [ n ] ;
  int taboo = n % 2 != 0 ? n : n + 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    for ( int j = i + 1 ;
    j <= n ;
    j ++ ) {
      if ( i + j == taboo ) continue ;
      ans [ i ] = String . valueOf ( i ) + " " + String . valueOf ( j ) ;
    }
  }
  System . out . println ( ans . length ) ;
  System . out . println ( ( String [ ] ) ans . clone ( ) ) ;
  return ans ;
}
