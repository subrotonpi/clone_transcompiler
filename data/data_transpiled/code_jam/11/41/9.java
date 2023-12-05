public static void main ( String input ) {
  try {
    Scanner fin = new Scanner ( new File ( input ) ) ;
    PrintWriter fout = new PrintWriter ( new File ( output ) ) ;
    int numcases = Integer . parseInt ( fin . nextLine ( ) ) ;
    for ( int casenum = 1 ;
    casenum <= numcases ;
    casenum ++ ) {
      int [ ] info = new int [ 4 ] ;
      for ( int i = 0 ;
      i < info . length ;
      i ++ ) {
        info [ i ] = Integer . parseInt ( fin . nextLine ( ) ) ;
      }
      int length = info [ 0 ] ;
      double walksp = Double . parseDouble ( info [ 1 ] ) ;
      double runsp = Double . parseDouble ( info [ 2 ] ) ;
      double runt = Double . parseDouble ( info [ 3 ] ) ;
      ArrayList < Walkways > walkways = new ArrayList < Walkways > ( ) ;
      for ( int walkway = 0 ;
      walkway < info [ 4 ] ;
      walkway ++ ) {
        int [ ] w = new int [ 4 ] ;
        for ( int i = 0 ;
        i < walkway ;
        i ++ ) {
          w [ walkway ] = Integer . parseInt ( fin . nextLine ( ) ) ;
          walkways . add ( new Walkways ( w [ 2 ] , ( w [ 1 ] - w [ 0 ] ) ) ) ;
        }
      }
      Collections . sort ( walkways ) ;
      int lengths = walkways . stream ( ) . mapToInt ( Walkways :: size ) . sum ( ) ;
      double time = 0.0 ;
      double nowalklen = length - lengths ;
      System . out . println ( nowalklen ) ;
      if ( ( runt < nowalklen / runsp ) ) {
        time = runt + ( nowalklen - ( runsp * runt ) ) / walksp ;
        runt = 0 ;
      }
      else {
        runt -= nowalklen / runsp ;
        time += nowalklen / runsp ;
      }
      System . out . println ( time ) ;
      for ( int i = 0 ;
      i < walkways . size ( ) ;
      i ++ ) {
        if ( ( runt < walkways . get ( i ) / ( walkways . get ( i ) + runsp ) ) ) {
          time += runt + ( walkways . get ( i ) - ( ( walkways . get ( i ) + runsp ) * runt ) ) / ( walkways . get (