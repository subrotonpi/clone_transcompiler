static final String [ ] args = new String [ ] {
  "1" , "i" , "j" , "k" }
  ;
  int [ ] flagTable = {
    1 , 1 , 1 , 1 , 1 , - 1 , 1 , - 1 , 1 , - 1 , 1 , - 1 , - 1 }
    ;
    int [ ] indexTable = {
      0 , 1 , 2 , 3 , 1 , 0 , 3 , 2 , 3 , 0 , 1 , 3 , 2 , 1 , 0 }
      ;
      int baseAscii = ( int ) 'i' - ' ; String inputFile = args [ 0 ] ; String outputFile = args [ 1 ] ; List < Case > caseList = loadCases ( inputFile ) ; try { int caseId = 1 ; for ( Case testCase : caseList ) { boolean isOK = calculateCase ( testCase ) ; outputFile . replace ( " Case ▁ # " + ( caseId ++ ) , isOK ? " YES " : " NO " ) ; caseId ++ ; } } catch ( FileNotFoundException e ) { System . err . println ( " Could ▁ not ▁ open ▁ file ▁ " + outputFile ) ; System . exit ( 1 ) ; } catch ( IOException e ) { System . err . println ( " Could ▁ not ▁ open ▁ file ▁ " + outputFile ) ; System . exit ( 1 ) ; } catch ( ArrayIndexOutOfBoundsException e ) { System . err . println ( " Could ▁ not ▁ open ▁ file ▁ " + outputFile ) ; System . exit ( 1 ) ; } return caseList . toArray ( new Case [ caseId ] ) ; }