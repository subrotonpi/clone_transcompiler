private static void solve ( ) throws IOException {
  BufferedReader br = new BufferedReader ( new FileReader ( "C-small.in" ) ) ;
  PrintWriter g = new PrintWriter ( new FileWriter ( "C.out" ) ) ;
  int T = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int k = 0 ;
  k < T ;
  k ++ ) {
    int N = Integer . parseInt ( br . readLine ( ) ) ;
    int [ ] [ ] ps = new int [ N ] [ 4 ] ;
    for ( int j : xrange ( N ) ) {
      ps [ j ] = ArrayUtil . parseInt ( br . readLine ( ) ) ;
    }
    /* Test #%d: %.6f */
    double d1mn = 10 * 12 , d2mn = 10 * 12 , d3mn = 10 * 12 , d4mn = 10 * 12 ;
    double d1mx = 0 , d2mx = 0 , d3mx = 0 , d4mx = 0 ;
    for ( int i : xrange ( N ) ) {
      d1mn = Math . min ( d1mn , ps [ i ] [ 0 ] + ps [ i ] [ 1 ] + ps [ i ] [ 2 ] + d * ps [ i ] [ 3 ] ) ;
      d1mx = Math . max ( d1mx , ps [ i ] [ 0 ] + ps [ i ] [ 1 ] + ps [ i ] [ 2 ] - d * ps [ i ] [ 3 ] ) ;
      d2mn = Math . min ( d2mn , ps [ i ] [ 0 ] + ps [ i ] [ 1 ] - ps [ i ] [ 2 ] + d * ps [ i ] [ 3 ] ) ;
      d2mx = Math . max ( d2mx , ps [ i ] [ 0 ] + ps [ i ] [ 1 ] - ps [ i ] [ 2 ] - d * ps [ i ] [ 3 ] ) ;
      d3mn = Math . min ( d3mn , ps [ i ] [ 0 ] - ps [ i ] [ 1 ] + ps [ i ] [ 2 ] + d * ps [ i ] [ 3 ] ) ;
      d3mx = Math . max ( d3mn , ps [ i ] [ 0 ] - ps [ i ] [ 1 ] + ps [ i ] [ 2 ] - d * ps [ i ] [ 3 ] ) ;
      d4mn = Math . min ( d4mn , - ps [ i ] [ 0 ] + ps [ i ] [ 1 ] + ps [ i ] [ 2