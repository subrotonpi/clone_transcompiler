static final String gcd ( int x , int y ) throws IOException {
  if ( y == 0 ) return x ;
  else return gcd ( y , x % y ) ;
}
final String po = "Possible" ;
final String br = "Broken" ;
/* solve the number of numbers */
if ( x == 0 ) {
  if ( y == 100 ) return br ;
  /* else if (y > 0 && y == 0) return br;*/
  if ( y < 100 && y == 100 ) return br ;
  int t = 100 / gcd ( x , 100 ) ;
  if ( n < t ) return br ;
  /* else */
}
BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
String [ ] lines = new String [ 2 ] ;
for ( String x = br . readLine ( ) ;
x != null ;
x = br . readLine ( ) ) lines [ 0 ] = x ;
br . close ( ) ;
t = Integer . parseInt ( lines [ 0 ] ) ;
for ( int i : xrange ( t ) ) {
  final int n = Integer . parseInt ( lines [ i + 1 ] ) ;
  final int d = Integer . parseInt ( lines [ i + 1 ] ) ;
  final int g = Integer . parseInt ( lines [ i + 2 ] ) ;
  if ( lines [ i + 1 ] . split ( " " ) . length > 3 ) n = 200 ;
  final String ans = solve ( n , d , g ) ;
  System . out . println ( "Case #" + ( i + 1 ) + ": " + ans ) ;
}
