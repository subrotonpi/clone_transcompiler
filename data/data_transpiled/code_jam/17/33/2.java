public static void readFile ( File fin , PrintStream fout ) throws IOException {
  BufferedReader br = new BufferedReader ( new FileReader ( "3.in" ) ) ;
  PrintWriter pw = new PrintWriter ( new BufferedWriter ( new FileWriter ( "3.out" ) ) ) ;
  double epsilon = 0.00000000001 ;
  int T = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    System . out . println ( t + 1 ) ;
    int N = Integer . parseInt ( br . readLine ( ) ) ;
    int K = Integer . parseInt ( br . readLine ( ) ) ;
    double U = Double . parseDouble ( br . readLine ( ) ) ;
    double [ ] P = ArrayUtil . toDoubleArray ( N ) ;
    Arrays . sort ( P ) ;
    Arrays . fill ( P , 1.0 ) ;
    while ( U > epsilon ) {
      int j = 0 ;
      while ( j < P . length ) {
        if ( P [ j ] > P [ 0 ] + epsilon ) break ;
        j ++ ;
      }
      if ( j == P . length ) break ;
      double step = Math . min ( U / j , P [ j ] - P [ 0 ] ) ;
      U -= step * j ;
      for ( int i = 0 ;
      i < j ;
      i ++ ) P [ i ] += step ;
    }
    System . out . println ( P ) ;
    double ans = 1.0 ;
    for ( double p : P ) ans *= p ;
    if ( ans > 1.0 ) ans = 1.0 ;
    ans = ans + "" ;
    pw . println ( "Case #" + ( t + 1 ) + ": " + ans ) ;
  }
  pw . println ( "Case #" + ( t + 1 ) + ": " + ans ) ;
}
