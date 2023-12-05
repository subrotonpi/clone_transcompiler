public static final String getUpperCaseWithTolerance ( ) throws IOException {
  String inputFileName = "./B-large.in" ;
  String outputFileName = "./B-large.out" ;
  if ( Class . isAnnotationPresent ( Test . class ) ) {
    BufferedReader bufferedReader = new BufferedReader ( new FileReader ( inputFileName ) ) ;
    PrintWriter bufferedWriter = new PrintWriter ( new BufferedWriter ( new FileWriter ( outputFileName ) ) ) ;
    String fileLine = bufferedReader . readLine ( ) ;
    fileLine = fileLine . replace ( "\n" , "" ) ;
    int numCases = Integer . parseInt ( fileLine ) ;
    int caseNum = 1 ;
    while ( true ) {
      fileLine = bufferedReader . readLine ( ) ;
      if ( fileLine . equals ( "" ) || fileLine . equals ( "\n" ) ) {
        bufferedReader . close ( ) ;
        break ;
      }
      fileLine = fileLine . replace ( "\n" , "" ) ;
      String [ ] fileLineArray = fileLine . split ( " " ) ;
      double C = Double . parseDouble ( fileLineArray [ 0 ] ) ;
      double F = Double . parseDouble ( fileLineArray [ 1 ] ) ;
      double X = Double . parseDouble ( fileLineArray [ 2 ] ) ;
      double totalTime ;
      if ( C >= X ) {
        totalTime = X / 2.0 ;
      }
      else {
        double n = Math . max ( 0.0 , ( double ) Math . floor ( ( F * X - 2.0 * C ) / ( C * F ) ) ) ;
        totalTime = 0.0 ;
        for ( int nI = 0 ;
        nI < ( int ) n ;
        nI ++ ) {
          totalTime += C / ( 2.0 + nI * F ) ;
        }
        totalTime += X / ( 2.0 + n * F ) ;
      }
      bufferedWriter . printf ( "Case #%d: %0.7f\n" , caseNum , totalTime ) ;
      System . out . println ( caseNum ) ;
      caseNum ++ ;
    }
    bufferedWriter . close ( ) ;
  }
  return null ;
}
