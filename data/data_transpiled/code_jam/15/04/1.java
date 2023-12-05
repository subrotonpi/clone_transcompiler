public static String omino ( int x , int r , int c ) {
  if ( x >= 7 ) return "RICHARD" ;
  if ( ( r * c ) % x != 0 ) return "RICHARD" ;
  if ( x > Math . max ( r , c ) ) return "RICHARD" ;
  if ( ( x + 1 ) / 2 > Math . min ( r , c ) ) return "RICHARD" ;
  if ( x == 4 && Math . min ( r , c ) == 2 ) return "RICHARD" ;
  if ( x == 5 && Math . min ( r , c ) == 3 && Math . max ( r , c ) == 5 ) return "RICHARD" ;
  if ( x == 6 && Math . min ( r , c ) == 3 ) return "RICHARD" ;
  return "GABRIEL" ;
}
int t = input . nextInt ( ) ;
for ( int j : xrange ( t ) ) {
  x = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  r = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  c = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  System . out . println ( "Case #" + ( j + 1 ) + ": " + omino ( x , r , c ) ) ;
}
