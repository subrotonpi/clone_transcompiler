public static final int [ ] [ ] getMatrix ( String inputFileName ) throws IOException {
  String inputFileName = "./C-large.in" ;
  String outputFileName = "./C-large.out" ;
  if ( className == null ) {
    BufferedReader bufferedReader = new BufferedReader ( new FileReader ( inputFileName ) ) ;
    PrintWriter outputStream = new PrintWriter ( outputFileName ) ;
    String fileLine = bufferedReader . readLine ( ) ;
    fileLine = fileLine . replace ( "\n" , "" ) ;
    int numCases = Integer . parseInt ( fileLine ) ;
    int caseNum = 1 ;
    do {
      boolean transposeAtEnd = false ;
      boolean impossible = false ;
      fileLine = bufferedReader . readLine ( ) ;
      if ( fileLine . equals ( "" ) || fileLine . equals ( "\n" ) ) {
        bufferedReader . close ( ) ;
        break ;
      }
      fileLine = fileLine . replace ( "\n" , "" ) ;
      String [ ] fileLineArray = fileLine . split ( " " ) ;
      int R = Integer . parseInt ( fileLineArray [ 0 ] ) ;
      int C = Integer . parseInt ( fileLineArray [ 1 ] ) ;
      int M = Integer . parseInt ( fileLineArray [ 2 ] ) ;
      int F = R * C - M ;
      if ( R > C ) {
        transposeAtEnd = true ;
        int C_copy = C * 1 ;
        C = R * 1 ;
        R = C_copy * 1 ;
      }
      int [ ] [ ] gridArray = new int [ R ] [ C ] ;
      if ( F == 0 ) {
        impossible = true ;
      }
      else if ( F == 1 ) {
        gridArray [ 0 ] [ 0 ] = 1 ;
      }
      else if ( R == 1 ) {
        gridArray [ 0 ] [ 0 ] = 1 ;
      }
      else if ( F == 2 || F == 3 || F == 5 || F == 7 ) {
        System . out . println ( String . valueOf ( F ) + " check" ) ;
        impossible = true ;
      }
      else if ( R == 2 && ( F % 2 == 1 ) ) {
        impossible = true ;
      }
      else {
        int maxHeight ;
        if ( F > C * ( R - 1 ) ) {
          maxHeight = Math . min ( ( int ) Math . sqrt ( F ) + 1 , R ) ;
        }
        else {
          maxHeight = Math . min ( ( int ) Math . sqrt ( F ) , R ) ;
        }
        int cI = 0 ;
        while ( ( F