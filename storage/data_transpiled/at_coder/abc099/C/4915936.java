public static void main ( String [ ] args ) {
  if ( args . length == 0 ) {
    int target = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] withdrawCounts = new int [ target + 1 ] ;
    for ( int i = 0 ;
    i < target + 1 ;
    i ++ ) {
      if ( i < 6 ) {
        withdrawCounts [ i ] = i ;
      }
      else if ( i < 9 ) {
        withdrawCounts [ i ] = i - 5 ;
      }
      else {
        List < Integer > neededWithdrawCounts = new ArrayList < Integer > ( ) ;
        neededWithdrawCounts . add ( withdrawCounts [ i - 1 ] ) ;
        int expN = 1 ;
        while ( 6 * expN <= i ) {
          neededWithdrawCounts . add ( withdrawCounts [ i - 6 * expN ] ) ;
          expN ++ ;
        }
        expN = 1 ;
        while ( 9 * expN <= i ) {
          neededWithdrawCounts . add ( withdrawCounts [ i - 9 * expN ] ) ;
          expN ++ ;
        }
        withdrawCounts [ i ] = Math . min ( neededWithdrawCounts . size ( ) , 1 ) + 1 ;
      }
    }
    System . out . println ( withdrawCounts [ target ] ) ;
  }
}
