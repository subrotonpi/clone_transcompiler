static final void solveButtons ( List < String [ ] > buttons ) throws IOException {
  int time = 0 ;
  int [ ] positions = {
    1 , 1 }
    ;
    int [ ] lastUsed = {
      0 , 0 }
      ;
      for ( int i = 0 ;
      i < buttons . size ( ) ;
      i ++ ) {
        String [ ] config = buttons . get ( i ) ;
        int bot = config [ 0 ] ;
        int curPosition = positions [ bot ] ;
        int distance = Math . abs ( curPosition - config [ 1 ] ) ;
        int timeToAdd = Math . max ( distance - ( time - lastUsed [ bot ] ) , 0 ) + 1 ;
        time += timeToAdd ;
        lastUsed [ bot ] = time ;
        positions [ bot ] = config [ 1 ] ;
      }
    }
    