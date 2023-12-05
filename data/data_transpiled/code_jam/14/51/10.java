private static List < Integer > mkseq ( int p , int q , int r , int s , int N ) {
  return mkseq ( ( i * p + q ) % r + s ) ;
  /* has bound 3 split */
  int lsum = 0 ;
  int lend = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( lsum + seq [ i ] <= bound && i < seq . length - 1 ) {
      lsum += seq [ i ] ;
      lend = i + 1 ;
    }
    else {
      break ;
    }
  }
  int rsum = 0 ;
  int resultLength = seq . length ;
  for ( int i = seq . length - 1 ;
  i >= 0 ;
  i -- ) {
    if ( rsum + seq [ i ] <= bound && i > lend ) {
      rsum += seq [ i ] ;
      resultLength = i ;
    }
    else {
      break ;
    }
  }
  int msum = Integer . valueOf ( seq . substring ( lend , resultLength ) ) ;
  /* search max bnd */
  int hs , sm , mx ;
  hs = hasBound3 ( seq , 1 ) ;
  if ( hs != 0 ) {
    /* return (double)(sm-mx)/sm; */
  }
  int L = 1 ;
  int U = 10 * 15 ;
  while ( L + 1 < U ) {
    int M = ( L + U ) / 2 ;
    hs = hasBound3 ( seq , M ) ;
    sm = hasBound3 ( hs , M ) ;
    mx = hasBound3 ( hs , M ) ;
    if ( hs != 0 ) U = M ;
    else L = M ;
  }
  hs = hasBound3 ( seq , U ) ;
  sm = hasBound3 ( seq , U ) ;
  assert hs != 0 ;
  /* return (double)(sm-mx)/sm; */
  final String infname = System . getProperty ( "test.in" ) ;
  try {
    BufferedReader inf = new BufferedReader ( new FileReader ( infname . replace ( ".in" , ".out" ) ) ) ;
    FileWriter outf = new FileWriter ( infname . replace ( ".out" , ".out" ) ) ;
    int T = Integer . valueOf ( inf . readLine ( ) ) ;
    for ( int t = 1 ;
    t <= T ;
    t ++ ) {
      N = Integer . parseInt ( inf . readLine ( ) ) ;
      p = inf . readLine ( ) ;
      q = inf