static private int gethighest ( int t ) {
  final int n = t / 3 ;
  final int k = t % 3 ;
  if ( n == 0 ) {
    return Math . min ( 1 , k ) ;
  }
  else if ( n == 10 ) {
    return 10 ;
  }
  else if ( n == 9 ) {
    return n + ( k != 0 ? 10 : 0 ) ;
  }
  else {
    return n + ( k != 0 ? 1 : 0 ) + ( k == 2 ? 1 : 0 ) ;
  }
  /* work */
  final LinkedList < Integer > list = new LinkedList < Integer > ( ) ;
  final int N = list . getFirst ( ) ;
  final int S = list . getSecond ( ) ;
  final int p = list . getFirst ( ) ;
  final int T = list . getLast ( ) ;
  assert ( T == N ) ;
  int BH = 0 ;
  int OH = 0 ;
  int BL = 0 ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    final int nh = gethighest ( T ) ;
    final int sh = list . getLast ( ) ;
    if ( nh >= p ) {
      BH ++ ;
    }
    else if ( sh >= p ) {
      OH ++ ;
    }
    else {
      BL ++ ;
    }
  }
  return ( BH + Math . min ( OH , S ) ) ;
}
