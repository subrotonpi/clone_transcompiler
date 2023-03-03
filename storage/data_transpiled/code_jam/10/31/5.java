static PrintWriter out = new PrintWriter ( "/Users/finn/Downloads/A-large.in" ) {
  @ Override public void close ( ) throws IOException {
  }
}
;
PrintWriter of = new PrintWriter ( new BufferedWriter ( new FileWriter ( "A-large.out" ) ) ) ;
BufferedReader reader = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
String line ;
int cases = Integer . parseInt ( reader . readLine ( ) ) ;
line = 1 ;
for ( int testCase = 0 ;
testCase < cases ;
testCase ++ ) {
  int n = Integer . parseInt ( reader . readLine ( ) ) ;
  line ++ ;
  Wires [ ] wires = new Wires [ n ] ;
  for ( int a = 0 ;
  a < n ;
  a ++ ) {
    String [ ] w = reader . readLine ( ) . split ( "\\s+" ) ;
    wires [ a ] = new Wires ( Integer . parseInt ( w [ 0 ] ) , Integer . parseInt ( w [ 1 ] ) ) ;
    line ++ ;
  }
  print ( wires ) ;
  int total = 0 ;
  for ( int i = 0 ;
  i < wires . length ;
  i ++ ) {
    int j = i + 1 ;
    while ( j < wires . length ) {
      if ( wires [ i ] . x < wires [ j ] . x && wires [ i ] . y > wires [ j ] . y ) {
        total ++ ;
      }
      if ( wires [ i ] . x > wires [ j ] . x && wires [ i ] . y < wires [ j ] . y ) {
        total ++ ;
      }
      j ++ ;
    }
    i ++ ;
  }
  print ( "cross" , total ) ;
  of . println ( "Case #" + ( testCase + 1 ) + ": " + total ) ;
}
