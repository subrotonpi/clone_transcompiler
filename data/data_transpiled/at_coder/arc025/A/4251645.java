public static int [ ] D ( ) {
  int [ ] D = input . split ( ) ;
  int [ ] J = input . split ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < 7 ;
  i ++ ) {
    ans += Math . max ( D [ i ] , J [ i ] ) ;
  }
  System . out . println ( ans ) ;
  return D ;
}
