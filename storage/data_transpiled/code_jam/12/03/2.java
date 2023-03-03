public static String [ ] canons = new String [ xrange ( ) ] ;
/* canonicalize the string to the canons */
String min_string = s ;
for ( int i : xrange ( s . length ( ) ) ) {
  s = s . substring ( 1 ) + s . substring ( 0 ) ;
  if ( s . compareTo ( min_string ) < 0 ) min_string = s ;
}
for ( int i : xrange ( 2000005 ) ) canons [ i ] = canonicalize ( Integer . toString ( i ) ) ;
int T = Integer . parseInt ( readLine ( ) ) ;
for ( int i : xrange ( T ) ) {
  HashMap < String , Integer > counts = new HashMap < String , Integer > ( ) ;
  int A = Integer . parseInt ( readLine ( ) ) ;
  int B = Integer . parseInt ( readLine ( ) ) ;
  for ( int j : xrange ( A , B + 1 ) ) {
    String s = canons [ j ] ;
    if ( ! counts . containsKey ( s ) ) counts . put ( s , 0 ) ;
    counts . put ( s , 1 ) ;
  }
  int num = Integer . parseInt ( readLine ( ) ) * ( counts . get ( s ) - 1 ) / 2 ;
  System . out . println ( "Case #" + ( i + 1 ) + ": " + num ) ;
}
