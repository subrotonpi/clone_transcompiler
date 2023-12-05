public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] hn = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) hn [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  Arrays . sort ( hn ) ;
  int ans = 10 * 12 ;
  for ( int i = 0 ;
  i < N - ( K - 1 ) ;
  i ++ ) ans = Math . min ( ans , hn [ i + ( K - 1 ) ] - hn [ i ] ) ;
  return ans ;
}
