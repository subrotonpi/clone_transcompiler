public static void main ( String [ ] args ) {
  int numCases = input . nextInt ( ) ;
  for ( int testCase = 0 ;
  testCase < numCases ;
  testCase ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int rows = Integer . parseInt ( input . nextLine ( ) ) ;
    int cols = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . printf ( "Case #%d: %s%n" , testCase + 1 , gabrielWins ( x , rows , cols ) ) ;
  }
  {
    Set < Point > set = new HashSet < > ( ) ;
    Set < Point > set = new HashSet < > ( ) ;
    for ( Point smallerOmino : set ) {
      for ( int dr = 0 ;
      dr < rows ;
      dr ++ ) {
        Point newPoint = new Point ( smallerOmino . x + dr , smallerOmino . y + dc ) ;
        if ( ! set . contains ( newPoint ) ) {
          set . add ( newPoint ) ;
        }
      }
    }
    for ( Point point : set ) {
      Set < Point > set = new HashSet < > ( ) ;
      set . add ( point ) ;
      Set < Point > set = new HashSet < > ( ) ;
      for ( Point omino : set ) {
        set . add ( new Point ( omino . x - mino . x , omino . y - mino . y ) ) ;
      }
      for ( Point omino : set ) {
        if ( ! gabrielWsWithOmino ( omino , omino ) ) {
          Set < Point > set = new HashSet < > ( ) ;
          for ( int r = 0 ;
          r < rows ;
          r ++ ) {
            Set < Point > set = new HashSet < > ( ) ;
            for ( int c = 0 ;
            c < cols ;
            c ++ ) {
              set . add ( new Point ( r * signR , c * signC ) ) ;
            }
            Set < Point > set = new HashSet < > ( ) ;
            for ( Point f : set ) {
              set . add ( new Point ( f , r * signR , c * signC ) ) ;
            }
            for ( int rOffset = 0 ;
            rOffset < rows ;
            rOffset ++ ) {
              for ( int cOffset = 0 ;
              cOffset < cols ;
              cOffset ++ ) {
                Point offset = new Point ( rOffset , cOffset ) ;
                if ( gabri @ @