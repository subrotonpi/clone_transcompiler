public static void readFile ( BufferedReader in ) throws IOException {
  PrintStream out = new PrintStream ( new FileOutputStream ( "spaceEmergencyTest.out" ) ) ;
  int T = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
  for ( int trial = xrange ( T ) ;
  trial < T ;
  trial ++ ) {
    List < Integer > l = new ArrayList < Integer > ( ) ;
    for ( String s : in . readLine ( ) . trim ( ) . split ( " " ) ) {
      l . add ( Integer . parseInt ( s ) ) ;
    }
    int L = l . get ( 0 ) ;
    int t = l . get ( 1 ) ;
    int N = l . get ( 2 ) ;
    int C = l . get ( 3 ) ;
    int a = l . get ( 4 ) ;
    int [ ] distances = a * ( N / C + 1 ) ;
    Arrays . sort ( distances ) ;
    System . out . println ( "working on case" + ( trial + 1 ) ) ;
    int cost = Arrays . binarySearch ( distances , 0 , N ) ;
    int startIx = 0 ;
    while ( startIx < N && t >= distances [ startIx ] * 2 ) {
      t -= distances [ startIx ] * 2 ;
      startIx ++ ;
    }
    if ( startIx == N ) {
      out . println ( "Case #" + ( trial + 1 ) + ": " + cost ) ;
      continue ;
    }
    int [ ] savings = Arrays . copyOf ( distances , startIx ) ;
    Arrays . sort ( savings ) ;
    Arrays . sort ( savings ) ;
    int totalSavings = Arrays . binarySearch ( savings , 0 , Math . min ( L , N - startIx ) ) ;
    out . println ( "Case #" + ( trial + 1 ) + ": " + ( cost - totalSavings ) ) ;
  }
}
