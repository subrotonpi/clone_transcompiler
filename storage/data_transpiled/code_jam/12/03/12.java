static final int N = 2 ;
String problem = "C" ;
boolean practice = false ;
if ( practice ) {
  practice = "-practice" ;
}
else {
  practice = "" ;
}
if ( case == 0 ) {
  infile = new BufferedReader ( new FileReader ( problem + "-" + "sample" + practice + ".in" ) ) ;
  outfile = new PrintWriter ( problem + "-" + "sample" + practice + ".out" ) ;
}
else if ( case == 1 ) {
  infile = new BufferedReader ( new FileReader ( problem + "-" + "small" + practice + ".in" ) ) ;
  outfile = new PrintWriter ( problem + "-" + "small" + practice + ".out" ) ;
}
else if ( case == 2 ) {
  infile = new BufferedReader ( new FileReader ( problem + "-" + "large" + practice + ".in" ) ) ;
  outfile = new PrintWriter ( problem + "-" + "large" + practice + ".out" ) ;
}
else {
  throw new IllegalArgumentException ( "Invalid case" ) ;
}
/* permute */
assert ( num != null ) ;
int [ ] output = new int [ 10 ] ;
int digits = ( int ) N . ceil ( N . log10 ( num ) ) ;
int current = num ;
for ( int i = 0 ;
i < digits - 1 ;
i ++ ) {
  current = current / 10 + 10 * ( digits - 1 ) * ( current % 10 ) ;
  if ( current <= num ) continue ;
  if ( current > maxval ) continue ;
  if ( ! output [ i ] ) {
    output [ i ] = current ;
  }
}
/* count recycled */
int count = 0 ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  count += permute ( num , output [ i ] ) ;
}
int cases = Integer . parseInt ( infile . readLine ( ) . trim ( ) ) ;
for ( int i = 0 ;
i < cases ;
i ++ ) {
  String A = infile . readLine ( ) ;
  String B = infile . readLine ( ) ;
  int A = Integer . parseInt ( A ) ;
  int B = Integer . parseInt ( B ) ;
  String output = "" + countRecycled ( A , B ) ;
  outfile . println ( "Case #" + ( i + 1 ) + ": " + output ) ;
}
return cases ;
}
