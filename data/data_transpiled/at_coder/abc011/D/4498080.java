@ VisibleForTesting static int getDistance ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( X % D != 0 || Y % D != 0 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  else {
    int ans = 0 ;
    int cnt_x = Math . abs ( X ) / D ;
    int cnt_y = Math . abs ( Y ) / D ;
    for ( int i = 0 ;
    i < N + 1 ;
    i ++ ) {
      int x = i ;
      int y = N - i ;
      if ( x < cnt_x || y < cnt_y ) continue ;
      if ( ( x - cnt_x ) % 2 != 0 || ( y - cnt_y ) % 2 != 0 ) continue ;
      int tmpx = Math . pow ( x , ( x - cnt_x ) / 2 ) / ( 2 * N ) ;
      int tmpy = Math . pow ( y , ( y - cnt_y ) / 2 ) / ( 2 * N ) ;
      ans += tmpx * tmpy * comb ( N , i ) ;
    }
    System . out . println ( ans ) ;
  }
}
