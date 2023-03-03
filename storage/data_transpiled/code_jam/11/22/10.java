static String getToken ( String file ) throws IOException {
  BufferedReader inputFile = new BufferedReader ( new FileReader ( file ) ) ;
  String line ;
  while ( ( line = inputFile . readLine ( ) ) != null ) {
    String [ ] tokens = line . split ( " " ) ;
    for ( String token : tokens ) {
      if ( token . length ( ) != 0 ) {
        return token ;
      }
    }
  }
  inputFile . close ( ) ;
  String inputFilename = "B-large.in" ;
  String outputFilename = "B-large.txt" ;
  Iterator < String > tokenIterator = getToken ( inputFilename ) ;
  {
    String get = tokenIterator . next ( ) ;
    int i ;
    int vv ;
    String pp ;
    double d = 0 ;
    class Point {
      public void p ( int p , int v ) {
        this . p = p ;
        this . v = v ;
        this . low = pp - ( double ) ( ( vv - 1 ) * d ) / 2 ;
        this . high = pp + ( double ) ( ( vv - 1 ) * d ) / 2 ;
        this . time = ( double ) ( ( vv - 1 ) * d ) / 2 ;
      }
    }
    int caseNum = getInt ( ) ;
    for ( int testCase = 0 ;
    testCase < caseNum ;
    testCase ++ ) {
      int c = getInt ( ) ;
      d = getInt ( ) ;
      ArrayList < Point > cList = new ArrayList < Point > ( ) ;
      double lowInt = 0 ;
      double highInt = 0 ;
      double timeInt = 0 ;
      for ( int i = 0 ;
      i < c ;
      i ++ ) {
        pp = getInt ( ) ;
        vv = getInt ( ) ;
        cList . add ( new Point ( pp , vv ) ) ;
      }
      Collections . sort ( cList ) ;
      for ( int i = 0 ;
      i < c ;
      i ++ ) {
        Point pp = cList . get ( i ) ;
        vv = cList . get ( i ) ;
        Point u = new Point ( pp , vv ) ;
        if ( i == 0 ) {
          lowInt = u . low ;
          highInt = u . high ;
          timeInt = u . time ;
        }
        else {
          if ( timeInt < u . time ) {
            timeDiff = u . time - timeInt ;
            lowInt -= timeDiff ;
            highInt -= timeDiff ;
            timeInt = u . time ;
          }
          double need = d - ( u . low - highInt ) ;
          timeDiff = timeInt - u . time ;
          if ( need > timeDiff ) {
            lowInt -=