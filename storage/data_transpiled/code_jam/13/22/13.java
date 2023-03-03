static void solve ( File fin , File fout ) throws IOException {
  File f = new File ( "B-large.in" ) ;
  File f = new File ( "B.out" ) ;
  FileWriter fw = new FileWriter ( f ) ;
  int numtests = Integer . parseInt ( f . readLine ( ) ) ;
  int fact [ ] = new int [ 6000 ] ;
  for ( int i = 0 ;
  i < fact . length ;
  i ++ ) fact [ i ] = i * fact [ i - 1 ] ;
  {
  }
  C c = new C ( fact [ 0 ] , fact [ 1 ] , fact [ 2 ] ) ;
  for ( int cas = 1 ;
  cas <= numtests ;
  cas ++ ) {
    fw . write ( "Case #" + cas + ": " ) ;
    int n = Integer . parseInt ( f . readLine ( ) ) ;
    int x = Integer . parseInt ( f . readLine ( ) ) ;
    int y = Integer . parseInt ( f . readLine ( ) ) ;
    int m = Math . abs ( x ) + Math . abs ( y ) ;
    int curr = ( m - 1 ) * ( m ) / 2 ;
    int nex = ( m + 1 ) * ( m + 2 ) / 2 ;
    int on = nex - curr ;
    if ( n >= nex ) {
      fw . write ( "1\n" ) ;
      continue ;
    }
    if ( n <= curr ) {
      fw . write ( "0\n" ) ;
      continue ;
    }
    int di = n - curr ;
    int h = Math . abs ( y ) ;
    double p [ ] [ ] = new double [ m + 1 ] [ m + 1 ] ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      for ( int j = 0 ;
      j < m ;
      j ++ ) p [ i ] [ j ] = ( p [ i - 1 ] [ j ] + p [ i ] [ j - 1 ] ) / 2 ;
    }
    for ( int i = 0 ;
    i < m ;
    i ++ ) p [ m ] [ i ] = p [ i ] [ m ] = p [ i - 1 ] [ m ] + p [ i ] [ m - 1 ] / 2 ;
    p [ m ] [ m ] = 1.0 ;
    double ans = 0.0 ;
    int t = Math . min ( di , m ) ;
    int s = di - t ;
    while ( ( s <= m ) && ( t >= h + 1 ) ) {
      ans += p [ s