@ java . lang . Deprecated public static double [ ] solve ( java . io . BufferedReader fIn , java . io . PrintWriter fOut ) throws IOException {
  String directory = "C:/users/hai/my projects/google code jam/2012/1C/B/" ;
  double [ ] t0 , x0 ;
  double [ ] accs ;
  String [ ] a ;
  boolean isNegative = true ;
  try {
    if ( a [ 0 ] . equals ( "-" ) ) {
      s = a [ 1 ] ;
      isNegative = true ;
    }
    else {
      isNegative = false ;
    }
    a = new String [ ] {
      a [ 0 ] }
      ;
      fIn . list ( new java . io . FilenameFilter ( ) {
        public boolean accept ( java . io . File dir , String name ) {
          return name . endsWith ( ".in" ) ;
        }
      }
      ) ;
      l1 = new ArrayList < > ( Arrays . asList ( new String [ ] {
        name }
        ) ) ;
        for ( int i = 0 ;
        i < l1 . length ;
        i ++ ) {
          l1 . add ( new String ( l1 [ l1 . length - 1 ] ) ) ;
        }
        String chosenFilename = new ArrayList < > ( l1 ) . get ( l1 . length - 1 ) . substring ( 0 , l1 . length - 3 ) ;
        System . out . println ( "Directory : " + directory ) ;
        System . out . println ( ) ;
        System . out . println ( "Start : " + System . currentTimeMillis ( ) ) ;
        System . out . println ( ) ;
        fIn = new java . io . BufferedReader ( new java . io . FileReader ( directory + chosenFilename + ".in" ) ) ;
        fOut = new java . io . PrintWriter ( new java . io . FileWriter ( directory + chosenFilename + ".out" ) ) ;
        solve ( fIn , fOut ) ;
        fIn . close ( ) ;
        System . out . println ( ) ;
        System . out . println ( "End : " + System . currentTimeMillis ( ) ) ;
      }
      catch ( Exception e ) {
        throw new IllegalArgumentException ( "could not convert string to Fraction: " + e . toString ( ) ) ;
      }
      /* solve */
      int T = Integer . parseInt ( fIn . readLine ( ) ) ;
      for ( int testcase = 1 ;
      testcase <= T ;
      testcase ++ ) {
        String [ ] line = fIn . readLine ( ) . split ( "