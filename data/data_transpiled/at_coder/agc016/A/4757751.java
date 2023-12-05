public static void input ( ) {
  int N = S . length ( ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    Set s = new HashSet ( ) ;
    for ( int j = 0 ;
    j < N + 1 - i ;
    j ++ ) {
      s . retainAll ( S . subList ( j , j + i ) ) ;
      if ( s . isEmpty ( ) ) break ;
    }
  }
  System . out . println ( i - 1 ) ;
}
