static final String getSumOfSquares ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  int squareRoot = ( int ) Math . sqrt ( N ) ;
  int end = squareRoot * squareRoot == N ? squareRoot : squareRoot + 1 ;
  for ( int i = 1 ;
  i < end ;
  i ++ ) {
    if ( N % i == 0 ) {
      ans += ( N / i + i ) ;
    }
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
