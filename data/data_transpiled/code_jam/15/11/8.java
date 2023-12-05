public static int tc = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
for ( int t = 0 ;
t < tc ;
t ++ ) {
  int n = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int [ ] v = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) v [ i ] = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int a = Integer . valueOf ( Math . max ( 0 , v [ i ] - v [ i + 1 ] ) ) ;
  int b = Integer . valueOf ( Math . max ( 0 , v [ i ] - v [ i + 1 ] ) ) ;
  int c = Integer . valueOf ( Math . min ( b , v [ i ] ) ) ;
  System . out . println ( "Case #" + ( t + 1 ) + ": " + a + " " + c ) ;
}
return tc ;
}
