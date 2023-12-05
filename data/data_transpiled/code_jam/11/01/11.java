static final String print ( ) throws IOException {
  final BufferedReader fi = new BufferedReader ( new FileReader ( "A-large.in" ) ) ;
  final PrintWriter fo = new PrintWriter ( new BufferedWriter ( new FileWriter ( "A-large.out" ) ) ) ;
  final int t = Integer . parseInt ( fi . readLine ( ) ) ;
  for ( ;
  ;
  ) {
    final String in = fi . readLine ( ) . split ( " " ) ;
    final int n = Integer . parseInt ( in . substring ( 0 , 1 ) ) ;
    final String btn = Integer . toString ( n ) ;
    int o = 0 ;
    int b = 1 ;
    int to = 0 ;
    int tb = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( btn . charAt ( i ) == 'O' ) {
        to = to + Math . abs ( btn . charAt ( i ) - o ) + 1 ;
        o = btn . charAt ( i ) ;
        to = Math . max ( to , tb ) ;
        tb = tb + 1 ;
      }
    }
    fo . println ( "Case #" + i + ": " + max ( to , tb ) ) ;
  }
}
