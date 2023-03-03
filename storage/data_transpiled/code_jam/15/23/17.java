@ VisibleForTesting static int solve ( List < int [ ] > human ) {
  int t = 0 ;
  long [ ] time1 = new long [ human . size ( ) ] ;
  long [ ] time2 = new long [ human . size ( ) ] ;
  for ( int [ ] h : human ) {
    long t = ( 360L - h [ 0 ] ) / 360L * h [ 1 ] ;
    time1 [ t ] = t ;
    time2 [ t ] = t + h [ 1 ] ;
    pass ( ) ;
  }
  if ( max ( time1 ) < min ( time2 ) ) return 0 ;
  return 1 ;
}
