public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] stand = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    stand [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int res = 0 ;
  for ( int [ ] t : temp ) {
    int ans = 0 ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) ans += stand [ i ] * t [ i ] ;
    if ( ans + C > 0 ) res ++ ;
  }
  System . out . println ( res ) ;
  return res ;
}
