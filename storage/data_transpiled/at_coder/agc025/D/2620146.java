public static int judge ( int D ) {
  int n = 0 ;
  while ( D % 4 == 0 ) {
    n ++ ;
    D /= 4 ;
  }
  {
    int h1 = ~ ( ( D >>> n ) ^ ( D >>> n ) ) & 1 ;
    int h2 = ~ ( D >>> n ) & 1 ;
    return D % 2 == 1 ? h1 : h2 ;
  }
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int D1 = Integer . parseInt ( input . nextLine ( ) ) ;
  int D2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int j1 = judge ( D1 ) , j2 = judge ( D2 ) ;
  int cnt = 0 ;
  for ( int x = 0 ;
  x < N * 2 ;
  x ++ ) {
    for ( int y = 0 ;
    y < N * 2 ;
    y ++ ) {
      if ( j1 ( x , y ) && j2 ( x , y ) ) {
        System . out . println ( x + " " + y ) ;
        cnt ++ ;
        if ( cnt >= N * N ) exit ( ) ;
      }
    }
  }
  return N ;
}
