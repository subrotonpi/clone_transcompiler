public static int N = Integer . parseInt ( input ) {
  int [ ] card = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) card [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  card [ N ] = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int pair = card [ i ] / 2 ;
    ans += pair ;
    card [ i ] -= pair * 2 ;
    if ( card [ i ] == 1 && card [ i + 1 ] > 0 ) {
      card [ i ] -- ;
      card [ i + 1 ] -- ;
      ans ++ ;
    }
  }
  return ans ;
}
