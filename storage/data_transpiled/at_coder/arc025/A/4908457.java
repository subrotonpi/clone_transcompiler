public static int [ ] D ( ) {
  int [ ] J = new int [ 7 ] ;
  for ( int i = 0 ;
  i < 7 ;
  i ++ ) {
    J [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < 7 ;
  i ++ ) {
    ans += Math . max ( D [ i ] , J [ i ] ) ;
  }
  System . out . println ( ans ) ;
  return J ;
}
