@ VisibleForTesting static Iterable < Integer > solve ( String [ ] numbers ) {
  final int nnum = numbers . length ;
  final Map < Integer , Set < Integer >> sums = new HashMap < > ( nnum ) ;
  final long t0 = System . currentTimeMillis ( ) ;
  for ( int i = 2 ;
  i < nnum ;
  i ++ ) {
    for ( Set < Integer > subset : Sets . difference ( numbers , i ) ) {
      if ( System . currentTimeMillis ( ) - t0 > 30 ) return null ;
      Set < Integer > s = Sets . newHashSet ( subset ) ;
      int sSum = s . size ( ) ;
      for ( Set < Integer > other : sums . get ( sSum ) ) {
        if ( s . size ( ) & other . size ( ) == 0 ) return null ;
      }
      sums . put ( sSum , s ) ;
    }
  }
  return null ;
}
