public static int a ( ) {
  int [ ] ar = new int [ ] {
    Integer . parseInt ( input . nextLine ( ) ) }
    ;
    int [ ] br = new int [ Math . max ( a , ar . length ) ] ;
    for ( int i = 0 ;
    i < br . length ;
    i ++ ) {
      int count = 0 ;
      for ( int r : ar ) {
        count += ( i - r ) * ( i - r ) ;
      }
      br [ i ] = count ;
    }
    System . out . println ( min ( br ) ) ;
    return br . length ;
  }
  