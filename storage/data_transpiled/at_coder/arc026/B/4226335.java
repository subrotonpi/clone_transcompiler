static final String getSummarine ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  int end = ( int ) Math . sqrt ( N ) ;
  if ( N == N ) {
    ans += ( N / i + i ) ;
  }
  ans -= N ;
  String output ;
  if ( ans == N ) {
    output = "Perfect" ;
  }
  else if ( ans > N ) {
    output = "Abundant" ;
  }
  else {
    output = "Deficient" ;
  }
  return output ;
}
