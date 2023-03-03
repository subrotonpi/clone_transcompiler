@ VisibleForTesting static void compact ( ) {
  try {
    Scanner fin = new Scanner ( new File ( "B-large.in" ) ) ;
    PrintWriter fout = new PrintWriter ( new File ( "output.txt" ) ) ;
    int numcases = Integer . parseInt ( fin . nextLine ( ) ) ;
    for ( int i = 1 ;
    i <= numcases ;
    i ++ ) {
      int [ ] line = new int [ 2 ] ;
      for ( int j = 0 ;
      j < numcases ;
      j ++ ) line [ j ] = Integer . parseInt ( fin . nextLine ( ) ) ;
      int numlevels = line [ 0 ] ;
      List < Integer > doables = new ArrayList < > ( ) ;
      PriorityQueue < Integer > levels = new PriorityQueue < > ( ) ;
      for ( int j = 0 ;
      j < numlevels ;
      j ++ ) {
        line = new int [ 2 ] ;
        for ( int k = 0 ;
        k < numlevels ;
        k ++ ) line [ k ] = Integer . parseInt ( fin . nextLine ( ) ) ;
        levels . add ( new Integer ( line [ 0 ] ) ) ;
      }
      int stars = 0 ;
      int played = 0 ;
      while ( true ) {
        while ( ! levels . isEmpty ( ) ) {
          Integer nextlevel = levels . poll ( ) ;
          if ( nextlevel . intValue ( ) <= stars ) {
            if ( nextlevel . intValue ( ) == 0 ) {
              played ++ ;
              stars ++ ;
            }
            else {
              doables . add ( nextlevel . intValue ( ) ) ;
            }
          }
          else {
            levels . add ( nextlevel ) ;
            break ;
          }
        }
        Collections . sort ( doables ) ;
        if ( doables . size ( ) == 0 ) {
          if ( ! levels . isEmpty ( ) ) {
            played = - 1 ;
          }
          break ;
        }
        else {
          int lowlevel = doables . get ( 0 ) ;
          played ++ ;
          if ( lowlevel <= stars ) {
            stars += 2 ;
            doables = doables . subList ( 1 , doables . size ( ) ) ;
          }
          else {
            stars ++ ;
            levels . add ( new Integer ( doables . size ( ) - 1 ) ) ;
            doables . remove ( doables . size ( ) - 1 ) ;
          }
        }
      }
      fout . print ( "Case #" ) ;
      fout . print ( Integer . toString ( i ) ) ;
      fout . print ( ": " ) ;
      if ( ( played >= 0 ) && ( played < numcases ) ) {
        fout . print ( Integer . toString ( played ) )