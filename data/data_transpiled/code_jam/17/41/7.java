public static void numTestcases ( int numTestCases ) {
  for ( int testcaseNum = 1 ;
  testcaseNum <= numTestCases ;
  testcaseNum ++ ) {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int p = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] d = new int [ p ] ;
    for ( String s : input . nextLine ( ) . split ( " " ) ) {
      d [ Integer . parseInt ( s ) % p ] ++ ;
    }
    int res = d [ 0 ] ;
    if ( p == 2 ) {
      res += d [ 1 ] / 2 + d [ 1 ] % 2 ;
    }
    else if ( p == 3 ) {
      int mini = Math . min ( d [ 1 ] , d [ 2 ] ) ;
      int maxi = Math . max ( d [ 1 ] , d [ 2 ] ) ;
      res += mini + ( maxi - mini ) / 3 + ( ( maxi - mini ) % 3 > 0 ? 1 : 0 ) ;
    }
    else if ( p == 4 ) {
      int mini = Math . min ( d [ 1 ] , d [ 3 ] ) ;
      int maxi = Math . max ( d [ 1 ] , d [ 3 ] ) ;
      res += mini + d [ 2 ] / 2 ;
      if ( d [ 2 ] % 2 == 0 ) {
        res += ( maxi - mini ) / 4 + ( ( maxi - mini ) % 4 > 0 ? 1 : 0 ) ;
      }
      else {
        int a = Math . max ( maxi - mini - 2 , 0 ) ;
        res += 1 + a / 4 + ( a % 4 > 0 ? 1 : 0 ) ;
      }
    }
    System . out . println ( "Case #" + testcaseNum + ": " + res ) ;
  }
}
