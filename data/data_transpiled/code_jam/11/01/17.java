static final String getTempFile ( ) throws IOException {
  List < String > list = Arrays . asList ( IOUtils . readLines ( "infile" ) ) ;
  PrintStream out = new PrintStream ( "outfile" ) ;
  class robot {
    int color ;
    int pos ;
    int cindex ;
    int nextgoal ;
    robot ( Color col , String [ ] casedata ) {
      color = col ;
      pos = 1 ;
      cindex = - 2 ;
      nextgoal = "START" ;
      findnextgoal ( casedata ) ;
    }
    void movetowardgoal ( ) {
      if ( nextgoal == "DONE" ) {
      }
      else if ( pos < nextgoal ) {
        pos ++ ;
      }
      else if ( pos > nextgoal ) {
        pos -- ;
      }
      else {
      }
    }
    void findnextgoal ( ) {
      cindex += 2 ;
      while ( cindex < casedata . length && casedata [ cindex ] . charAt ( cindex ) != color ) {
        cindex += 2 ;
      }
      try {
        nextgoal = Integer . parseInt ( casedata [ 1 + cindex ] ) ;
      }
      catch ( Exception e ) {
        nextgoal = "DONE" ;
      }
    }
  }
  int ncases = Integer . parseInt ( list . remove ( 0 ) ) ;
  for ( int testCase = 0 ;
  testCase < ncases ;
  testCase ++ ) {
    String [ ] casedata = list . remove ( 0 ) . split ( "\\s+" ) ;
    int numreqs = casedata . length ;
    int timetaken = 0 ;
    robot orange = robot ( 'O' , casedata ) ;
    robot blue = robot ( 'B' , casedata ) ;
    while ( ( orange . nextgoal != "DONE" ) || ( blue . nextgoal != "DONE" ) ) {
      timetaken ++ ;
      if ( orange . cindex < blue . cindex ) {
        if ( orange . nextgoal == orange . pos ) {
          orange . findnextgoal ( casedata ) ;
        }
        else {
          orange . movetowardgoal ( ) ;
        }
        blue . movetowardgoal ( ) ;
      }
      else if ( blue . cindex < orange . cindex ) {
        if ( blue . nextgoal == blue . pos ) {
          blue . findnextgoal ( casedata ) ;
        }
        else {
          blue . movetowardgoal ( ) ;
        }
        orange . movetowardgoal ( ) ;
      }
      else {
        System . err . println ( ) ;
      }
    }
    out . println ( "Case #" + ( testCase + 1 ) + ": " + timetaken )