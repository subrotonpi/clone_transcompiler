static final Scanner WINS = new Scanner ( System . in ) {
  int T = Integer . parseInt ( System . in ) ;
  {
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      int _x = x + dirx * i ;
      int _y = y + diry * i ;
      if ( board [ _x ] [ _y ] != name ) return false ;
    }
    return true ;
  }
  {
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      int _x = x + dirx * i ;
      int _y = y + diry * i ;
      if ( board [ _x ] [ _y ] != name ) return false ;
    }
  }
  {
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      int _x = x + dirx * i ;
      int _y = y + diry * i ;
      if ( board [ _x ] [ _y ] != name ) return false ;
    }
  }
  {
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      int _x = x + dirx * i ;
      int _y = y + diry * i ;
      if ( wins ( board [ _x ] , board [ _y ] , 1 , 1 , K ) ) return true ;
      if ( wins ( board [ x + K - 1 ] , board [ _y ] , - 1 , 1 , K ) ) return true ;
    }
  }
  {
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      int _y = y + diry * i ;
      if ( wins ( board [ x ] , board [ y ] , 1 , 0 , K ) ) return true ;
      if ( wins ( board [ y ] , board [ x ] , 0 , 1 , K ) ) return true ;
    }
  }
  {
    for ( int _t = T ;
    t < T ;
    t ++ ) {
      int N = Integer . parseInt ( System . in . read ( ) ) ;
      int K = Integer . parseInt ( System . in . read ( ) ) ;
      char [ ] [ ] board = new char [ N ] [ K ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        board [ i ] = new char [ N ] ;
        for ( int j = 0 ;
        j < N ;
        j ++ ) {
          if ( board [ i ] [ N - j - 1 ] != '.' ) {
            board [ i ] [ N - n - 1 ] = board [ i ] [ N - j - 1 ] ;
            n ++ ;
          }
        }
      }
      boolean