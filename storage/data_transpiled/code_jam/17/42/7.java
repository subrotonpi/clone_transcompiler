public static boolean canDo ( List < Integer > ts , int l ) {
  int s = 0 ;
  for ( int i = 0 ;
  i < ts . size ( ) ;
  i ++ ) {
    s += ts . get ( i ) ;
    if ( s > ( i + 1 ) * l ) {
      return false ;
    }
  }
  for ( int testcase_num = 1 ;
  testcase_num <= numTestCases ;
  testcase_num ++ ) {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    int m = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] tktsPerCustomer = new int [ c ] ;
    int [ ] tktsPerSeat = new int [ n ] ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      int p = Integer . parseInt ( input . nextLine ( ) ) ;
      int b = Integer . parseInt ( input . nextLine ( ) ) ;
      tktsPerSeat [ p - 1 ] ++ ;
      tktsPerCustomer [ b - 1 ] ++ ;
    }
    int l = 0 ;
    int r = 1 ;
    while ( ! canDo ( tktsPerSeat , r ) ) {
      l = r ;
      r *= 2 ;
    }
    while ( l < r - 1 ) {
      if ( canDo ( tktsPerSeat , ( l + r ) / 2 ) ) {
        r = ( l + r ) / 2 ;
      }
      else {
        l = ( l + r ) / 2 ;
      }
    }
    int res = Math . max ( r , Math . max ( tktsPerCustomer , 0 ) ) ;
    int res2 = Math . max ( 0 , Math . max ( tktsPerSeat , 0 ) - res ) ;
    System . out . println ( "Case #" + testcase_num + ": " + res + " " + res2 ) ;
  }
  return true ;
}
