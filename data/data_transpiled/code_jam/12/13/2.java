@ WorkerThread public static void laneSearch ( List < Integer > lane , int posn ) {
  int lastidx = 0 ;
  for ( int i = 0 ;
  i < lane . size ( ) ;
  i ++ ) {
    if ( lane . get ( i ) . intValue ( ) < posn + 5 ) {
      if ( posn < lane . get ( i ) . intValue ( ) + 5 ) {
        return ;
      }
      else {
        lastidx = i ;
      }
    }
    else {
      break ;
    }
  }
  try {
    BufferedReader fin = new BufferedReader ( new FileReader ( "C-small-attempt0.in" ) ) ;
    BufferedWriter fout = new BufferedWriter ( new FileWriter ( "output.txt" ) ) ;
    int numcases = Integer . parseInt ( fin . readLine ( ) ) ;
    for ( int i = 1 ;
    i <= numcases ;
    i ++ ) {
      int [ ] line = new int [ 2 ] ;
      for ( int j = 0 ;
      j < line . length ;
      j ++ ) {
        line [ j ] = Integer . parseInt ( fin . readLine ( ) ) ;
      }
      int numcars = line [ 0 ] ;
      List < Integer > left = new ArrayList < Integer > ( ) ;
      List < Integer > right = new ArrayList < Integer > ( ) ;
      for ( int j = 0 ;
      j < numcars ;
      j ++ ) {
        line [ 0 ] = Integer . parseInt ( line [ j ] ) ;
        int car = new int [ 2 ] ;
        car [ 0 ] = Integer . parseInt ( line [ 1 ] ) ;
        if ( line [ 0 ] == 'L' ) {
          left . add ( car ) ;
        }
        else {
          right . add ( car ) ;
        }
      }
      totaltime = 0 ;
      Set < Integer > swapposns = new HashSet < Integer > ( ) ;
      while ( true ) {
        Collections . sort ( left ) ;
        Collections . sort ( right ) ;
        int advancetime = 0 ;
        int leftcar = 0 ;
        int rightcar = 0 ;
        for ( int i = 0 ;
        i < left . size ( ) - 1 ;
        i ++ ) {
          if ( left . get ( i ) . intValue ( ) > left . get ( i + 1 ) . intValue ( ) ) {
            int deltavel = left . get ( i ) . intValue ( ) - left . get ( i + 1 ) . intValue ( ) ;
            int deltapos = left . get ( i + 1 ) . intValue ( ) - left . get ( i + 1 ) . intValue ( ) - 5 ;
            double time = del @ @