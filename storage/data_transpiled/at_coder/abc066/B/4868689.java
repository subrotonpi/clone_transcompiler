public static void input ( ) {
  S = input ( ) ;
  int n = S . length ( ) ;
  int r = 0 ;
  for ( int i = 0 ;
  i < n / 2 ;
  i ++ ) {
    for ( int j = 1 ;
    j < n / 2 ;
    j ++ ) {
      if ( i + j * 2 >= 1 + n ) continue ;
      if ( S . substring ( i , i + j ) . equals ( S . substring ( i + j , i + 2 * j ) ) ) r = Math . max ( r , j ) ;
    }
  }
  System . out . println ( r * 2 ) ;
}
