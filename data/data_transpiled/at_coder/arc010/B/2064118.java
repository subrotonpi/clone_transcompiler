public static int N ( Scanner input ) {
  int [ ] D = {
    31 , 29 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 }
    ;
    int A = 366 ;
    int [ ] E = new int [ 13 ] ;
    for ( int i = 0 ;
    i < 12 ;
    i ++ ) {
      E [ i + 1 ] = E [ i ] + D [ i ] ;
    }
    boolean [ ] yasumi = new boolean [ A ] ;
    int youbi = 6 ;
    for ( int i = 0 ;
    i < A ;
    i ++ ) {
      yasumi [ i ] = ( youbi >= 5 ) ;
      youbi = ( youbi + 1 ) % 7 ;
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int m = input . nextInt ( ) , d = input . nextInt ( ) ;
      d += E [ m - 1 ] - 1 ;
      while ( d < A - 1 && yasumi [ d ] ) {
        d ++ ;
      }
      yasumi [ d ] = true ;
    }
    int cnt = 0 ;
    int ans = 0 ;
    for ( int i = 0 ;
    i < A ;
    i ++ ) {
      if ( yasumi [ i ] ) {
        cnt ++ ;
        ans = Math . max ( cnt , ans ) ;
      }
      else {
        cnt = 0 ;
      }
    }
    System . out . println ( ans ) ;
    return ans ;
  }
  