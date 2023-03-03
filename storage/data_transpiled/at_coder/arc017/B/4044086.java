public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] inputs = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) inputs [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  int length = 1 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) if ( inputs [ i ] < inputs [ i ] ) length ++ ;
  return ans ;
}
