@ VisibleForTesting static void random ( ) throws IOException {
  /* try a small file */
  BufferedWriter fout = new BufferedWriter ( new FileWriter ( "trysmall.txt" ) ) ;
  int n = 10 ;
  int t = 362880 ;
  Map < Integer , Double > amap = Maps . newHashMap ( ) ;
  for ( int i = 0 ;
  i <= t ;
  i ++ ) {
    StringBuilder a = new StringBuilder ( ) ;
    for ( int x = 0 ;
    x <= n ;
    x ++ ) {
      a . append ( String . valueOf ( x ) ) ;
    }
    for ( int k = 0 ;
    k <= n ;
    k ++ ) {
      int p = nextInt ( n - 1 ) ;
      Double temp = a . get ( p ) ;
      a . set ( p , a . get ( k ) ) ;
      a . set ( k , temp ) ;
    }
    String stra = a . toString ( ) ;
    if ( amap . containsKey ( stra ) ) amap . put ( stra , ++ i ) ;
    else amap . put ( stra , 1 ) ;
  }
  int count = 0 ;
  for ( Integer key : amap . keySet ( ) ) {
    fout . write ( key + " " + amap . get ( key ) ) ;
    if ( amap . get ( key ) > t / factorial ( n ) ) count ++ ;
  }
  fout . write ( count + "\n" ) ;
  fout . close ( ) ;
  /* calc single file */
  PrintWriter fout = new PrintWriter ( new OutputStreamWriter ( System . out ) ) ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    double [ ] p = new double [ n ] ;
    p [ i ] = 1.0 ;
    System . out . println ( i ) ;
    for ( int k = 0 ;
    k <= n ;
    k ++ ) {
      double [ ] pp = p . clone ( ) ;
      for ( int j = 0 ;
      j <= n ;
      j ++ ) {
        if ( j == k ) p [ k ] = pp [ k ] / n + ( 1 - pp [ k ] ) / n ;
        else p [ j ] = pp [ j ] * ( n - 1 ) / n + pp [ k ] / n ;
      }
    }
    fout . write ( Arrays . toString ( p ) ) ;
    fout . write ( "\n" ) ;
    fout . flush ( ) ;
  }
  fout . close ( ) ;
}
