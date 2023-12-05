@ Test public static void main ( String TEST ) throws IOException {
  final String IN = "A-" + TEST + ".in" ;
  final String OUT = "A-" + TEST + ".out" ;
  /* Run the cases in the test */
  double d = Double . parseDouble ( IN ) ;
  double h = Double . parseDouble ( OUT ) ;
  /* Run the cases in the test */
  Scanner fin = new Scanner ( new File ( IN ) ) ;
  PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( OUT ) ) ) ;
  int t = Integer . parseInt ( fin . nextLine ( ) . trim ( ) ) ;
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    d = Integer . parseInt ( fin . nextLine ( ) . trim ( ) ) ;
    int n = Integer . parseInt ( fin . nextLine ( ) . trim ( ) ) ;
    h = new double [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) h [ j ] = tuple ( Integer . parseInt ( fin . nextLine ( ) . trim ( ) ) ) ;
    double res = run ( d , h ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + res ) ;
  }
  if ( Class . forName ( "org.apache.commons.logging.StringUtils" ) . equals ( TEST ) ) {
    /* Run the test cases in the test cases */
    System . out . println ( "Case #" + ( i + 1 ) + ": " + res ) ;
  }
}
