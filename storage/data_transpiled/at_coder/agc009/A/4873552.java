public static int N = Integer . parseInt ( input ) {
  int [ ] A = new int [ N ] ;
  int [ ] B = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int Ai = Integer . parseInt ( input . nextLine ( ) ) ;
    int Bi = Integer . parseInt ( input . nextLine ( ) ) ;
    A [ i ] = Ai ;
    B [ i ] = Bi ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( ( A [ i ] + ans ) % B [ i ] == 0 ) continue ;
    ans += B [ i ] - ( ( A [ i ] + ans ) % B [ i ] ) ;
  }
  return ans ;
}
