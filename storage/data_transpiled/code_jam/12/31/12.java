@ VisibleForTesting static String solve ( int N , int [ ] [ ] C ) throws IOException {
  final Scanner scanner = new Scanner ( System . in ) ;
  final String filename = scanner . nextLine ( ) ;
  final int N = scanner . nextInt ( ) ;
  final int [ ] [ ] dataArgs ;
  final int totalCases = scanner . nextInt ( ) ;
  int caseNumber = 0 ;
  while ( caseNumber < totalCases ) {
    caseNumber ++ ;
    final int [ ] [ ] inheritsArgs = new int [ N ] [ ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( inheritsArgs [ i ] [ i ] == null ) {
        continue ;
      }
      if ( fillInheritsList ( i , C , inheritsArgs ) ) {
        return "Yes" ;
      }
    }
    return "No" ;
  }
  final String [ ] [ ] inheritsArgs = new String [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int j = scanner . nextInt ( ) ;
    if ( inheritsArgs [ i ] [ j ] == null ) {
      return true ;
    }
    inheritsArgs [ i ] [ j ] = i ;
    if ( ! inheritsArgs [ i ] [ j ] . equals ( C [ i ] [ j ] ) ) {
      final boolean matchFound = fillInheritsList ( j , C , inheritsArgs ) ;
      if ( matchFound ) {
        return true ;
      }
    }
    if ( inheritsArgs [ i ] [ j ] == null ) {
      return true ;
    }
    inheritsArgs [ i ] = inheritsArgs [ i ] [ j ] ;
  }
  scanner . close ( ) ;
  final String [ ] [ ] C = new String [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final String dataLine = scanner . nextLine ( ) ;
    final String [ ] bits = dataLine . split ( " " ) ;
    C [ i ] [ j ] = new String [ bits . length - 1 ] ;
    for ( int j = 0 ;
    j < bits . length ;
    j ++ ) {
      C [ i ] [ j ] = new String [ bits . length - 1 ] ;
      for ( int k = 1 ;
      k < bits . length ;
      k ++ ) {
        C [ i ] [ j ] = bits [ j ] . substring ( j , bits . length - 1 ) ;
      }
    }
  }
  return C [ 0 ] ;
}
