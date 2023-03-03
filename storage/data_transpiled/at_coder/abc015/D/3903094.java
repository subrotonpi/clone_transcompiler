public static int W = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] inArray = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    inArray [ i ] = new int [ ] {
      a , b }
      ;
    }
    Arrays . sort ( inArray ) ;
    HashMap < Integer , Integer > memo = new HashMap < Integer , Integer > ( ) ;
    /* dfs */
    int useW = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int a = Integer . parseInt ( input . nextLine ( ) ) ;
      int b = Integer . parseInt ( input . nextLine ( ) ) ;
      useW = Math . min ( useW , now + 1 ) ;
      if ( useW < 1 ) return 0 ;
      if ( ( now < useW ) && ( useW < 1 ) ) return 0 ;
      memo . put ( now , useW , Math . max ( dfs ( useW - a , useNum - 1 , now - 1 ) + ( useW - a >= 0 ? b : 0 ) , dfs ( useW , useNum , now - 1 ) ) ) ;
    }
    int result = 0 ;
    System . out . println ( result ) ;
    return result ;
  }
  