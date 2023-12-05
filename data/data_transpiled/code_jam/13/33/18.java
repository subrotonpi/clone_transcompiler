private static void solve ( int n_t , List < Trib > tribes ) throws IOException {
  HashMap < Integer , List < Integer >> attacks = new HashMap < Integer , List < Integer >> ( ) ;
  for ( int d = 0 ;
  d < n ;
  d ++ ) {
    int n = tribes . size ( ) ;
    int w = tribes . get ( d ) ;
    int e = tribes . get ( e ) ;
    int s = tribes . get ( s ) ;
    int delta_d = tribes . get ( d ) ;
    int delta_p = tribes . get ( d ) ;
    int delta_s = tribes . get ( d ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int dist = delta_p * i ;
      int day = d + delta_d * i ;
      int east = e + dist ;
      int west = w + dist ;
      int strength = s + delta_s * i ;
      List < Integer > attacksOnDay = attacks . computeIfAbsent ( day , k -> new ArrayList < Integer > ( ) ) ;
      attacksOnDay . add ( new Integer ( east ) ) ;
      attacksOnDay . add ( new Integer ( west ) ) ;
      attacksOnDay . add ( new Integer ( strength ) ) ;
    }
  }
  int maxDist = 10000000 ;
  int offset = maxDist + 1 ;
  int wallLen = 2 * maxDist + 1 ;
  int [ ] wall = wallLen * new int [ 1 ] ;
  ArrayList < Integer > days = new ArrayList < Integer > ( attacks . keySet ( ) ) ;
  Collections . sort ( days ) ;
  int succeded_count = 0 ;
  for ( Integer day : days ) {
    int [ ] new_wall = wall . clone ( ) ;
    for ( int east = attacks . get ( day ) ;
    east <= east ;
    east ++ ) {
      int west = attacks . get ( day ) ;
      int strength = attacks . get ( day ) ;
      boolean succeded = false ;
      for ( int p = west ;
      p < east ;
      p ++ ) {
        int idx = p + offset ;
        if ( wall [ idx ] < strength ) succeded = true ;
        new_wall [ idx ] = Math . max ( new_wall [ idx ] , strength ) ;
      }
      if ( succeded ) succeded_count ++ ;
    }
    wall = new_wall ;
  }
}
