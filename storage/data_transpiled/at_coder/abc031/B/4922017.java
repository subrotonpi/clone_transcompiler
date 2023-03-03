public static int [ ] manage ( int L , int H , int N , @ Nonnull int [ ] A ) {
  int [ ] ret = new int [ A . length ] ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    int a = A [ i ] ;
    if ( a < L ) {
      ret [ i ] = L - a ;
    }
    else if ( H < a ) {
      ret [ i ] = - 1 ;
    }
    else {
      ret [ i ] = 0 ;
    }
  }
  if ( getClass ( ) . equals ( "org.apache.commons.math.util.NumberUtils" ) ) {
    L = Integer . parseInt ( input . readLine ( ) ) ;
    H = Integer . parseInt ( input . readLine ( ) ) ;
    N = Integer . parseInt ( input . readLine ( ) ) ;
    A = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      A [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
    }
  }
  int [ ] ans = manage ( L , H , N , A ) ;
  for ( int a : ans ) {
    System . out . println ( a ) ;
  }
  return ret ;
}
