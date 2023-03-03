public static void readFile ( String infile ) throws IOException {
  BufferedReader br = new BufferedReader ( new FileReader ( "A-large.in" ) ) ;
  int T = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    List < Wire > wires = new ArrayList < Wire > ( ) ;
    int total = 0 ;
    int N = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      Wire wire = new Wire ( "(" + br . readLine ( ) . trim ( ) . replace ( " " , "," ) + ")" ) ;
      for ( Wire otherwire : wires ) {
        if ( ( otherwire . x < wire . x && otherwire . y > wire . y ) || ( otherwire . x > wire . x && otherwire . y < wire . y ) ) {
          total ++ ;
        }
      }
      wires . add ( wire ) ;
    }
    System . out . println ( "Case #" + ( t + 1 ) + ": " + total ) ;
  }
}
