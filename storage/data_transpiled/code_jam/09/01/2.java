@ VisibleForTesting static Set < Set < String >> solve ( String pattern ) {
  final Set < Set < String >> res = new HashSet < Set < String >> ( ) ;
  while ( pattern . length ( ) > 0 ) {
    if ( pattern . charAt ( 0 ) == '(' ) {
      final int i = pattern . indexOf ( ')' ) ;
      res . add ( new HashSet < String > ( pattern . substring ( 1 , i ) ) ) ;
      pattern = pattern . substring ( i + 1 ) ;
    }
    else {
      res . add ( new HashSet < String > ( pattern . substring ( 0 ) ) ) ;
      pattern = pattern . substring ( 1 ) ;
    }
  }
  return res ;
}
