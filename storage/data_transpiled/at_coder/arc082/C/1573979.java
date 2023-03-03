@ VisibleForTesting static void main ( String [ ] args ) {
  if ( args . length == 0 ) {
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    List < Integer > xyList = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      xyList . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
    }
    int moduloNum = 998244353 ;
    int [ ] duplicateArray = new int [ N + 1 ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int xi = xyList . get ( i ) ;
      int yi = xyList . get ( i ) ;
      List < Integer > gradientList = new ArrayList < > ( ) ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        int xj = xyList . get ( j ) ;
        int yj = xyList . get ( j ) ;
        if ( xi != xj ) {
          gradientList . add ( ( yj - yi ) / ( xj - xi ) ) ;
        }
        else if ( yi != yj ) {
          gradientList . add ( 100000 ) ;
        }
      }
      Counter < Integer > counter = new Counter < > ( gradientList ) ;
      for ( int k : counter . values ( ) ) {
        duplicateArray [ k + 1 ] ++ ;
      }
    }
    int ans = Math . pow ( 2 , N , moduloNum ) ;
    ans -- ;
    ans -= N ;
    for ( int i = 2 ;
    i <= N ;
    i ++ ) {
      int cnt = duplicateArray [ i ] / i ;
      ans -= cnt * ( Math . pow ( 2 , i , moduloNum ) - i - 1 ) ;
    }
    ans = ans % moduloNum ;
    System . out . println ( ans ) ;
  }
}
