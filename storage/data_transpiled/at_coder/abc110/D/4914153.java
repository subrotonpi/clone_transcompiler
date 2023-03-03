static public int [ ] soinsu ( int N ) {
  final int sqr = ( int ) Math . sqrt ( N ) ;
  final int [ ] lis = new int [ sqr + 2 ] ;
  for ( int i = 2 ;
  i <= sqr ;
  i ++ ) {
    while ( N % i == 0 ) {
      lis [ i ] = N / i ;
      N = N / i ;
    }
  }
  if ( ! N == 1 ) lis [ sqr + 1 ] = N ;
  return lis ;
}
