public static double n ( ) {
  double a = Integer . parseInt ( input . nextLine ( ) ) ;
  double b = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] x = new double [ n ] ;
  double [ ] uf = new double [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( a * ( x [ i + 1 ] - x [ i ] ) <= b ) {
      ans += a * ( x [ i + 1 ] - x [ i ] ) ;
      uf [ i + 1 ] = 0 ;
    }
  }
  ans += b * ( sum ( uf ) - 1 ) ;
  return ans ;
}
