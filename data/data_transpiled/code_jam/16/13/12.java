static final int [ ] getStdOut ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  int tt = Integer . parseInt ( readLine ( ) ) ;
  for ( int t : xrange ( 1 , tt + 1 ) ) {
    int n = Integer . parseInt ( readLine ( ) ) ;
    int bff = map . get ( Integer . parseInt ( readLine ( ) ) - 1 ) ;
    int ans = 0 ;
    int bigCycle = 0 ;
    vsl = new int [ n ] ;
    dst = new int [ n ] ;
    boolean cyc [ ] = new boolean [ n ] ;
    boolean cy2 [ ] = new boolean [ n ] ;
    boolean fth [ ] = new int [ n ] ;
    int dth [ ] = new int [ n ] ;
    vsc = new int [ n ] ;
    /* dfl */
    int p = 0 ;
    int r = 0 ;
    int s = 0 ;
    if ( vsl [ bff ] == null ) {
      vsl [ p ] = r ;
      dst [ p ] = s ;
      if ( vsl [ bff ] == r ) {
        int x = dfl ( bff , r , s + 1 ) ;
        if ( x != 0 && s >= x ) cyc [ p ] = true ;
        return x ;
      }
      else if ( vsl [ bff ] == r ) {
        cyc [ p ] = true ;
        int cycsize = s - dst [ bff ] + 1 ;
        bigCycle = Math . max ( bigCycle , cycsize ) ;
        if ( cycsize == 2 ) {
          cy2 [ p ] = true ;
          cy2 [ bff ] = true ;
        }
        return dst [ bff ] ;
      }
      else {
        return null ;
      }
    }
    /* dfs */
    if ( vsc [ bff ] == null ) {
      dfs ( bff ) ;
    }
    vsc [ bff ] = vsc [ bff ] ;
    if ( cy2 [ vsc [ bff ] ] ) {
      dth [ bff ] = dth [ bff ] + 1 ;
      fth [ vsc [ bff ] ] = Math . max ( fth [ vsc [ bff ] ] , dth [ bff ] ) ;
    }
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( vsl [ i ] == null ) {
      dfs ( i , i , 0 ) ;
    }
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    