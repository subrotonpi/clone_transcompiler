static String getLine ( String filename ) throws IOException {
  BufferedReader inputFile = new BufferedReader ( new FileReader ( filename ) ) ;
  String line ;
  while ( ( line = inputFile . readLine ( ) ) != null ) {
    yield ( line ) ;
  }
  inputFile . close ( ) ;
  String inputFilename = "B-large.in" ;
  String outputFilename = "B-large.txt" ;
  TokenIterator tokenIterator = getLine ( inputFilename ) ;
  {
    String get = tokenIterator . next ( ) ;
    int i ;
    int j ;
    String [ ] tmp ;
    BufferedWriter outputFile = new BufferedWriter ( new FileWriter ( outputFilename ) ) ;
    int [ ] [ ] choose = new int [ 3000 ] [ 3 ] ;
    for ( i = 0 ;
    i < choose . length ;
    i ++ ) {
      chs = new int [ i + 1 ] ;
      for ( j = 0 ;
      j < i + 1 ;
      j ++ ) {
        if ( j == 0 || j == i ) chs [ j ] = 1 ;
        else chs [ j ] = choose [ i - 1 ] [ j - 1 ] + choose [ i - 1 ] [ j ] ;
      }
      choose [ i ] = chs ;
    }
    int caseNum = getInt ( ) ;
    for ( int testCase = 0 ;
    testCase < caseNum ;
    testCase ++ ) {
      tmp = get . split ( " " ) ;
      int n = Integer . parseInt ( tmp [ 0 ] ) ;
      int x = Math . abs ( Integer . parseInt ( tmp [ 1 ] ) ) ;
      int y = Integer . parseInt ( tmp [ 2 ] ) ;
      int lay = 0 ;
      int cnt = 0 ;
      for ( int i : xrange ( 800 ) ) {
        if ( cnt + 4 * i + 1 <= n ) {
          cnt += 4 * i + 1 ;
          lay ++ ;
        }
      }
      double ans ;
      if ( ( x + y ) % 2 != 0 ) ans = 0.0 ;
      else if ( ( x + y ) / 2 < lay ) ans = 1.0 ;
      else if ( ( x + y ) / 2 > lay || x == 0 || n - cnt == 0 ) ans = 0.0 ;
      else {
        y ++ ;
        int m = n - cnt ;
        if ( m - lay * 2 >= y ) ans = 1.0 ;
        else {
          long bit = 0 ;
          for ( int i : xrange ( y , m + 1 ) ) bit += choose [ m ] [ i ] ;
          long base = 2 * m ;
          while ( bit > 1000000000000000000000 l ) {
            bit /= 1000000000000000000000 ;
            base /= 1000000000000000000000