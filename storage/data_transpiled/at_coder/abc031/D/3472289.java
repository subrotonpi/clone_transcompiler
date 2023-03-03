public static String [ ] [ ] getans ( int k , int n ) {
  int [ ] [ ] a = new int [ n ] [ k ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = input . nextInt ( ) ;
    int y = input . nextInt ( ) ;
    a [ i ] = new int [ ] [ ] {
      x , y }
      ;
    }
    for ( int i = 0 ;
    i < 3 * k ;
    i ++ ) {
      int [ ] b = new int [ k ] ;
      while ( i > 0 ) {
        int c = i % 3 ;
        b [ c ] = c + 1 ;
        i = ( i - c ) / 3 ;
      }
      while ( b . length < k ) b [ c ] = 1 ;
    }
    String [ ] [ ] ans = new String [ k ] [ ] ;
    for ( int i = 0 ;
    i < k ;
    i ++ ) {
      ans [ i ] = new String [ k ] ;
    }
    int flag = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      String [ ] kazu = a [ j ] [ 0 ] ;
      String mozi = a [ j ] [ 1 ] ;
      for ( int l = 0 ;
      l < kazu . length ;
      l ++ ) {
        l = Integer . parseInt ( kazu [ l ] ) - 1 ;
        String kon = mozi . substring ( 0 , b [ l ] ) ;
        mozi = mozi . substring ( b [ l ] ) ;
        if ( ans [ l ] == null ) {
          ans [ l ] = kon ;
        }
        else {
          if ( ans [ l ] . equals ( kon ) ) {
            flag = 1 ;
            break ;
          }
        }
      }
      if ( mozi . compareTo ( "" ) != 0 ) {
        flag = 1 ;
        break ;
      }
    }
    if ( flag == 0 ) {
      for ( int j = 0 ;
      j < k ;
      j ++ ) {
        System . out . println ( ans [ j ] ) ;
      }
      exit ( ) ;
    }
    return ans ;
  }
  