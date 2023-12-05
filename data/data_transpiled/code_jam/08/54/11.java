static final String FILE_NAME = "D-small-attempt1" ;
final String INPUT_FILE = FILE_NAME + ".in" ;
final String OUTPUT_FILE = FILE_NAME + ".out" ;
/* process case */
int H , W , R , r , c [ ] ;
/* recur */
if ( H < 1 || W < 1 ) {
  return 0 ;
}
if ( H == 1 && W == 1 ) {
  return 1 ;
}
if ( ( x ) -> cache [ ( x ) ] != null ) {
  return cache [ ( x ) ] ;
}
for ( int i : xrange ( R ) ) {
  if ( x == r [ i ] && y == c [ i ] ) {
    return 0 ;
  }
}
/* print "Case #" + case + ":" + cache[(x)] + " " */
if ( ( x ) -> x == 1 && y == 1 ) {
  return 1 ;
}
/* print " " + cache[(x)] + " " */
for ( int i : xrange ( R ) ) {
  if ( x == r [ i ] && y == c [ i ] ) {
    return 0 ;
  }
}
/* print " " + (recur(H,W) % 10007) */
/* main class tee */
class tee {
  public tee ( Object ... fileObjects ) {
  }
  public void write ( String string ) {
    for ( Object fileObject : fileObjects ) {
      fileObject . toString ( ) ;
    }
  }
}
final BufferedReader fpIn = new BufferedReader ( new FileReader ( INPUT_FILE ) ) ;
final BufferedWriter fpOut = new BufferedWriter ( new FileWriter ( OUTPUT_FILE ) ) ;
System . in = fpIn ;
System . out = tee ( System . out , fpOut ) ;
int numCases = Integer . parseInt ( input ( ) ) ;
for ( int testCase = 1 ;
testCase <= numCases ;
testCase ++ ) {
  H = Integer . parseInt ( input ( ) ) ;
  W = Integer . parseInt ( input ( ) ) ;
  r = new int [ H ] ;
  c = new int [ W ] ;
  for ( int i : xrange ( R ) ) {
    int t1 = Integer . parseInt ( input ( ) ) ;
    int t2 = Integer . parseInt ( input ( ) ) ;
    r [ i ] = t1 ;
    c [ i ] = t2 ;
  }
  process