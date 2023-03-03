static final int [ ] [ ] getFactors ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] pList = {
    2 , 3 , 5 , 7 , 11 , 13 , 17 , 19 , 23 , 29 , 31 , 37 , 41 , 43 , 47 }
    ;
    int [ ] [ ] dp = new int [ N ] [ pList . length ] ;
    for ( int i = 2 ;
    i <= N ;
    i ++ ) {
      for ( int j = 0 ;
      j < pList . length ;
      j ++ ) {
        int x = pList [ j ] ;
        int power = 0 ;
        while ( i % ( x * ( power + 1 ) ) == 0 ) {
          power ++ ;
        }
        dp [ i - 1 ] [ j ] = dp [ i - 2 ] [ j ] + power ;
      }
    }
    int [ ] factors = dp [ dp . length - 1 ] ;
    int numg3 = factors [ factors . length - 2 ] ;
    int numg5 = factors [ factors . length - 4 ] ;
    int numg15 = factors [ factors . length - 14 ] ;
    int numg25 = factors [ factors . length - 24 ] ;
    int numg75 = factors [ factors . length - 74 ] ;
    int ans = 0 ;
    if ( numg3 >= 3 && numg5 >= 2 ) {
      int add = ( numg5 * ( numg5 - 1 ) ) / 2 * ( numg3 - 2 ) ;
      ans += add ;
    }
    if ( numg15 >= 1 ) {
      int add = numg15 * ( numg5 - 1 ) ;
      ans += add ;
    }
    if ( numg25 >= 1 ) {
      int add = numg25 * ( numg3 - 1 ) ;
      ans += add ;
    }
    if ( numg75 >= 1 ) {
      ans += numg75 ;
    }
    System . out . println ( ans ) ;
    return dp ;
  }
  