static final String getSumOfDigits ( int N ) {
  int end = ( int ) input . nextInt ( ) ;
  int ans = ( - 1 ) * N ;
  int squareRoot = ( int ) Math . sqrt ( N ) ;
  if ( squareRoot * squareRoot == N ) {
    end = squareRoot ;
    ans -= squareRoot ;
  }
  else {
    end = squareRoot + 1 ;
  }
  for ( int i = 1 ;
  i < end ;
  i ++ ) {
    if ( N % i == 0 ) {
      ans += ( N / i + i ) ;
    }
  }
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
