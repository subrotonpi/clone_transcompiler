public static int N ( ) {
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( ( i != N - 1 ) ) {
      if ( ( X < X ) && ( X < X ) && ( X < X ) && ( X < X ) ) ans += X - X ;
      else ans += T ;
    }
    else if ( i == N - 1 ) ans += T ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
