public static void print ( int N ) {
  int S = input ( ) ;
  int ans = 0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    ans = Math . max ( ans , new HashSet < > ( S . subList ( 0 , i ) ) . size ( ) & new HashSet < > ( S . subList ( i , i ) ) . size ( ) ) ;
  }
  System . out . println ( ans ) ;
}
