public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) a [ i ] = i ;
  int total = sum ( a ) ;
  int now = a [ 0 ] ;
  int ans = Math . abs ( total - 2 * now ) ;
  for ( int i = 1 ;
  i < a . length - 1 ;
  i ++ ) {
    now += a [ i ] ;
    ans = Math . min ( Math . abs ( total - 2 * now ) , ans ) ;
  }
  return ans ;
}
