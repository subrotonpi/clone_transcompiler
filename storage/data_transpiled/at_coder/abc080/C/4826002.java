public static int [ ] [ ] getN ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] F = new int [ N ] [ 10 ] ;
  int [ ] [ ] P = new int [ N ] [ 10 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    F [ i ] [ 0 ] = Integer . parseInt ( input ( ) . nextLine ( ) ) ;
  }
  int [ ] [ ] P = new int [ N ] [ 10 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P [ i ] [ 0 ] = Integer . parseInt ( input ( ) . nextLine ( ) ) ;
  }
  int ans = - 10 * 10 ;
  /* calc the sum of the sum */
  dfs ( ans ) ;
  if ( ans == 10 ) {
    if ( max ( b ) == 0 ) return null ;
    ans = max ( ans , calc ( b ) ) ;
    return null ;
  }
  dfs ( b + [ 0 ] ) ;
  dfs ( b + [ 1 ] ) ;
  System . out . println ( ans ) ;
}
