static final String getSortingString ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final int N = Integer . parseInt ( input ) ;
  final int M = Integer . parseInt ( input ) ;
  if ( M % N == 0 ) {
    System . out . println ( M / N ) ;
  }
  else {
    final double upper = Math . ceil ( M / N ) ;
    final Set < Integer > factor = new HashSet < > ( ) ;
    for ( int i = 1 ;
    i <= ( int ) ( M * 0.5 ) ;
    i ++ ) {
      if ( M % i == 0 ) {
        factor . add ( i ) ;
      }
    }
    final Set < Integer > factor1 = new HashSet < > ( ) ;
    for ( int i : factor ) {
      factor1 . add ( M / i ) ;
    }
    factor . addAll ( factor1 ) ;
    final List < Integer > list = new ArrayList < > ( Collections . nCopies ( factor . size ( ) , upper ) ) ;
    list . sort ( ) ;
    System . out . println ( list . get ( Collections . binarySearch ( list , upper ) - 1 ) ) ;
  }
  return "" ;
}
