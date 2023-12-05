@ VisibleForTesting static double [ ] [ ] solve ( ) {
  double [ ] [ ] memo = new double [ 21 ] [ 21 ] ;
  for ( int n = 0 ;
  n < memo . length ;
  n ++ ) {
    memo [ n ] [ 0 ] = 0.0 ;
    for ( int ss = 1 ;
    ss < 1 << n ;
    ss ++ ) {
      if ( memo [ n ] [ ss ] != - 1 ) continue ;
      String s = Integer . toBinaryString ( ss ) . substring ( 2 ) ;
      double [ ] m = new double [ n ] ;
      for ( int k = 0 ;
      k < n ;
      k ++ ) {
        if ( ( ss >> k & 1 ) != 0 ) m [ k ] = memo [ n ] [ ss ^ ( 1 << k ) ] ;
        else m [ k ] = 0.0 ;
      }
      Collections . reverse ( m ) ;
      double [ ] d = new double [ n ] ;
      double [ ] t = s . clone ( ) ;
      int i = n + n - 1 ;
      while ( t [ i ] == '0' ) i -- ;
      while ( i >= 0 ) {
        if ( t [ i ] == '1' ) {
          double x = m [ i % n ] ;
          d [ i % n ] = n + x ;
          int j = i - 1 ;
          while ( j >= 0 && t [ j ] == '0' ) {
            d [ j % n ] = n - ( i - j ) + x ;
            j -- ;
          }
          i = j ;
        }
      }
      double f = sum ( d ) / n ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        memo [ n ] [ Integer . parseInt ( s , 2 ) ] = f ;
        s = s . substring ( s . length ( ) - 1 ) + s . substring ( 0 , s . length ( ) - 1 ) ;
      }
    }
  }
  {
    String x = input . nextLine ( ) ;
    int n = x . length ( ) ;
    double t = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( x . charAt ( i ) == '.' ) t += 1 << ( n - 1 - i ) ;
    }
  }
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    System . out . println ( "Case #" + ( i + 1 ) + ": " + solve ( ) + " " + x )