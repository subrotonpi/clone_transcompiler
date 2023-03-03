public static String solve ( ) {
  int x = Integer . parseInt ( readLine ( ) ) ;
  int r = Integer . parseInt ( readLine ( ) ) ;
  int c = Integer . parseInt ( readLine ( ) ) ;
  String w = "GABRIEL" ;
  String l = "RICHARD" ;
  if ( x >= 7 ) return l ;
  if ( x == 1 ) return w ;
  if ( r * c % x != 0 ) return l ;
  if ( x == 2 ) return w ;
  if ( r > c ) {
    r = c ;
    c = r ;
  }
  if ( r == 1 ) return l ;
  if ( x == 3 ) return w ;
  if ( r == 2 ) return l ;
  if ( x == 4 ) return w ;
  if ( x == 5 ) {
    if ( r == 3 && c == 5 ) return l ;
    return w ;
  }
  if ( r == 3 ) return l ;
  return w ;
}
int T = Integer . parseInt ( readLine ( ) ) ;
for ( int i : xrange ( T ) ) {
  System . out . println ( "Case #" + ( i + 1 ) + ": " + solve ( ) ) ;
}
