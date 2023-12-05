@ VisibleForTesting static final Iterable < String > solve ( ) {
  return new Iterable < String > ( ) {
    @ Override public Iterator < String > iterator ( ) {
      return Collections . singleton ( T ) . iterator ( ) ;
    }
  }
  ;
  /* Insert the map of the input string */
  @ Override public int insert ( Map < Character , String > map , String s ) {
    int ans = 0 ;
    if ( s . length ( ) == 0 ) {
      ans = 0 ;
    }
    else {
      char c = s . charAt ( 0 ) ;
      if ( map . containsKey ( c ) ) {
        ans = insert ( map . get ( c ) , s . substring ( 1 ) ) ;
      }
      else {
        Map < Character , Integer > nd = Maps . newHashMap ( ) ;
        ans = 1 + insert ( nd , s . substring ( 1 ) ) ;
        map . put ( c , nd ) ;
      }
    }
    return ans ;
  }
  /* Solve single map of the input string */
  @ Override public int insert ( Map < Character , String > A ) {
    Map < Character , String > root = Maps . newHashMap ( ) ;
    ans = 1 ;
    for ( String s : A . keySet ( ) ) {
      ans += insert ( root , s ) ;
    }
    return ans ;
  }
  /* Solve config */
  @ Override public int insert ( int M , int N , Map < Character , String > A , List < String > config ) {
    int ans = 0 ;
    Set < Integer > srvs = Sets . newHashSet ( config ) ;
    for ( Integer srv : srvs ) {
      List < Integer > ids = new ArrayList < Integer > ( ) ;
      for ( int i = 0 ;
      i < config . size ( ) ;
      i ++ ) {
        if ( config . get ( i ) . equals ( srv ) ) {
          ids . add ( i ) ;
        }
      }
      ans += solveSingle ( Arrays . asList ( A . get ( i ) ) ) ;
    }
    return ans ;
  }
  /* Solve all configs */
  @ Override public int insert ( int M , int N , Map < Character , String > A ) {
    List < String > configs = Lists . newArrayList ( ) ;
    for ( List < String > config : configs ) {
      int cWorked = solveConfig ( M , N , A , config ) ;
      if ( cWorked > worst ) {
        worst = cWorked ;
        count = 1 ;
      }
      else if ( cWorked == worst ) {
        