static final int [ ] [ ] input ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int L = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] p = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String x = Integer . parseInt ( input . readLine ( ) ) ;
    int d = Integer . parseInt ( input . readLine ( ) ) ;
    p [ i ] = new int [ ] {
      Integer . parseInt ( x ) , d }
      ;
    }
    int res = 0 ;
    int start = - 1 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( p [ i ] [ 1 ] == 'R' ) {
        start = i ;
        break ;
      }
      else {
        res += p [ i ] [ 0 ] - 1 - i ;
      }
    }
    int end = n ;
    for ( int i = n - 1 ;
    i >= 0 ;
    i -- ) {
      if ( p [ i ] [ 1 ] == 'L' ) {
        end = i ;
        break ;
      }
      else {
        res += L - p [ i ] [ 0 ] - ( n - 1 - i ) ;
      }
    }
    if ( start == - 1 || end == n ) {
      System . out . println ( res ) ;
      exit ( ) ;
    }
    int cnt_r = 0 ;
    int cnt_l = 0 ;
    int end_r = 0 ;
    int start_l = 0 ;
    int q = 0 ;
    for ( int i = start ;
    i <= end ;
    i ++ ) {
      if ( p [ i ] [ 1 ] == 'R' ) {
        res += ( p [ i ] [ 0 ] - end_r - 1 ) * cnt_r ;
        end_r = p [ i ] [ 0 ] ;
        cnt_r ++ ;
      }
      else {
        if ( cnt_l == 0 ) {
          q = p [ i ] [ 0 ] - end_r - 1 ;
          start_l = p [ i ] [ 0 ] ;
        }
        res += p [ i ] [ 0 ] - start_l - cnt_l ;
        cnt_l ++ ;
        if ( i == end || p [ i + 1 ] [ 1 ] == 'R' ) {
          res += q * Math . max ( cnt_r , cnt_l ) ;
          cnt_r = 0 ;
          cnt_l = 0 ;
        }
      }
    }
    System . out . println ( res ) ;
    return p ;
  }
  