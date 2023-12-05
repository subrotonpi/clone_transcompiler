public static void pr ( String ... a ) throws IOException {
  return ;
  for ( String s : a ) print ( s , "" ) ;
  print ( ) ;
  {
    int res = ( R - 1 ) * ( C / W ) ;
    int x = C / W ;
    if ( C % W == 0 ) res += x - 2 + W + 1 ;
    else res += x - 1 + W + 1 ;
    return ;
  }
  final BufferedReader br = new BufferedReader ( new FileReader ( System . getProperty ( "test.src" ) ) ) ;
  final String out_fname = System . getProperty ( "test.src" ) . substring ( 0 , out_fname . length ( ) - 2 ) + "out" ;
  final BufferedWriter out = new BufferedWriter ( new FileWriter ( out_fname ) ) ;
  final int T = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int tc = 1 ;
  tc <= T ;
  tc ++ ) {
    final int R = Integer . parseInt ( br . readLine ( ) ) ;
    final int C = Integer . parseInt ( br . readLine ( ) ) ;
    final int W = Integer . parseInt ( br . readLine ( ) ) ;
    pr ( R , C , W ) ;
    final int rt = solve ( R , C , W ) ;
    pr ( "Case #" + tc + tc + ": " + rt ) ;
  }
  out . close ( ) ;
}
