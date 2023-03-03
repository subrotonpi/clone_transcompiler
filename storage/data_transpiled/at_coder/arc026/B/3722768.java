static final int N = input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = - N ;
  int N_sqrt = ( int ) Math . sqrt ( N ) ;
  for ( int i = 1 ;
  i <= N_sqrt ;
  i ++ ) {
    if ( N % i == 0 ) {
      ans += i + N / i ;
    }
  }
  if ( N_sqrt * N_sqrt == N ) {
    ans -= N_sqrt ;
  }
  if ( ans < N ) {
    System . out . println ( "Deficient" ) ;
  }
  else if ( ans == N ) {
    System . out . println ( "Perfect" ) ;
  }
  else {
    System . out . println ( "Abundant" ) ;
  }
  return ans ;
}
