static final double getDistance ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final int N = Integer . parseInt ( input ) ;
  final List < String > setlist = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    setlist . add ( input . substring ( i ) ) ;
  }
  double result = 0.0 ;
  for ( String s1 : setlist ) {
    final int x1 = Integer . parseInt ( s1 ) ;
    final int y1 = Integer . parseInt ( s1 ) ;
    for ( String s2 : setlist ) {
      final int x2 = Integer . parseInt ( s2 ) ;
      final int y2 = Integer . parseInt ( s2 ) ;
      final double tmp = Math . sqrt ( ( x2 - x1 ) * ( y2 - y1 ) * ( y2 - y1 ) ) ;
      if ( result < tmp ) {
        result = tmp ;
      }
    }
  }
  System . out . println ( result ) ;
  return result ;
}
