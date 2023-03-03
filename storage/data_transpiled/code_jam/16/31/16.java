static final private char letter ( char x ) throws IOException {
  return ( char ) ( 'A' + x ) ;
  /* solve test */
  int n = Integer . parseInt ( in . readLine ( ) ) ;
  StringBuilder ans = new StringBuilder ( n ) ;
  int [ ] counts = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    counts [ i ] = Integer . parseInt ( in . readLine ( ) ) ;
  }
  int total = Arrays . binarySearch ( counts , x ) ;
  if ( total % 2 == 1 ) {
    int winner = counts [ counts . length - 1 ] ;
    ans . append ( letter ( winner ) ) ;
    counts [ winner ] -- ;
  }
  while ( Arrays . binarySearch ( counts , x ) > 0 ) {
    int winner1 = counts [ counts . length - 1 ] ;
    counts [ winner1 ] -- ;
    int winner2 = counts [ counts . length - 1 ] ;
    counts [ winner2 ] -- ;
    ans . append ( letter ( winner1 ) ) ;
    ans . append ( letter ( winner2 ) ) ;
  }
  /* solve dumb */
  char [ ] in = '1' ;
  BufferedReader inpDumbReader = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  PrintWriter out = new PrintWriter ( System . out ) ;
  PrintWriter outDumbReader = new PrintWriter ( System . out ) ;
  int nTests = Integer . parseInt ( in . readLine ( ) ) ;
  for ( int i = 0 ;
  i < nTests ;
  i ++ ) {
    char ans = solveTest ( in ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ans + ": " ) ;
    char ansDumbed = solveDumbReader ( inpDumbReader ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ansDumbed + ": " ) ;
    if ( ans != ansDumbed ) {
      System . err . println ( "Wrong" + ( i + 1 ) ) ;
    }
  }
  out . close ( ) ;
  return ans . toString ( ) ;
}
