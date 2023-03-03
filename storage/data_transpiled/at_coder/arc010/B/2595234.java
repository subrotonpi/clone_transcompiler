public static int dc ( int m , int d ) {
  int [ ] mon = {
    31 , 29 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 }
    ;
    return dc ( mon , 0 , m - 1 , d ) ;
  }
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] x = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    m = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    d = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    x [ i ] = dc ( m , d ) ;
  }
  Arrays . sort ( x ) , y = new int [ 368 ] ;
  for ( int i = 1 ;
  i < 366 ;
  i += 7 ) y [ i ] = 1 ;
  for ( int j = 7 ;
  j < 365 ;
  j += 7 ) {
    y [ j ] = 1 ;
  }
  for ( int j = 0 ;
  j < x . length ;
  j ++ ) {
    if ( y [ j ] == 0 ) y [ j ] = 1 ;
    else y [ j ] = 1 ;
  }
  int ans = 0 , num = 0 ;
  for ( int j = 0 ;
  j < y . length ;
  j ++ ) ans += Math . max ( ans , num ) ;
  return ans ;
}
