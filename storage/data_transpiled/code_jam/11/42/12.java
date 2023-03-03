@ Helper public static void main ( String [ ] args ) throws IOException {
  long t1 = starttimer ( ) ;
  String filename = "B" + args [ 0 ] + "." + args [ 1 ] ;
  boolean isLarge = 1 ;
  String modeStr = isLarge == 0 ? "" : isLarge ? "-small-attempt0" : "-large" ;
  String in = String . format ( filename , modeStr , "in" ) ;
  String out = String . format ( filename , modeStr , "out" ) ;
  BufferedReader inf = new BufferedReader ( new FileReader ( in ) ) ;
  PrintWriter outf = new PrintWriter ( out ) ;
  int i , j , k ;
  double [ ] [ ] s ;
  /* Find the first two numbers in the output file */
  for ( k = Math . min ( R , C ) ;
  k >= 3 ;
  k = k - 1 ) {
    for ( i = 0 ;
    i < C - k + 1 ;
    i ++ ) {
      for ( j = 0 ;
      j < R - k + 1 ;
      j ++ ) {
        /* Find the first two numbers in the output file */
        s [ 0 ] [ i ] = j ;
        /* Find the first two numbers in the output file */
        s [ 1 ] [ j ] = k ;
        /* Find the first two numbers in the output file */
        s [ 2 ] [ i ] = k ;
        /* Find the first two numbers in the output file */
        s [ 0 ] [ j ] = k ;
        s [ 1 ] [ j ] = k ;
        /* Find the first two numbers in the output file */
        s [ 1 ] [ i ] = k ;
        s [ 2 ] [ j ] = k ;
      }
    }
  }
  /* Find the first two numbers in the output file */
  for ( i = 0 ;
  i < s . length ;
  i ++ ) {
    int T = readI ( inf ) ;
    for ( int testCase = 1 ;
    testCase <= T ;
    testCase ++ ) {
      int R = readIA ( inf ) ;
      int C = readI ( inf ) ;
      int D [ ] [ ] w = new int [ R ] [ C ] ;
      for ( int j = 0 ;
      j