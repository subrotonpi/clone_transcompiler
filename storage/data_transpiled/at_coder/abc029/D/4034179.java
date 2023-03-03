public static void print ( ) {
  int N = input ( ) ;
  int ans = 0 ;
  int k = 1 ;
  while ( k <= N ) {
    ans += N / ( k * 10 ) * k ;
    ans += Math . max ( 0 , Math . min ( k , N % ( k * 10 ) - k + 1 ) ) ;
    k *= 10 ;
  }
  System . out . println ( ans ) ;
}
