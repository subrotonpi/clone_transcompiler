@ GwtIncompatible ( "java.io.BufferedReader" ) public static String readLinesLinesFromFile ( String infname ) throws IOException {
  String infname = "B-large.in" ;
  String oufname = "B-large.out" ;
  File inf = new File ( infname ) ;
  File ouf = new File ( oufname ) ;
  BufferedReader read = new BufferedReader ( new FileReader ( inf ) ) ;
  BufferedWriter out = new BufferedWriter ( new FileWriter ( ouf ) ) ;
  int t = Integer . parseInt ( read . readLine ( ) ) ;
  for ( int test = 0 ;
  test < t ;
  test ++ ) {
    long l = Integer . parseInt ( read . readLine ( ) ) ;
    long p = Integer . parseInt ( read . readLine ( ) ) ;
    long c = Integer . parseInt ( read . readLine ( ) ) ;
    int cnt = 0 ;
    while ( l < p ) {
      cnt ++ ;
      l *= c ;
    }
    out . write ( "Case #" + ( test + 1 ) + ": " + ceil ( log ( cnt , 2 ) ) + "\n" ) ;
  }
  return out . readLine ( ) ;
}
