static final long startTime = System . currentTimeMillis ( ) ;
try {
  String inname ;
  if ( args . length > 0 ) {
    inname = args [ 0 ] ;
  }
  else {
    inname = input . readLine ( ) ;
  }
  assert inname . endsWith ( ".in" ) ;
  String outname = inname . replace ( ".in" , ".out" ) ;
  Scanner fin = new Scanner ( new File ( inname ) ) ;
  PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( outname ) ) ) ;
  int numCases = Integer . parseInt ( fin . nextLine ( ) ) ;
  for ( int caseIdx = 1 ;
  caseIdx <= 1 && caseIdx < numCases ;
  caseIdx ++ ) {
    if ( System . currentTimeMillis ( ) >= startTime + 5 ) {
      System . out . println ( "[== Case " + caseIdx + " of " + numCases + " ==]" ) ;
    }
    int N , pD , pG ;
    boolean answer = true ;
    N = Math . min ( N , 100 ) ;
    if ( pG == 100 && pD != 100 ) answer = false ;
    if ( pG == 0 && pD != 0 ) answer = false ;
    if ( Arrays . binarySearch ( pG * D , N ) > 0 ) answer = false ;
    fout . println ( "Case #" + caseIdx + ": " + ( answer ? "Possible" : "Broken" ) ) ;
  }
  fout . flush ( ) ;
  fout . close ( ) ;
}
catch ( Exception e ) {
  Log . e ( "Exception caught:" , e ) ;
  System . err . println ( StringUtils . repeat ( "-" , 60 ) ) ;
  e . printStackTrace ( System . err ) ;
  System . err . println ( StringUtils . repeat ( "-" , 60 ) ) ;
  input . close ( ) ;
}
finally {
  long totalTime = System . currentTimeMillis ( ) - startTime ;
  System . err . println ( "Completed in " + totalTime + " seconds" ) ;
  Thread . sleep ( 3 ) ;
}
return totalTime ;
}
