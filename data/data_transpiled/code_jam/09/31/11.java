static final int solve ( ) {
  int cases = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int caseNo = xrange ( 1 , cases + 1 ) ;
  caseNo <= cases ;
  caseNo ++ ) {
    int ans = 0 ;
    int base = 2 ;
    char [ ] chars = System . console ( ) . readLine ( ) . toCharArray ( ) ;
    HashMap < Character , Integer > conv = new HashMap < Character , Integer > ( ) ;
    int cur = 1 ;
    int [ ] num = new int [ chars . length ] ;
    for ( int i = 0 ;
    i < chars . length ;
    i ++ ) {
      if ( ! conv . containsKey ( chars [ i ] ) ) {
        conv . put ( chars [ i ] , cur ) ;
        if ( cur == 1 ) {
          cur = 0 ;
        }
        else if ( cur == 0 ) {
          cur = 2 ;
        }
        else {
          cur ++ ;
        }
      }
      num [ i ] = conv . get ( chars [ i ] ) ;
    }
    if ( cur < 2 ) {
      base = 2 ;
    }
    else {
      base = cur ;
    }
    int pow = 0 ;
    for ( int i = num . length - 1 ;
    i >= 0 ;
    i -- ) {
      int val = num [ i ] ;
      ans += val * ( Math . pow ( base , pow ) ) ;
      pow ++ ;
    }
    System . out . println ( "Case #" + caseNo + ": " + ans ) ;
  }
  return ans ;
}
