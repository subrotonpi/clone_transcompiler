static private final String line ( ) {
  final String line = System . getProperty ( "line.separator" ) ;
  final String [ ] args = line . split ( " " ) ;
  if ( args . length == 0 ) {
    int numberOfCases = Integer . parseInt ( args [ 0 ] ) ;
    for ( int caseNumber = 0 ;
    caseNumber < numberOfCases ;
    caseNumber ++ ) {
      int R = Integer . parseInt ( args [ 1 ] ) ;
      Set < Integer > currentWorld = new HashSet < Integer > ( ) ;
      for ( int k = 0 ;
      k < R ;
      k ++ ) {
        int X1 = Integer . parseInt ( args [ 0 ] ) ;
        int Y1 = Integer . parseInt ( args [ 1 ] ) ;
        int X2 = Integer . parseInt ( args [ 2 ] ) ;
        int Y2 = Integer . parseInt ( args [ 3 ] ) ;
        for ( int i = X1 ;
        i <= X2 ;
        i ++ ) {
          for ( int j = Y1 ;
          j <= Y2 ;
          j ++ ) {
            currentWorld . add ( new Integer ( i ) ) ;
          }
        }
        int time = 0 ;
        while ( currentWorld . size ( ) > 0 ) {
          Set < Integer > newWorld = new HashSet < Integer > ( ) ;
          Iterator < Integer > itr = currentWorld . iterator ( ) ;
          while ( itr . hasNext ( ) ) {
            int i = itr . next ( ) ;
            int j = itr . next ( ) ;
            if ( ( i == j - 1 ) || ( i == j ) ) {
              newWorld . add ( new Integer ( i ) ) ;
            }
            if ( ( i - 1 == j + 1 ) && ! currentWorld . contains ( new Integer ( i ) ) ) {
              newWorld . add ( new Integer ( i ) ) ;
            }
            if ( ( i + 1 == j - 1 ) && ! currentWorld . contains ( new Integer ( j ) ) ) {
              newWorld . add ( new Integer ( j ) ) ;
            }
          }
          currentWorld = newWorld ;
          time ++ ;
        }
        System . out . println ( "Case #" + ( caseNumber + 1 ) + ": " + time . replace ( "L" , "" ) ) ;
      }
    }
  }
  return line ;
}
