public static void pr ( int ... a ) throws IOException {
  return ;
  for ( int x : a ) print ( x , "," ) ;
  print ( ) ;
  /* maxcan */
  int [ ] m = new int [ a . length ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    m [ i ] = 0 ;
  }
  if ( a [ 0 ] == 1 ) {
    m [ 0 ] = C ;
  }
  else {
    /* return 0 */
  }
  for ( int i = 1 ;
  i < a . length ;
  i ++ ) {
    int d = a [ i ] ;
    if ( d > m [ i - 1 ] + 1 ) {
      /* return m[i-1]*/
    }
    else {
      /* return 0 */
    }
    for ( int i = 1 ;
    i < a . length ;
    i ++ ) {
      int d = a [ i ] ;
      if ( d > m [ i - 1 ] + 1 ) {
        /* return m[i-1]*/
        m [ i ] = C * d + m [ i - 1 ] ;
      }
    }
  }
  /* solve */
  int mx = maxcan ( C , ds ) ;
  int newd = 0 ;
  while ( mx < V ) {
    ds [ newd ] = mx + 1 ;
    Arrays . sort ( ds ) ;
    /* pr */
    pr ( ds ) ;
    newd ++ ;
    mx = maxcan ( C , ds ) ;
  }
  final BufferedReader br = new BufferedReader ( new FileReader ( new File ( System . getProperty ( "test.src" ) ) ) ) ;
  final String outFileName = System . getProperty ( "test.src" ) . substring ( 0 , System . getProperty ( "test.src" ) . length ( ) - 2 ) + "out" ;
  final BufferedWriter out = new BufferedWriter ( new FileWriter ( outFileName ) ) ;
  final int T = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int tc = 1 ;
  tc <= T ;
  tc ++ ) {
    final int C = Integer . parseInt ( br . readLine ( ) ) ;
    final int D = Integer . parseInt ( br . readLine ( ) ) ;
    final int V = Integer . parseInt ( br . readLine ( ) ) ;
    /* assert ds.length == D */
    rt = solve ( C , ds , V ) ;
    /* print */
    out . write ( 20 ) ;
  }
  out . close ( ) ;
  