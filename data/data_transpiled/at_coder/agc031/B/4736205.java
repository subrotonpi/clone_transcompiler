static final int MOD = 1000000007 ;
final int MAX_N = 200000 ;
{
  int [ ] last = new int [ MAX_N ] ;
  Arrays . fill ( last , - 1 ) ;
  List < Pair > pairs = new ArrayList < Pair > ( ) ;
  for ( int i = 0 ;
  i < C . length ;
  i ++ ) {
    int c = C [ i ] ;
    try {
      int prev = last [ c - 1 ] ;
      if ( prev >= 0 && prev < i - 1 ) {
        pairs . add ( new Pair ( prev , i ) ) ;
      }
      last [ c - 1 ] = i ;
    }
    catch ( Exception e ) {
      if ( c >= N ) return 0 ;
      else throw new Exception ( e ) ;
    }
  }
  Collections . sort ( pairs ) ;
  int [ ] count = new int [ N ] ;
  Arrays . fill ( count , 1 ) ;
  int idx = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( i > 0 ) {
      count [ i ] += count [ i - 1 ] ;
      count [ i ] %= MOD ;
    }
    while ( idx < pairs . size ( ) && pairs . get ( idx ) . first == i ) {
      count [ pairs . get ( idx ) . second ] += count [ i ] ;
      count [ pairs . get ( idx ) . second ] %= MOD ;
      idx ++ ;
    }
  }
  System . out . println ( count [ N - 1 ] ) ;
  return 0 ;
}
