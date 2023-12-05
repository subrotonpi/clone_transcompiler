public static void main ( String filename = "C-small-attempt1.in" ) throws IOException {
  String outputname = filename + "out.txt" ;
  BufferedReader inFile = new BufferedReader ( new FileReader ( filename ) ) ;
  PrintWriter outFile = new PrintWriter ( outputname ) ;
  int numCases = Integer . parseInt ( inFile . readLine ( ) ) ;
  for ( int i = 0 ;
  i < numCases ;
  i ++ ) {
    System . out . println ( i ) ;
    String [ ] nextLine = inFile . readLine ( ) . split ( " " ) ;
    int numPlayers = Integer . parseInt ( nextLine [ 0 ] ) ;
    int low = Integer . parseInt ( nextLine [ 1 ] ) ;
    int high = Integer . parseInt ( nextLine [ 2 ] ) ;
    List < Double > players = new ArrayList < Double > ( ) ;
    String [ ] playerLine = inFile . readLine ( ) . split ( " " ) ;
    for ( int j = 0 ;
    j < numPlayers ;
    j ++ ) {
      players . add ( Double . parseDouble ( playerLine [ j ] ) ) ;
    }
    int minFreq = Collections . min ( players ) ;
    List < Integer > possFreqs = new ArrayList < Integer > ( ) ;
    for ( int j = 1 ;
    j <= ( int ) ( high / minFreq ) ;
    j ++ ) {
      possFreqs . add ( j ) ;
    }
    for ( int j = 1 ;
    j <= maxFreq ;
    j ++ ) {
      possFreqs . remove ( j ) ;
    }
  }
  Collections . sort ( possFreqs ) ;
  if ( finals . size ( ) == 0 ) {
    outFile . println ( "Case #" + ( i + 1 ) + ": NO" ) ;
  }
  else {
    outFile . println ( "Case #" + ( i + 1 ) + ": " + ( int ) finals . get ( 0 ) ) ;
  }
}
inFile . close ( ) ;
outFile . close ( ) ;
}
