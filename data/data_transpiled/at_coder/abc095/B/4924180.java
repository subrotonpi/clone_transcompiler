public static int N ( ) {
  int X = Integer . parseInt ( input . nextLine ( ) ) , N = X ;
  int [ ] mList = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    mList [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  for ( int i : mList ) {
    X -= i ;
    ans ++ ;
  }
  ans += X / Math . min ( mList , N ) ;
  return ans ;
}
