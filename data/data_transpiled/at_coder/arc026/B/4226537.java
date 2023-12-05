static final int N = Integer . parseInt ( input ) ;
int ans = ( - 1 ) * N ;
int squareRoot = ( int ) Math . sqrt ( N ) ;
int end ;
if ( squareRoot * squareRoot == N ) {
  end = squareRoot ;
  ans -= squareRoot ;
}
else {
  end = squareRoot + 1 ;
}
return ans ;
}
