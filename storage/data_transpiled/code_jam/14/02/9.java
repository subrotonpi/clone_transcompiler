static final double loadDouble ( String className ) throws IOException {
  final String className = className . substring ( className . length ( ) - 3 ) ;
  final BufferedReader in = new BufferedReader ( new FileReader ( className + "" ) ) ;
  final BufferedWriter out = new BufferedWriter ( new FileWriter ( className + ".out" ) ) ;
  final int cases = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
  for ( int i = 0 ;
  i < cases ;
  i ++ ) {
    final double result = loadDouble ( in ) ;
    final double output = solveDouble ( result ) ;
    out . write ( String . format ( "Case #%i: %s\n" , i + 1 , output ) ) ;
    System . out . println ( String . format ( "Case #%i: %s\n" , i + 1 , output ) ) ;
  }
  in . close ( ) ;
  out . close ( ) ;
  return result ;
}
