public static final Set < String > getWords ( ) throws IOException {
  final Set < String > words = new HashSet < String > ( ) ;
  for ( String word : Files . readAllLines ( Paths . get ( "garbled_email_dictionary.txt" ) ) ) {
    word = word . trim ( ) ;
    words . add ( word ) ;
    for ( int i : xrange ( word . length ( ) ) ) {
      int prev = k - word . length ( ) ;
      if ( words . contains ( tword ) ) {
        int prev = k - word . length ( ) ;
        if ( prev < - 5 ) prev = - 5 ;
        if ( scores [ pos + wlen ] [ prev ] > scores [ pos ] [ i ] + 2 ) {
          words . add ( nword ) ;
        }
      }
    }
  }
  for ( int val : scores [ words . size ( ) - 1 ] ) {
    if ( val >= 0 ) {
      int changes = Math . min ( changes , val ) ;
    }
  }
  System . out . println ( "Case #" + ( changes ) + ": " + words ) ;
  return words ;
}
