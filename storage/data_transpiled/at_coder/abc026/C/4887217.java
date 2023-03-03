public static int [ ] [ ] findSalary ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] salary = {
    0 , 1 }
    ;
    int [ ] [ ] ans = new int [ n + 1 ] [ n ] ;
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      int k = Integer . parseInt ( input . nextLine ( ) ) ;
      salary [ i ] = k ;
    }
    /* find the first salary */
    ArrayList < ArrayList < Integer >> order = new ArrayList < ArrayList < Integer >> ( ) ;
    for ( int i = 0 ;
    i < salary . length ;
    i ++ ) {
      order . add ( new ArrayList < Integer > ( ) ) ;
    }
    Collections . sort ( order ) ;
    Collections . reverse ( order ) ;
    salary [ 1 ] = 0 ;
    for ( int i = 0 ;
    i < order . size ( ) ;
    i ++ ) {
      ArrayList < Integer > stack = new ArrayList < Integer > ( ) ;
      if ( salary [ i ] == i ) {
        ans [ i ] = ans [ i ] * 2 + 1 ;
      }
      else {
        for ( int j = 0 ;
        j < salary . length ;
        j ++ ) {
          if ( salary [ j ] == i ) {
            stack . add ( ans [ j ] ) ;
          }
        }
        ans [ i ] = Math . min ( stack . size ( ) ) + max ( stack . size ( ) ) + 1 ;
      }
    }
    System . out . println ( ans [ 1 ] ) ;
    return ans ;
  }
  