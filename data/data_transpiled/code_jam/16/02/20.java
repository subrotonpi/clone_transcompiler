public static int T = Integer . parseInt ( input ) {
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    String s = input . next ( ) + '+' ;
    int ans = 0 ;
    for ( int j = 0 ;
    j < s . length ( ) - 1 ;
    j ++ ) {
      if ( s . charAt ( j ) != s . charAt ( j + 1 ) ) ans ++ ;
    }
    System . out . println ( "Case #" + ( i + 1 ) + ": " + ans ) ;
  }
  return T ;
}
