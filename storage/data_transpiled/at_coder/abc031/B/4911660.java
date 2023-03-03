public static int [ ] getLevels ( ) {
  int L = Integer . parseInt ( input . readLine ( ) ) ;
  int H = Integer . parseInt ( input . readLine ( ) ) ;
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] l = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . readLine ( ) ) ;
    if ( x < L ) {
      l [ i ] = L - x ;
    }
    else if ( L <= x && x <= H ) {
      l [ i ] = 0 ;
    }
    else {
      l [ i ] = - 1 ;
    }
  }
  for ( int x : l ) {
    System . out . println ( x ) ;
  }
  return l ;
}
