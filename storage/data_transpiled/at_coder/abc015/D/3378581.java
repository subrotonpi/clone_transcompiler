public static int w = Integer . parseInt ( input ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] lis = new int [ 100 ] [ 10 * 8 ] ;
  for ( int i = 0 ;
  i < 100 ;
  i ++ ) lis [ i ] [ 0 ] = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int j = i ;
    j >= 0 ;
    j -- ) {
      for ( int h = 0 ;
      h < ans + 1 ;
      h ++ ) lis [ j + 1 ] [ h + b ] = Math . min ( lis [ j ] [ h ] + a , lis [ j + 1 ] [ h + b ] ) ;
    }
    ans += b ;
  }
  int cou = 0 ;
  for ( int i = 0 ;
  i < k + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 10 * 5 ;
    j ++ ) if ( lis [ i ] [ j ] <= w ) cou = Math . max ( cou , j ) ;
  }
  System . out . println ( cou ) ;
  return ans ;
}
