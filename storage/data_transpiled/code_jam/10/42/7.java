public static int solve ( int M [ ] , int a , int b , int lev , int [ ] missed ) {
  if ( a == b ) return 0 ;
  int l = b - a ;
  int pr = prices [ lev - 1 ] [ a / 2 * lev ] ;
  int cost1 = pr + solve ( M , a , a + l / 2 , lev - 1 , missed ) + solve ( M , a + l / 2 + 1 , b , lev - 1 , missed ) ;
  if ( Arrays . binarySearch ( missed , M , a , b + 1 ) > 0 ) {
    int cost2 = solve ( M , a , a + l / 2 , lev - 1 , missed + 1 ) + solve ( M , a + l / 2 + 1 , b , lev - 1 , missed + 1 ) ;
    return Math . min ( cost1 , cost2 ) ;
  }
  else {
    return cost1 ;
  }
  if ( getClass ( ) . isEnum ( ) ) {
    for ( int testCase : xrange ( input -> {
      int P = Integer . parseInt ( input . nextLine ( ) ) ;
      int [ ] Ms = new int [ P ] ;
      for ( String s : input . nextLine ( ) . split ( " " ) ) {
        Ms [ i ] = Integer . parseInt ( s ) ;
      }
      prices = new ArrayList < > ( ) ;
      for ( int i = 0 ;
      i < P ;
      i ++ ) {
        int [ ] ll = new int [ P ] ;
        for ( String s : input . nextLine ( ) . split ( " " ) ) {
          ll [ i ] = Integer . parseInt ( s ) ;
          prices . add ( ll ) ;
        }
      }
      int res = solve ( Ms , 0 , ( 2 * P ) - 1 , P , 0 ) ;
      System . out . println ( "Case #" + ( testCase + 1 ) + ": " + res ) ;
    }
  }
  return 0 ;
}
