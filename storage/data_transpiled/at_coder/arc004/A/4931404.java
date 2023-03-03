static final double [ ] [ ] x ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] x = new int [ n ] [ ] ;
  int [ ] [ ] y = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    x [ i ] = a ;
    y [ i ] = b ;
  }
  double ans = 0.0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      ans = Math . max ( ans , Math . sqrt ( ( x [ i ] - x [ j ] ) * ( x [ i ] - x [ j ] ) + ( y [ i ] - y [ j ] ) * ( y [ j ] - y [ j ] ) ) ) ;
    }
  }
  return ans ;
}
