static final int [ ] getStdOut ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int b = 0 ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    int a = A [ i ] ;
    if ( i + b < a ) {
      System . out . println ( - 1 ) ;
      System . exit ( 0 ) ;
    }
    else {
      b = a - i ;
    }
  }
  int ans = 0 ;
  int pre = - 1 ;
  for ( int a : A ) {
    if ( pre - 1 != a ) {
      ans += a ;
    }
    pre = a ;
  }
  return ans ;
}
