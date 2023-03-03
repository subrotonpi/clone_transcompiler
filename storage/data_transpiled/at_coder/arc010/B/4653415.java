static int [ ] l = {
  31 , 29 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 }
  ;
  int [ ] d = new int [ 12 ] ;
  for ( int i = 0 ;
  i < 11 ;
  i ++ ) {
    d [ i + 1 ] = d [ i ] + l [ i ] ;
  }
  int [ ] cal = new int [ 367 ] ;
  for ( int i = 6 ;
  i < 367 ;
  i += 7 ) {
    cal [ i ] = 1 ;
    cal [ i + 1 ] = 1 ;
  }
  cal [ 0 ] = 1 ;
  int n = Integer . parseInt ( input ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int m = Integer . parseInt ( input ( ) ) ;
    int w = Integer . parseInt ( input ( ) ) ;
    while ( cal [ d [ m - 1 ] + w - 1 ] == 1 ) {
      w ++ ;
    }
    cal [ d [ m - 1 ] + w - 1 ] = 1 ;
    cal [ cal . length - 1 ] = 0 ;
  }
  int cnt = 0 ;
  int ans = 2 ;
  boolean b = false ;
  for ( int i = 0 ;
  i < 367 ;
  i ++ ) {
    if ( cal [ i ] == 1 ) {
      cnt ++ ;
      b = true ;
    }
    else if ( b && cal [ i ] == 0 ) {
      if ( ans < cnt ) {
        ans = cnt ;
      }
      cnt = b = false ;
    }
  }
  System . out . println ( ans ) ;
  return cal ;
}
