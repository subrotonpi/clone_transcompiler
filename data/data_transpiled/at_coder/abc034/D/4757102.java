static final void solve ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  String input = System . getProperty ( "line.separator" ) ;
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  int [ ] [ ] item = new int [ N ] [ K ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int w = Integer . parseInt ( input ) ;
    int p = Integer . parseInt ( input ) ;
    item [ i ] = new int [ ] {
      p * w , w }
      ;
    }
    /* check */
    int [ ] y = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      y [ i ] = item [ i ] [ 0 ] - item [ i ] [ 1 ] * x ;
    }
    Arrays . sort ( y ) ;
    if ( Arrays . binarySearch ( y , 0 , K ) >= 0 ) {
      /* solve */
      int low = 0 ;
      int up = 10 * 10 ;
      int e = 10 * ( - 8 ) ;
      while ( up - low >= e ) {
        int mid = ( low + up ) / 2 ;
        if ( check ( mid ) ) {
          low = mid ;
        }
        else {
          up = mid ;
        }
      }
      System . out . println ( up ) ;
    }
  }
  