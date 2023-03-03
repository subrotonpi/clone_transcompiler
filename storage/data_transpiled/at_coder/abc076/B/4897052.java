public static void print ( int n = Integer . parseInt ( input ) ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  dp = new int [ n + 1 ] [ ] ;
  dp [ 0 ] [ 0 ] = 1 ;
  dp [ 0 ] [ 1 ] = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    dp [ i ] [ 0 ] = Math . min ( dp [ i - 1 ] [ 0 ] , dp [ i - 1 ] [ 1 ] ) * 2 ;
    dp [ i ] [ 1 ] = Math . min ( dp [ i - 1 ] [ 0 ] , dp [ i - 1 ] [ 1 ] ) + k ;
  }
  System . out . println ( Math . min ( dp [ n ] [ 0 ] , dp [ n ] [ 1 ] ) ) ;
}
