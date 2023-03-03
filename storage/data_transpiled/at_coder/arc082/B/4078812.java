public static void print ( int n ) {
  int [ ] p = new int [ n ] ;
  for ( String s : input ( ) . split ( " " ) ) p [ 0 ] = Integer . parseInt ( s ) - 1 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( p [ i ] != i ) continue ;
    int j = i + 1 == n ? i - 1 : i + 1 ;
    p [ i ] = p [ j ] ;
    p [ j ] = p [ i ] ;
    ans ++ ;
  }
  System . out . println ( ans ) ;
}
