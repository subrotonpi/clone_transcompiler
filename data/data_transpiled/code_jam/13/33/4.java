static void process ( ArrayList < Pair > q ) {
  for ( int w = 0 ;
  w < q . size ( ) ;
  w ++ ) {
    int e = q . get ( w ) . getLeft ( ) ;
    int s = q . get ( w ) . getRight ( ) ;
    for ( int i = w + Z ;
    i < e + Z ;
    i ++ ) c [ i ] = Math . max ( c [ i ] , s ) ;
  }
  for ( int testCase = 0 ;
  testCase < Integer . parseInt ( readLine ( ) ) ;
  testCase ++ ) {
    int n = Integer . parseInt ( readLine ( ) ) ;
    int [ ] f = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) f [ i ] = Integer . parseInt ( readLine ( ) ) ;
    ArrayList < Pair > a = new ArrayList < > ( ) ;
    for ( int d = 0 ;
    d < n ;
    d ++ ) {
      int w = f [ d ] ;
      int e = f [ d ] ;
      int s = f [ e ] ;
      int dd = f [ d ] ;
      int dp = f [ d ] ;
      int ds = f [ d ] ;
      for ( int k = 0 ;
      k < n ;
      k ++ ) {
        a . add ( new Pair ( d , w , e , s ) ) ;
        d += dd ;
        w += dp ;
        e += dp ;
        s += ds ;
      }
    }
    Collections . sort ( a ) ;
    int Z = 250 ;
    int [ ] c = new int [ 500 ] ;
    int v = 0 ;
    Pair cd = null ;
    for ( int i = 0 ;
    i < a . size ( ) ;
    i ++ ) {
      int d = a . get ( i ) . getLeft ( ) ;
      int w = a . get ( i ) . getLeft ( ) ;
      int e = a . get ( i ) . getRight ( ) ;
      int s = a . get ( i ) . getLeft ( ) ;
      if ( d != cd ) {
        if ( cd != null ) process ( q ) ;
        cd = d ;
        q . clear ( ) ;
      }
      if ( Math . min ( c , w + Z , e + Z ) < s ) {
        v ++ ;
        q . add ( new Pair ( w , e , s ) ) ;
      }
    }
    process ( q ) ;
    int ans = v ;
    System . out . println ( "Case #" + ( testCase + 1 ) + ": " + ans ) ;
  }
}
