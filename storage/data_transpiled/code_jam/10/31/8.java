String inf = "A-large.in" ;
final Scanner f_in = new Scanner ( inf ) ;
final PrintWriter f_out = new PrintWriter ( new BufferedWriter ( new FileWriter ( "out.txt" ) ) ) ;
{
  if ( f_in . hasNext ( ) ) {
    if ( f_in . nextInt ( ) % 10 == 0 ) {
      print ( f_in . nextInt ( ) ) ;
    }
    int n = Integer . parseInt ( f_in . next ( ) ) ;
    int [ ] [ ] wires = new int [ n ] [ ] ;
    for ( int i : xrange ( n ) ) {
      final String [ ] l = f_in . next ( ) . split ( "\\s+" ) ;
      wires [ i ] = Integer . parseInt ( l [ i ] ) ;
    }
  }
  Collections . sort ( wires ) ;
  int ans = 0 ;
  int T = Integer . parseInt ( f_in . next ( ) ) ;
  for ( int i = 1 ;
  i <= T ;
  i ++ ) {
    slove ( i ) ;
  }
  f_out . close ( ) ;
}
