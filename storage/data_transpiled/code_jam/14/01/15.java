public static void main ( String [ ] args ) throws IOException {
  final BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final int T = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
  for ( int i = 1 ;
  i <= T ;
  i ++ ) {
    final List < String > row1 = getRow ( br ) ;
    final List < String > row2 = getRow ( br ) ;
    final List < String > cards = new LinkedList < String > ( ) ;
    for ( int j = 0 ;
    j < row1 . size ( ) && j < row2 . size ( ) ;
    j ++ ) {
      cards . add ( row1 . get ( j ) ) ;
    }
    if ( cards . size ( ) == 1 ) {
      System . out . println ( "Case #" + i + ": " + cards . get ( 0 ) ) ;
    }
    else if ( cards . size ( ) > 1 ) {
      System . out . println ( "Case #" + i + ": Bad magician!" ) ;
    }
    else {
      System . out . println ( "Case #" + i + ": Volunteer cheated!" ) ;
    }
  }
  final List < String > row = new ArrayList < String > ( ) ;
  for ( int n = 1 ;
  n <= 5 ;
  n ++ ) {
    final String l = br . readLine ( ) ;
    if ( n == i ) {
      row = new HashSet < String > ( Arrays . asList ( l . trim ( ) . split ( " " ) ) ) ;
    }
  }
}
