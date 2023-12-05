static final double solve ( int L , int t , int N , int C , int [ ] a ) {
  int i ;
  int tot_dist = 0 ;
  int [ ] eff_dists = new int [ N ] ;
  for ( i = 0 ;
  i < N ;
  i ++ ) {
    int s = xrange ( N ) ;
    int d = a [ s % a . length ] ;
    if ( tot_dist + d <= t ) {
      eff_dists [ s ] = new int [ s ] ;
    }
    else {
      if ( tot_dist >= t ) {
        eff_dists [ s ] = new int [ s ] ;
      }
      else {
        eff_dists [ s ] = new int [ s ] ;
      }
    }
    tot_dist += d ;
  }
  int tot_time = 0 ;
  for ( int dist = 0 ;
  dist < eff_dists . length ;
  dist ++ ) {
    eff_dists [ dist ] = eff_dists [ dist ] ;
    if ( L > 0 ) {
      tot_time += eff_dists [ dist ] + 2 * ( dist - eff_dists [ dist ] ) ;
      L -- ;
    }
    else {
      tot_time += dist * 2 ;
    }
  }
  /* main code */
  int T = Integer . parseInt ( ( String ) i ) ;
  for ( i = 1 ;
  i <= T ;
  i ++ ) {
    System . out . println ( i >>> 1 ) ;
    String line = ( String ) line . split ( null , 4 ) [ 0 ] ;
    L = Integer . parseInt ( line . split ( " " ) [ 0 ] ) ;
    t = Integer . parseInt ( line . split ( " " ) [ 1 ] ) ;
    N = Integer . parseInt ( line . split ( " " ) [ 2 ] ) ;
    a = Integer . parseInt ( line . split ( " " ) [ 3 ] ) ;
    System . out . println ( "Case #" + test + ": " + solve ( L , t , N , C , a ) ) ;
  }
}
