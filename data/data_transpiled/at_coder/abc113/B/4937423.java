public static int N = Integer . parseInt ( input ) {
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] H = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    H [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  double que = T - 0.006 * H [ 0 ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    double temp = T - 0.006 * H [ i ] ;
    if ( Math . abs ( A - que ) > Math . abs ( A - temp ) ) {
      que = temp ;
      ans = i ;
    }
  }
  System . out . println ( ans + 1 ) ;
  return ans ;
}
