public static String [ ] genPerms ( String str ) throws IOException {
  String [ ] result ;
  if ( str . length ( ) <= 1 ) {
    result = new String [ str . length ( ) ] ;
  }
  else {
    for ( int i = 0 ;
    i < str . length ( ) ;
    i ++ ) {
      result [ i ] = str . substring ( 0 , i ) + str . substring ( 0 , 1 ) + str . substring ( i ) ;
    }
  }
  /* Calculate the RLC */
  int RLC = 1 ;
  String prev = result [ 0 ] ;
  for ( int i = 1 ;
  i < result . length ;
  i ++ ) {
    if ( prev != result [ i ] ) {
      RLC = RLC + 1 ;
    }
    prev = result [ i ] ;
  }
  BufferedReader in = new BufferedReader ( new FileReader ( "D-small-attempt0.in" ) ) ;
  PrintWriter out = new PrintWriter ( new BufferedWriter ( new FileWriter ( "D-small-out.out" ) ) ) ;
  int cases = Integer . parseInt ( in . readLine ( ) ) ;
  for ( int caseNum = 1 ;
  caseNum <= cases ;
  caseNum ++ ) {
    int k = Integer . parseInt ( in . readLine ( ) ) ;
    String permutedString = "" ;
    for ( int i = 0 ;
    i < string . length ( ) ;
    i += k ) {
      for ( int j = 0 ;
      j < perm . length ( ) ;
      j ++ ) {
        permutedString += string . charAt ( i + j ) ;
      }
    }
    RLC = calcRLC ( permutedString ) ;
    if ( RLC < minRLC ) {
      minRLC = RLC ;
    }
  }
  String outputString = "Case #" + caseNum + ": " + minRLC + "\n" ;
  System . out . println ( outputString . toString ( ) ) ;
  out . println ( outputString ) ;
  return result ;
}
