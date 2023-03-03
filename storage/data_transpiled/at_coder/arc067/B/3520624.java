public static int n ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] x = new int [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( ( x [ i + 1 ] - x [ i ] ) * a >= b ) ret += b ;
    else ret += ( x [ i + 1 ] - x [ i ] ) * a ;
  }
  return ret ;
}
