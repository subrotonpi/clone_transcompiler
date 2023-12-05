public static int n = Integer . parseInt ( input ) {
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  /* Seprate string */
  int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) % m ;
  }
  int [ ] S = new int [ n ] ;
  int sm = 0 ;
  int ans = 0 ;
  final int [ ] temp = new int [ n ] ;
  /* Comb */
  for ( int a = 0 , b = 0 ;
  a < n ;
  a ++ ) {
    if ( a >= b ) {
      return ( int ) ( Math . factorial ( a ) / ( Math . factorial ( b ) * Math . factorial ( a - b ) ) ) ;
    }
    else {
      return 0 ;
    }
  }
  for ( int a = 0 , b = 0 ;
  a < b ;
  a ++ ) {
    sm = ( sm + a ) % m ;
    S [ a ] += sm ;
  }
  return ans ;
}
