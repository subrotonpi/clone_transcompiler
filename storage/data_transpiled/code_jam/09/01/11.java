@ GwtIncompatible ( "System.out" ) public static int solve ( String [ ] args ) {
  int L = Integer . parseInt ( args [ 0 ] ) ;
  int D = Integer . parseInt ( args [ 1 ] ) ;
  int N = Integer . parseInt ( args [ 2 ] ) ;
  String [ ] words = args ;
  String pattern = args [ 3 ] ;
  Set < String > set = new HashSet < String > ( ) ;
  int i = 0 ;
  int j = 0 ;
  while ( i < pattern . length ( ) ) {
    String options ;
    if ( pattern . charAt ( i ) == '(' ) {
      int end = pattern . indexOf ( ")" , i ) ;
      options = pattern . substring ( i + 1 , end ) ;
      i = end + 1 ;
    }
    else {
      options = pattern . substring ( i ) ;
      i ++ ;
    }
    Set < String > remove = new HashSet < String > ( ) ;
    for ( String word : words ) {
      if ( ! set . contains ( word . substring ( j ) ) ) {
        remove . add ( word ) ;
      }
    }
    for ( String word : remove ) {
      set . remove ( word ) ;
    }
    j ++ ;
  }
  return words . length ;
}
