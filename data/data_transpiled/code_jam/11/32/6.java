@ VisibleForTesting static int solve ( String inputs ) {
  int L = inputs . length ( ) ;
  int t = inputs . charAt ( 0 ) ;
  int N = inputs . length ( ) ;
  int C = inputs . charAt ( 4 ) ;
  int [ ] cycle = inputs . substring ( 4 ) . toCharArray ( ) ;
  int [ ] dists = new int [ N ] ;
  for ( int i : xrange ( N ) ) dists [ i ] = cycle [ i % C ] ;
  double tmp = 0 ;
  double rest = 0 ;
  for ( int i : xrange ( N ) ) tmp += dists [ i ] ;
  if ( tmp > t * 0.5 ) {
    int start = i ;
    rest = tmp - t * 0.5 ;
    break ;
  }
  int result = Integer . highestOneBit ( dists . length * 2 ) ;
  dists = Arrays . copyOf ( dists , rest ) ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) result -= dists [ i ] ;
  return result ;
}
