@ Test ( testName = "large" ) public static void test ( String testCase ) throws IOException {
  String inputFile = "A-" + testCase + ".in" ;
  String outputFile = "A-" + testCase + ".out" ;
  BufferedReader fin = new BufferedReader ( new FileReader ( inputFile ) ) ;
  PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( outputFile ) ) ) ;
  int ncase = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
  for ( int z = xrange ( 1 , ncase + 1 ) ;
  z <= ncase ;
  z ++ ) {
    int n = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
    int A = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
    int B = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
    int C = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
    int D = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
    int x0 = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
    int y0 = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
    int M = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
    int X = x0 , Y = y0 ;
    int [ ] [ ] rem = new int [ 3 ] [ 3 ] ;
    for ( int i = 0 ;
    i < 3 ;
    i ++ ) rem [ X % 3 ] [ Y % 3 ] ++ ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      X = ( A * X + B ) % M ;
      Y = ( C * Y + D ) % M ;
      rem [ X % 3 ] [ Y % 3 ] ++ ;
    }
    int [ ] [ ] rems = new int [ 3 ] [ 3 ] ;
    for ( int a = 0 ;
    a < 3 ;
    a ++ ) for ( int b = 0 ;
    b < 3 ;
    b ++ ) for ( int x1 = 0 ;
    x1 < rems [ 0 ] . length ;
    x1 ++ ) for ( int y1 = 0 ;
    y1 < rems [ 0 ] . length ;
    y1 ++ ) {
      int q = rem [ x1 ] [ y1 ] ;
      res += q * ( q - 1 ) * ( q - 2 ) / 6 ;
    }
    for ( int x1 = 0 ;
    x1 < rems [ 0 ] . length ;
    y1 ++ ) for (