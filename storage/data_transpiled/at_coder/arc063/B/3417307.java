public static int N ( int T ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int min_a = A [ 0 ] ;
  int profit = 0 ;
  int ans = 0 ;
  for ( int a : A [ 1 ] ) {
    min_a = Math . min ( min_a , a ) ;
    if ( a - min_a > profit ) {
      profit = a - min_a ;
      ans = 1 ;
    }
    else if ( a - min_a == profit ) {
      ans ++ ;
    }
  }
  return ans ;
}
