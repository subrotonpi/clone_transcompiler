static final String getSquaresHit ( String [ ] grid , int laserRow , int laserCol , int laserVert ) throws Exception {
  int i ;
  int changeVert = 1 ;
  int changeHoriz = 0 ;
  HashSet < Integer > squaresHit = new HashSet < Integer > ( ) ;
  for ( i = 0 ;
  i < numInputs ;
  i ++ ) {
    int R = Integer . parseInt ( input . nextLine ( ) ) ;
    int C = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] [ ] pos = new int [ R ] [ ] ;
    int openSq = new int [ R ] ;
    int lastLaserNum = - 1 ;
    for ( int row = 0 ;
    row < C ;
    row ++ ) {
      int col = 0 ;
      switch ( input . charAt ( row ) ) {
        case '-' : case '|' : lastLaserNum ++ ;
        laserNums [ row ] = new int [ ] {
          row , col }
          ;
          break ;
          case '.' : lastLaserNum ++ ;
          laserNums [ row ] = new int [ ] {
            row , col }
            ;
            break ;
          }
        }
        int numOpens = lastLaserNum + 1 ;
        HashSet < Integer > cnf = new HashSet < Integer > ( ) ;
        for ( ;
        ;
        ) {
          int openSq = laserNums [ row ] [ laserCol ] ;
          int openPos = new int [ R ] ;
          int lastOpenNum = - 1 ;
          for ( int row = 0 ;
          row < C ;
          row ++ ) {
            switch ( input . charAt ( row ) ) {
              case '-' : case '|' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '.' : case '