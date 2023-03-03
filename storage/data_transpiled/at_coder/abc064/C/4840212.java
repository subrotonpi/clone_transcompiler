public static int N = Integer . parseInt ( input ) {
  int [ ] a = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] color = new int [ 9 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( a [ i ] / 400 >= 8 ) {
      color [ 8 ] ++ ;
    }
    else {
      color [ a [ i ] / 400 ] ++ ;
    }
  }
  int cnt = 0 ;
  for ( int i = 0 ;
  i < 8 ;
  i ++ ) {
    if ( color [ i ] > 0 ) {
      cnt ++ ;
    }
  }
  int mx = cnt + color [ 8 ] ;
  if ( cnt > 0 ) {
    int mn = cnt ;
  }
  else {
    mn = 1 ;
  }
  return mn ;
}
