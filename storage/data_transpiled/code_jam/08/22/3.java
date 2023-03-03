@ Test ( description = "small-attempt0" ) public static void test ( String testCase ) throws IOException {
  String inputFile = "B-" + testCase + ".in" ;
  String outputFile = "B-" + testCase + ".out" ;
  BufferedReader fin = new BufferedReader ( new FileReader ( inputFile ) ) ;
  PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( outputFile ) ) ) ;
  int z ;
  int a , b , m ;
  {
    b = b / m - ( a - 1 ) / m ;
  }
  /* get root */
  if ( DS [ x ] != x ) {
    DS [ x ] = getRoot ( DS , DS [ x ] ) ;
  }
  /* join root */
  DS [ ] = new DS [ 2 ] ;
  /* get root */
  a = getRoot ( DS , a ) ;
  b = getRoot ( DS , b ) ;
  if ( a != b ) {
    DS [ a ] = b ;
  }
  /* sieve */
  int lim = lim + 1 ;
  boolean [ ] prime = new boolean [ n ] ;
  prime [ 0 ] = false , prime [ 1 ] = false ;
  for ( int i : xrange ( n ) ) {
    if ( prime [ i ] ) {
      for ( int j : xrange ( 2 * i , n , i ) ) {
        prime [ j ] = false ;
      }
    }
  }
  /* sieve */
  int [ ] primes = sieve ( 1000 ) ;
  int ncase = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
  for ( int z = 1 ;
  z <= ncase ;
  z ++ ) {
    System . out . println ( "Case " + z ) ;
    int A = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
    int B = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
    int P = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
    int [ ] pprimes = new int [ pprimes . length ] ;
    for ( int p : primes ) {
      if ( p >= P && multCount ( A , B , p ) > 1 ) {
        if ( multCount ( A , B , pprimes [ pi ] * pprimes [ ppi ] ) > 0 ) {
          join ( DS , pi , ppi ) ;
        }
        ppi ++ ;
      }
    }
  }
  boolean [ ] div = new boolean [ B - A + 1 ] ;
  for ( int p : pprimes