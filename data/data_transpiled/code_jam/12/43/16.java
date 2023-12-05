static final int depth = 0 ;
final int i = 0 ;
final String FAIL = "Impossible" ;
final int N = 0 ;
final int [ ] X = new int [ N ] ;
int [ ] res = new int [ N + 1 ] ;
res [ 0 ] = 10 * 9 ;
if ( ! aux ( X , 1 , res , 0 ) ) return FAIL ;
for ( i = 1 ;
i < N ;
i ++ ) {
  X [ i ] = i ;
}
/* Run case */
final int [ ] res = new int [ N ] ;
res [ 0 ] = 10 * 9 ;
if ( ! aux ( X , 1 , res , 0 ) ) return FAIL ;
for ( int i = 1 ;
i < N ;
i ++ ) {
  X [ i ] = i - 1 ;
}
/* Run case */
final String DEBUG = "f" ;
@ SuppressWarnings ( "resource" ) final String [ ] readWords = readWords ( ) . split ( " " ) ;
final int [ ] readInts = new int [ N ] ;
final int [ ] readInts = new int [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  readInts [ i ] = readInts [ i ] ;
}
final int [ ] readFloats = new int [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  readFloats [ i ] = readFloats [ i ] ;
}
final int [ ] res = new int [ N ] ;
for ( int i = 0 ;
i < R ;
i ++ ) {
  res [ i ] = reader . read ( in , i ) ;
}
/* Solve case */
final String inFn = fn + ".in" ;
if ( outFn == null ) {
  outFn = fn + ".out" ;
}
try {
  final Scanner fi = new Scanner ( new File ( inFn ) ) ;
  final PrintWriter fo = new PrintWriter ( new File ( outFn ) ) ;
  final int T = readInt ( fi ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    final int [ ] testCase = readCase ( fi ) ;
    res = solver . solve ( testCase ) ;
    writeCase ( fo , i , res ) ;
  }
}
catch ( final Exception e ) {
  e . printStackTrace ( ) ;
}
/* Run case */
final int N = readIntArray ( ) ;
final int [ ]