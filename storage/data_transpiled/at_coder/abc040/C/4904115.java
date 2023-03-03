public static int [ ] getdp ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] X = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int [ ] dp = new int [ n ] ;
  dp [ 0 ] = 0 ;
  dp [ 1 ] = Math . abs ( X [ 1 ] - X [ 0 ] ) ;
  for ( int i = 2 ;
  i < n ;
  i ++ ) {
    dp [ i ] = Math . min ( dp [ i - 1 ] , dp [ i - 1 ] ) ;
  }
  return dp ;
}
