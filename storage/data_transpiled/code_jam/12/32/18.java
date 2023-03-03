static final String PROBLEM = System . getProperty ( "user.profile" ) . substring ( 0 , 1 ) . toUpperCase ( ) ;
final String DL_DIR = System . getProperty ( "user.profile" ) + "Downloads" + PROBLEM ;
String [ ] aData ;
String [ ] outData = map ( in . nextLine ( ) . split ( " " ) ) ;
pp ( "Case #" + testCase + ":" ) ;
for ( int i = 0 ;
i < aData . length ;
i ++ ) {
  double d = Math . sqrt ( 2.0 * d / aData [ i ] ) ;
  pp ( Double . toString ( d ) ) ;
}
out . close ( ) ;
in . close ( ) ;
out . close ( ) ;
out . close ( ) ;
final String OUT_PATH = DL_DIR + "-large.ot" ;
if ( outData . length > 0 ) {
  final String [ ] inputs = Files . readAllStrings ( Paths . get ( DL_DIR + "-small-attempt[0-9].in" ) ) ;
  int maxnum = - 1 ;
  for ( final String inpFn : inputs ) {
    if ( Integer . parseInt ( inpFn . substring ( inpFn . length ( ) - 4 ) ) > maxnum ) maxnum = Integer . parseInt ( inpFn . substring ( inpFn . length ( ) - 4 ) ) ;
  }
  if ( maxnum > - 1 ) {
    INP_PATH = DL_DIR + "-small-attempt" + maxnum + ".in" ;
    OUT_PATH = DL_DIR + "-small-attempt" + maxnum + ".ot" ;
  }
  else {
    INP_PATH = Paths . get ( ".." , "data" , PROBLEM + ".in" ) ;
    OUT_PATH = Paths . get ( ".." , "data" , PROBLEM + ".ot" ) ;
  }
}
final BufferedReader in = new BufferedReader ( new FileReader ( INP_PATH ) ) ;
final PrintWriter out = new PrintWriter ( new BufferedWriter ( new FileWriter ( OUT_PATH ) ) ) ;
{
  pp ( out ) ;
  System . out . println ( "" ) ;
}
@ SuppressWarnings ( "unused" ) final int NUM_CASES = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
for ( int testCase = 1 ;
testCase <= NUM_CASES ;
testCase ++ ) {
  String soln = "" ;
  