public static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] ansMap = new int [ 50 * ( j + 1 ) + 1 ] [ N ] ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    for ( int n = 0 ;
    n < X ;
    n ++ ) {
      ansMap [ n ] [ n ] = 0 ;
      for ( int x = 0 ;
      x <= count ;
      x ++ ) {
        for ( int y = 0 ;
        y < ansMap [ x ] . length ;
        y ++ ) {
          if ( ansMap [ x ] [ y ] != 0 ) {
            ansMap [ x + 1 ] [ y + n ] += ansMap [ x ] [ y ] ;
          }
        }
      }
      ansMap [ 0 ] [ n ] ++ ;
    }
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans += ansMap [ i ] [ A * ( i + 1 ) ] ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
