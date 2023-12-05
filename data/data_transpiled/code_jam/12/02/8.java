static final int N = 2 ;
String problem = "B" ;
boolean practice = false ;
int i ;
int depends ;
String output ;
if ( practice ) {
  practice = "-practice" ;
}
else {
  practice = "" ;
}
if ( i == 0 ) {
  infile = new BufferedReader ( new FileReader ( problem + "-" + Math . min ( possible , S ) + ".in" ) ) ;
  outfile = new PrintWriter ( problem + "-" + Math . min ( possible , S ) + ".out" ) ;
}
else if ( i == 1 ) {
  infile = new BufferedReader ( new FileReader ( problem + "-" + Math . min ( possible , S ) + ".in" ) ) ;
  outfile = new PrintWriter ( problem + "-" + Math . min ( possible , S ) + ".out" ) ;
}
else if ( i == 2 ) {
  infile = new BufferedReader ( new FileReader ( problem + "-" + Math . min ( possible , S ) + ".in" ) ) ;
  outfile = new PrintWriter ( problem + "-" + Math . min ( possible , S ) + ".out" ) ;
}
else {
  throw new IllegalArgumentException ( "Invalid case" ) ;
}
final HashMap < Integer , Integer > lookup = new HashMap < Integer , Integer > ( ) ;
/* assert (total == 0) */
assert ( i == 0 ) ;
final int resid = i % 3 ;
final int minNosurprise = ( i / 3 ) ;
final int maxNosurprise = ( i / 3 ) + Math . min ( 1 , resid ) ;
if ( resid == 1 || maxNosurprise == 10 || ( resid == 0 && minNosurprise == 0 ) ) {
  if ( maxNosurprise >= p ) return 1 ;
  else return - 1 ;
}
if ( maxNosurprise >= p ) return 1 ;
else if ( maxNosurprise == p - 1 ) return 0 ;
else return - 1 ;
}
