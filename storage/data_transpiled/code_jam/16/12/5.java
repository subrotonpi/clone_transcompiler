@ task ( "B" ) public static void main ( String task ) throws IOException {
  int type = 2 ;
  @ SuppressWarnings ( "resource" ) Scanner in ;
  if ( type == 0 ) in = new Scanner ( new File ( "sample.in" ) ) ;
  else if ( type == 1 ) in = new Scanner ( new File ( task + "-small.in" ) ) ;
  else in = new Scanner ( new File ( task + "-large.in" ) ) ;
  PrintStream outp = new PrintStream ( new File ( task + ".out" ) ) ;
  int T = Integer . parseInt ( in . nextLine ( ) . substring ( 0 , in . nextLine ( ) . length ( ) - 1 ) ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    List < String > ans = new ArrayList < String > ( ) ;
    int N = Integer . parseInt ( in . nextLine ( ) . substring ( 0 , in . nextLine ( ) . length ( ) - 1 ) ) ;
    Counter < String > c = new ClassicCounter < String > ( ) ;
    for ( int j = 0 ;
    j < 2 * N - 1 ;
    j ++ ) {
      String [ ] s = in . nextLine ( ) . substring ( 0 , in . nextLine ( ) . length ( ) - 1 ) . split ( " " ) ;
      for ( String k : s ) c . incrementCount ( k ) ;
    }
    for ( Map . Entry < String , Integer > val : c . entrySet ( ) ) {
      if ( val . getValue ( ) % 2 == 1 ) ans . add ( val . getKey ( ) ) ;
    }
    Collections . sort ( ans , Integer . CASE_INSENSITIVE_ORDER ) ;
    outp . println ( "Case #" + ( i + 1 ) + ": " + ans . toString ( ) ) ;
  }
}
