static final int [ ] [ ] solve ( ) {
  int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int [ ] [ ] mat = new int [ n ] [ n ] ;
  float [ ] win_memo = new float [ n ] ;
  float [ ] owin_memo = new float [ n ] ;
  int i , n , ignore ;
  int win , tot ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    if ( win_memo [ i ] != - 1 ) {
      return win_memo [ i ] ;
    }
    win = 0.0f ;
    tot = 0.0f ;
    for ( j = 0 ;
    j < n ;
    j ++ ) {
      if ( j == ignore ) {
        continue ;
      }
      if ( mat [ i ] [ j ] == 1 ) {
        win ++ ;
        tot ++ ;
      }
      else if ( mat [ i ] [ j ] == 0 ) {
        tot ++ ;
      }
    }
    if ( win == 0 ) {
      win_memo [ i ] = 0.0f ;
      return 0. ;
    }
    else {
      win_memo [ i ] = win / tot ;
      return win / tot ;
    }
  }
  int owin , n , ignore ;
  float op_tot = 0.0f ;
  float op_win = 0.0f ;
  for ( int k = 0 ;
  k < n ;
  k ++ ) {
    if ( mat [ i ] [ k ] != - 1 ) {
      op_win += win ( k , n , i ) ;
      op_tot ++ ;
    }
  }
  int oowin , n ;
  op_tot = 0.0f ;
  op_win = 0.0f ;
  for ( int k = 0 ;
  k < n ;
  k ++ ) {
    if ( mat [ i ] [ k ] != - 1 ) {
      op_win += owin ( k , n ) ;
      op_tot ++ ;
    }
  }
  for ( int test = 1 ;
  test <= t ;
  test ++ ) {
    int [ ] rpi ;
    n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    mat = new int [ n ] [ n ] ;
    for ( int x = xrange ( n ) ;
    x < n ;
    x ++ ) {
      String line = System . console ( ) . readLine ( ) ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( line . charAt ( j ) == '0' ) {
          mat [ i ] [ j ] = 0 ;
        }
        else if ( line . charAt ( j ) == '1' ) {
          mat [ i ] [ j ] = 1 ;
        }
        else {
          mat [ i ] [ j ] = - 1 ;
        }
        