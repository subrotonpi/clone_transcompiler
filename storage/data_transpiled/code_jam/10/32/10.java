static final String inf = "B-large.in" ;
final Scanner f_in = new Scanner ( inf ) ;
final PrintWriter f_out = new PrintWriter ( new BufferedWriter ( new FileWriter ( "out.txt" ) ) ) {
  int n = 0 ;
  /* find parts */
  int parts = 1 ;
  long t = l * c ;
  while ( t < p ) {
    parts ++ ;
    t *= c ;
  }
  /* slove */
  String [ ] ln = f_in . next ( ) . split ( "\\s" ) ;
  l = Integer . parseInt ( ln [ 0 ] ) ;
  p = Integer . parseInt ( ln [ 1 ] ) ;
}
