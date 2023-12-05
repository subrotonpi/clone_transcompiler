private static void for ( int testCase = 1 ;
testCase <= Integer . MAX_VALUE ;
testCase ++ ) {
  int [ ] h = new int [ 500 ] ;
  HashMap < Integer , ArrayList < Attack >> attacks = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < Integer . MAX_VALUE ;
  i ++ ) {
    int d = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int n = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int w = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int e = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int s = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int dd = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int dp = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int ds = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( ! attacks . containsKey ( d ) ) attacks . put ( d , new ArrayList < > ( ) ) ;
      else attacks . get ( d ) . add ( new Attack ( w , e , s ) ) ;
      d = d + dd ;
      w = d + dp ;
      e = d + dp ;
      s = d + ds ;
    }
  }
  int ans = 0 ;
  for ( Map . Entry < Integer , ArrayList < Attack >> entry : attacks . entrySet ( ) ) {
    int maxs = - 1 ;
    int [ ] h2 = h . clone ( ) ;
    for ( int w = 0 ;
    w < w ;
    w ++ ) {
      int e = entry . getKey ( ) ;
      int s = entry . getValue ( ) . trim ( ) ;
      maxs = Math . max ( maxs , s ) ;
      int success = 0 ;
      for ( int i = w + 250 ;
      i < e + 250 ;
      i ++ ) {
        if ( h [ i ] < s ) success = 1 ;
        h2 [ i ] = Math . max ( h2 [ i ] , s ) ;
      }
      ans += success ;
    }
    h = h2 ;
  }
  System . out . println ( "Case #" + testCase + ": " + ans ) ;
}
