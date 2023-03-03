@ task ( "C" ) public static void main ( String task ) throws IOException {
  int type = 2 ;
  BufferedReader in ;
  if ( type == 0 ) in = new BufferedReader ( new FileReader ( "sample.in" ) ) ;
  else if ( type == 1 ) in = new BufferedReader ( new FileReader ( task + "-small.in" ) ) ;
  else in = new BufferedReader ( new FileReader ( task + "-large.in" ) ) ;
  PrintWriter outp = new PrintWriter ( task + ".out" ) ;
  int T = Integer . parseInt ( in . readLine ( ) . substring ( 0 , in . readLine ( ) . length ( ) - 1 ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    int N = Integer . parseInt ( in . readLine ( ) . substring ( 0 , in . readLine ( ) . length ( ) - 1 ) ) ;
    int [ ] edges = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) edges [ i ] = - 1 ;
    List < Integer > revedges = new LinkedList < Integer > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) revedges [ i ] = new LinkedList < Integer > ( ) ;
    String st = in . readLine ( ) . substring ( in . readLine ( ) . length ( ) - 1 ) ;
    /* dfs(v) */
    int [ ] anses = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int v2 = revedges [ i ] . size ( ) ;
      anses [ i ] = dfs ( v2 ) + 1 ;
    }
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      int a = st . indexOf ( st ) ;
      a = Integer . parseInt ( a ) - 1 ;
      edges [ j ] = a ;
      revedges [ a ] . add ( j ) ;
    }
    Set < Integer > pairs = new HashSet < Integer > ( ) ;
    int loncyc = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int [ ] used = new int [ N ] ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        used [ j ] = - 1 ;
      }
      int cur = i ;
      int stm = 0 ;
      while ( used [ cur ] == - 1 ) {
        used [ cur ] = stm ;
        stm ++ ;
        cur