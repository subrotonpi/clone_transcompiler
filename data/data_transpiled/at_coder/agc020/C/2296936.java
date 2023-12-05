public static int N = Integer . parseInt ( input ) {
  int * A , S ;
  A = Integer . parseInt ( input . nextLine ( ) ) ;
  S = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = 1 ;
  for ( int a : A ) {
    b |= b << a ;
  }
  b >>= ( S + 1 ) / 2 ;
  return ( b & - b ) . bitLength ( ) - 1 + ( S + 1 ) / 2 ;
}
