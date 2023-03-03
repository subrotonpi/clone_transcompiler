static final int [ ] getNegativeInstances ( ) {
  int L = 30 ;
  int [ ] normal = {
    0 , 1 }
    ;
    int [ ] surprise = {
      0 , 1 }
      ;
      for ( int i = 2 ;
      i <= L ;
      i ++ ) {
        normal [ i ] = i / 3 + ( ( i % 3 ) > 0 ? 1 : 0 ) ;
        surprise [ i ] = 2 + ( i - 2 ) / 3 ;
      }
      for ( int caseIndex = 1 ;
      caseIndex <= 1 ;
      caseIndex ++ ) {
        System . err . print ( Integer . toString ( caseIndex ) + " " ) ;
        int [ ] v = Integer . parseInt ( readLine ( ) ) ;
        int N = v [ 0 ] ;
        int S = v [ 1 ] ;
        int p = v [ 2 ] ;
        int res = 0 ;
        a = 0 ;
        System . out . println ( "Case #" + caseIndex + ": " + res ) ;
      }
      System . err . println ( ) ;
      return normal ;
    }
    