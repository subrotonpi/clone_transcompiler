public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] nums = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    nums [ i ] = i ;
  }
  Arrays . sort ( nums , reverse ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    ans += nums [ i ] ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
