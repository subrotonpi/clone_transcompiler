public static int max ( int n , int c ) {
  int [ ] xv = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) xv [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] dx = new int [ n ] ;
  int [ ] dy = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i == 0 ) {
      dx [ i ] = xv [ i ] . intValue ( ) ;
      dy [ i ] = c - xv [ n - i - 1 ] . intValue ( ) ;
    }
    else {
      dx [ i ] = xv [ i ] . intValue ( ) - xv [ i - 1 ] . intValue ( ) ;
      dy [ i ] = - xv [ n - i - 1 ] . intValue ( ) + xv [ n - i ] . intValue ( ) ;
    }
  }
  int [ ] right = new int [ n + 1 ] ;
  int [ ] left = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int r = right [ right . length - 1 ] + xv [ i ] . intValue ( ) - dx [ i ] ;
    int l = left [ left . length - 1 ] + xv [ n - i - 1 ] . intValue ( ) - dy [ i ] ;
    right [ i ] = r ;
    left [ i ] = l ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    right [ i ] = Math . max ( right [ i - 1 ] , right [ i ] ) ;
    left [ i ] = Math . max ( left [ i - 1 ] , left [ i ] ) ;
  }
  int ans = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    int a1 = right [ i ] ;
    int a2 = right [ i ] - xv [ i - 1 ] . intValue ( ) + left [ n - i ] ;
    int a3 = left [ i ] ;
    int a4 = left [ i ] - ( c - xv [ n - i ] . intValue ( ) ) + right [ n - i ] ;
    ans = max ( ans , a1 , a2 , a3 , a4 ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
