public static int N ( ) {
  int [ ] A = Integer . parseInt ( input ( ) ) ;
  int ans = 0 ;
  int chain = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( i == 0 ) {
      continue ;
    }
    else if ( A [ i ] == A [ i - 1 ] ) {
      chain ++ ;
    }
    else if ( A [ i ] != A [ i - 1 ] ) {
      ans += ( chain / 2 ) ;
      chain = 1 ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
