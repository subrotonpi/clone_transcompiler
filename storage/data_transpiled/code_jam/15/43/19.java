static final long t = System . currentTimeMillis ( ) ;
try {
  File outfile = new File ( "C.out" ) ;
  try {
    File infile = new File ( "C-small-attempt1.in" ) ;
  }
  catch ( FileNotFoundException e ) {
    e . printStackTrace ( ) ;
  }
  int ncases = Integer . parseInt ( next ( infile ) ) ;
  for ( int testCase = 1 ;
  testCase <= ncases ;
  testCase ++ ) {
    System . out . println ( testCase ) ;
    int N = Integer . parseInt ( next ( infile ) ) ;
    Set < String > english = new HashSet < > ( next ( infile ) . split ( " " ) ) ;
    Set < String > french = new HashSet < > ( next ( infile ) . split ( " " ) ) ;
    Set < String > common = english . stream ( ) . flatMap ( w -> {
      Set < String > words = new HashSet < > ( ) ;
      for ( String s : next ( infile ) . split ( " " ) ) {
        if ( ! common . contains ( s ) ) {
          words . add ( s ) ;
        }
      }
      Set < String > words = new HashSet < > ( ) ;
      for ( String w : english . stream ( ) . filter ( s -> ! common . contains ( w ) ) ) {
        words . add ( w ) ;
      }
      for ( String s : sentences ) {
        words . addAll ( s ) ;
      }
      Map < Integer , Integer > map = new HashMap < > ( ) ;
      for ( int i = 0 ;
      i < words . size ( ) ;
      i ++ ) {
        map . put ( words . get ( i ) , i ) ;
      }
      english . clear ( ) ;
      french . clear ( ) ;
      for ( int i = 0 ;
      i < sentences . size ( ) ;
      i ++ ) {
        map . put ( sentences . get ( i ) , i ) ;
      }
      System . out . println ( words . size ( ) + " " + sentences . size ( ) ) ;
      int m = 0 ;
      for ( int c : new int [ ] {
        0 , 1 }
        ) {
          Set < Integer > eSet = english . stream ( ) . flatMap ( s -> s . stream ( ) ) . collect ( toSet ( ) ) ;
          Set < Integer > fSet = french . stream ( ) . flatMap ( s -> s . stream ( ) ) . collect ( toSet ( ) ) ;
          for ( int a : c ) {
            if ( a == 1 ) {
              e @ @