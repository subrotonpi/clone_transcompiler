public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] schedule = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) schedule [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = - 1 ;
  for ( int i = 2 ;
  i < N ;
  i ++ ) {
    int calc = Integer . parseInt ( schedule [ i - 2 ] ) ;
    if ( calc < K ) {
      ans = i + 1 ;
      break ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
