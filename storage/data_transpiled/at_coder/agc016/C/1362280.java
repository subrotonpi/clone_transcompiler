public static int [ ] [ ] getStdIn ( int H , int W , int h , int w ) {
  int r , n , k , w ;
  for ( r = 0 ;
  r < W ;
  r ++ ) {
    n = Integer . parseInt ( input . readLine ( ) ) ;
  }
  if ( W % w != 0 ) {
    r = W % w ;
    n = ( int ) ( W / w ) ;
    n = n + 1 ;
    System . out . println ( "Yes" ) ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      for ( k = 0 ;
      k < W ;
      k ++ ) {
        if ( ( k + 1 ) % w == 0 ) {
          System . out . print ( - n * ( w - 1 ) - 1 ) ;
        }
        else {
          System . out . print ( n ) ;
        }
        if ( k == W - 1 ) {
          System . out . println ( ) ;
        }
        else {
          System . out . print ( " " ) ;
        }
      }
    }
  }
  else if ( H % h != 0 ) {
    r = H % h ;
    n = ( int ) ( H / h ) ;
    n = n + 1 ;
    System . out . println ( "Yes" ) ;
    int store = 0 ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      if ( ( i + 1 ) % h == 0 ) {
        store = - n * ( h - 1 ) - 1 ;
      }
      else {
        store = n ;
      }
      for ( k = 0 ;
      k < W ;
      k ++ ) {
        if ( k == W - 1 ) {
          System . out . print ( store ) ;
        }
        else {
          System . out . print ( store ) ;
        }
      }
    }
  }
  else {
    System . out . println ( "No" ) ;
  }
  return null ;
}
