@ VisibleForTesting static void init ( ) {
  Map < Integer , List < Integer >> att = new HashMap < Integer , List < Integer >> ( ) ;
  /* init */
  int d = ( Integer ) ( System . in . readLine ( ) ) ;
  int n = ( Integer ) ( System . in . readLine ( ) ) ;
  int w = ( Integer ) ( System . in . readLine ( ) ) ;
  int e = ( Integer ) ( System . in . readLine ( ) ) ;
  int s = ( Integer ) ( System . in . readLine ( ) ) ;
  int dd = ( Integer ) ( System . in . readLine ( ) ) ;
  int dp = ( Integer ) ( System . in . readLine ( ) ) ;
  int ds = ( Integer ) ( System . in . readLine ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ! att . containsKey ( d ) ) att . put ( d , new ArrayList < Integer > ( ) ) ;
    att . get ( d ) . add ( new Integer ( w ) ) ;
    d += dd ;
    w += dp ;
    e += dp ;
    s += ds ;
  }
  /* cal */
  Map < Integer , Integer > wall = new HashMap < Integer , Integer > ( ) ;
  for ( int i = - 500 ;
  i <= 500 ;
  i ++ ) wall . put ( i , 0 ) ;
  int res = 0 ;
  int mx = 0 ;
  for ( Map . Entry < Integer , List < Integer >> entry : att . entrySet ( ) ) mx = Math . max ( mx , entry . getKey ( ) ) ;
  for ( int d = 0 ;
  d < mx + 1 ;
  d ++ ) {
    if ( ! att . containsKey ( d ) ) continue ;
    Iterator < Integer > itr = entry . getValue ( ) . iterator ( ) ;
    while ( itr . hasNext ( ) ) {
      int w = itr . next ( ) ;
      int e = itr . next ( ) ;
      int s = itr . next ( ) ;
      int cnt = 0 ;
      for ( int p = w ;
      p <= e ;
      p ++ ) if ( wall . get ( p ) < s ) cnt ++ ;
      if ( cnt > res ) res ++ ;
    }
    itr = entry . getValue ( ) . iterator ( ) ;
    while ( itr . hasNext ( ) ) {
      int w = itr . next ( ) ;
      int e = itr . next ( ) ;
      int s = itr . next ( ) ;
      wall . put ( p , max