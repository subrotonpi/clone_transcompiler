public static void main ( String infile , String outfile ) throws IOException {
  BufferedReader in = new BufferedReader ( new FileReader ( infile ) ) ;
  PrintWriter out = new PrintWriter ( new BufferedWriter ( new FileWriter ( outfile ) ) ) ;
  int T = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
  int N = 1 ;
  int L = 1 ;
  int H = 1 ;
  int [ ] breakpoints = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    lcm_list [ i ] = lcm ( freqs [ i ] , lcm_list [ i - 1 ] ) ;
  }
  int lowestPossible = 0 ;
  int [ ] breakpoints = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    breakpoints [ i ] = lowestPossible ;
    if ( breakpoints [ i ] % freqs [ i ] != 0 ) {
      lowestPossible = j ;
      break ;
    }
  }
  if ( breakpoints [ 0 ] >= lowestPossible ) {
    ++ lowestPossible ;
  }
  System . out . println ( "got breakpoints" ) ;
  int answer = getBestPitch ( ) ;
  if ( answer == 0 ) {
    out . println ( "Case #" + ( t + 1 ) + ": NO" ) ;
  }
  else {
    out . println ( "Case #" + ( t + 1 ) + ": " + answer ) ;
  }
  int L = 0 ;
  int L = 0 ;
  int L = 0 ;
  int L = 0 ;
  int H = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( "Case #" + ( t + 1 ) + ": " + ( i + 1 ) + ": " + ( i + 1 ) ) ;
  }
  System . out . println ( "Case #" + ( t + 1 ) + ": " + ( L * L ) + ": " + ( H * L ) ) ;
  System . out . println ( "Case #" + ( t + 1 ) + ": " + ( L * L ) + ": " + ( H * L ) ) ;
  System . out . println ( "Case #" + ( t + 1 ) + ": " + ( L * L ) + ": " + ( H * L ) ) ;
}
