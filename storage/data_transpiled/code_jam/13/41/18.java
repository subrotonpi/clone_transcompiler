static final void loadLibrary ( String ... args ) throws IOException {
  System . setProperty ( "java.library.path" , "/home/rishig/codejam/" ) ;
  @ SuppressWarnings ( "resource" ) final int d = ( o , e , N ) -> {
    final int t = ( 2 * N - ( e - o ) + 1 ) * ( e - o ) ;
    assert ! t % 2 ;
    return t / 2 ;
  }
  ;
  final int T = readInts ( in ) ;
  final int M = readInts ( in ) ;
  final int [ ] A = new int [ M ] ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    A [ i ] = readInts ( in ) ;
  }
  long actual = 0 ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    actual += d ( A [ i ] , N ) * A [ i ] ;
    actual = actual % 1000002013 ;
  }
  final SortedMap < Integer , Integer > elog = new TreeMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    A [ i ] = A [ i ] ;
  }
  for ( int i = 0 ;
  i < E ;
  i ++ ) {
    elog . put ( A [ i ] , N ) ;
  }
  final Set < Map . Entry < Integer , Integer >> ee = new TreeSet < Map . Entry < Integer , Integer >> ( elog . entrySet ( ) ) ;
  long total = 0 ;
  final Stack < Map . Entry < Integer , Integer >> stack = new Stack < Map . Entry < Integer , Integer >> ( ) ;
  for ( final Map . Entry < Integer , Integer > e : ee ) {
    final Integer stop = e . getKey ( ) ;
    final int p = e . getValue ( ) ;
    if ( p == 0 ) continue ;
    if ( p > 0 ) {
      stack . push ( new Map . Entry < Integer , Integer > ( e . getKey ( ) , p ) ) ;
    }
    if ( p < 0 ) {
      int count = 0 ;
      while ( count < - p ) {
        final Map . Entry < Integer , Integer > ss = stack . pop ( ) ;
        final int sp = ss . getKey ( ) ;
        count += sp ;
        total += d ( ss , stop , N ) * sp ;
        total = total % 1000002013 ;
      }
      assert count + p >= 0 ;
      if ( count