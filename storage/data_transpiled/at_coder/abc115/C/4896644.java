public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] h = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) h [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  Arrays . sort ( h ) ;
  int [ ] hK = h . clone ( ) ;
  int ans = hK [ K - 1 ] - h [ 0 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans = Math . min ( ans , h [ i + K - 1 ] - h [ i ] ) ;
  }
  return ans ;
}
