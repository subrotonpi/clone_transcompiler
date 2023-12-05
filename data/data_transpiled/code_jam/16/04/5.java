@ Test public static final String TEST = "large" ;
final String IN = "D-" + TEST + ".in" ;
final String OUT = "D-" + TEST + ".out" ;
/* Run the cases */
final int k = Integer . parseInt ( IN ) ;
final int c = Integer . parseInt ( OUT ) ;
final int s = Integer . parseInt ( IN ) ;
/* Run the cases */
final List < Integer > digs = new ArrayList < Integer > ( ) ;
for ( int i = 0 ;
i < k ;
i ++ ) {
  if ( digs . isEmpty ( ) || digs . get ( digs . size ( ) - 1 ) . intValue ( ) == c ) digs . add ( new ArrayList < Integer > ( ) ) ;
  digs . get ( digs . size ( ) - 1 ) . add ( i ) ;
}
if ( digs . size ( ) > s ) return "IMPOSSIBLE" ;
/* Conv the dig */
final String conv = " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " ;
if ( className == "" )