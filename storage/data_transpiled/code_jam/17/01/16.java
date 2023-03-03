static final int solve ( char [ ] data , int k ) {
  System . setSecurityManager ( new SecurityManager ( ) {
    @ Override public void checkExit ( int status ) {
      super . checkExit ( status ) ;
      status = status ;
    }
  }
  ) ;
  {
    int l = data . length ;
    if ( l == k ) {
      if ( data [ 0 ] == '+' ) {
        return 0 ;
      }
      else if ( data [ 0 ] == '-' ) {
        return 1 ;
      }
      else {
        return - 1 ;
      }
    }
    if ( l < k ) {
      if ( data [ 0 ] == '+' ) {
        return 0 ;
      }
      else {
        return - 1 ;
      }
    }
    int flips = 0 ;
    if ( data [ 0 ] == '-' ) {
      for ( int i = 0 ;
      i <= k ;
      i ++ ) {
        if ( data [ i ] == '+' ) {
          data [ i ] = '-' ;
        }
        else {
          data [ i ] = '+' ;
        }
      }
      flips = 1 ;
    }
    int result = solve ( data , 1 , k ) ;
    if ( result < 0 ) {
      return - 1 ;
    }
    return result + flips ;
  }
}
