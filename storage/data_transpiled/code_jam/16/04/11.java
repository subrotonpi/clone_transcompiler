static final String INPUT = "tiny" ;
INPUT = "D-small-attempt0.in" ;
INPUT = "D-large.in" ;
/* debug */
System . err . println ( INPUT . toString ( ) ) ;
/* iterate over the rng */
int v = 0 ;
for ( int i = 0 ;
i < K ;
i ++ ) {
  v *= K ;
  v += i ;
}
/* do trial */
if ( S * C < K ) return "IMPOSSIBLE" ;
final StringBuilder r = new StringBuilder ( ) ;
int checkedMax = 0 ;
while ( checkedMax < K ) {
  final List < Integer > rng = Lists . newArrayList ( ) ;
  for ( int i = checkedMax ;
  i < Math . min ( checkedMax + C , K ) ;
  i ++ ) {
    rng = ( new ArrayList < Integer > ( ) ) . add ( 0 ) ;
  }
  rng = ( new ArrayList < Integer > ( ) ) . add ( rng ) ;
  v = iterate ( rng , K ) ;
  checkedMax += C ;
  r . append ( v + 1 ) ;
}
BufferedReader br = new BufferedReader ( new InputStreamReader ( new FileInputStream ( INPUT ) ) ) ;
String line ;
int T = Integer . parseInt ( br . readLine ( ) . substring ( 0 , line . length ( ) - 1 ) ) ;
for ( int i = 0 ;
i < T ;
i ++ ) {
  K = Integer . parseInt ( br . readLine ( ) . substring ( 0 , line . length ( ) - 1 ) ) ;
  C = Integer . parseInt ( br . readLine ( ) . substring ( line . length ( ) - 1 ) ) ;
  S = Integer . parseInt ( br . readLine ( ) ) ;
  v = doTrial ( K , C , S ) ;
  System . out . println ( "Case #" + ( i + 1 ) + ": " + v ) ;
}
return r . toString ( ) ;
}
