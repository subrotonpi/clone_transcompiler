public static void input ( ) {
  int t = input . nextInt ( ) ;
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    System . out . println ( "Case #" + ( t + 1 ) + ":" ) ;
    int n = input . nextInt ( ) ;
    String [ ] s = new String [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) s [ j ] = input . next ( ) ;
    double [ ] wp = new double [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      wp [ j ] = 0.0 ;
    }
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int cnt = 0 ;
      int win = 0 ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( s [ i ] . charAt ( j ) == '0' ) cnt ++ ;
        else if ( s [ i ] . charAt ( j ) == '1' ) {
          cnt ++ ;
          win ++ ;
        }
      }
      wp [ i ] = win * 1.0 / cnt ;
    }
    double [ ] owp = new double [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int op = 0 ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( i != j && s [ i ] . charAt ( j ) != '.' ) {
          op ++ ;
          int cnt = 0 ;
          int win = 0 ;
          for ( int k = 0 ;
          k < n ;
          k ++ ) {
            if ( k != i ) {
              if ( s [ j ] . charAt ( k ) == '0' ) cnt ++ ;
              else if ( s [ j ] . charAt ( k ) == '1' ) {
                cnt ++ ;
                win ++ ;
              }
            }
          }
          owp [ i ] += win * 1.0 / cnt ;
        }
      }
      owp [ i ] /= op ;
    }
    double [ ] oowp = new double [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int op = 0 ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( i != j && s [ i ] . charAt ( j ) != '.' ) {
          op ++ ;
          oowp [ i ] += owp [ j ] ;
        }
      }
      oowp [ i ] /= op ;
    }
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      System . out . println ( 0.25