static final String getSortingFile ( ) throws IOException {
  BufferedReader in = new BufferedReader ( new FileReader ( "D-small-attempt0.in" ) ) ;
  Arrays . sort ( in ) ;
  BufferedWriter wfile = new BufferedWriter ( new FileWriter ( "result" ) ) ;
  int T = Integer . parseInt ( in . readLine ( ) ) ;
  in = in . readLine ( ) ;
  for ( int caseNo = 1 ;
  caseNo <= T ;
  caseNo ++ ) {
    String line = in . readLine ( ) ;
    in = in . readLine ( ) ;
    int P = Integer . parseInt ( line ) ;
    int W = Integer . parseInt ( line ) ;
    line = in . readLine ( ) ;
    in = in . readLine ( ) ;
    stars = new HashMap < > ( ) ;
    for ( int i = 0 ;
    i < P ;
    i ++ ) {
      stars . put ( i , new HashSet < > ( ) ) ;
    }
    for ( String tmp = line . split ( " " ) ;
    tmp . length ( ) > 0 ;
    ) {
      int a = Integer . parseInt ( tmp . split ( "," ) [ 0 ] ) ;
      int b = Integer . parseInt ( tmp . split ( "," ) [ 0 ] ) ;
      stars . get ( a ) . add ( b ) ;
      stars . get ( b ) . add ( a ) ;
    }
    if ( 1 >= stars . get ( 0 ) . size ( ) ) {
      wfile . write ( "Case #" + caseNo + ": 0 " + stars . get ( 0 ) . size ( ) ) ;
      continue ;
    }
    ArrayList < ArrayList < Integer >> todo = new ArrayList < > ( ) ;
    ArrayList < Integer > route = new ArrayList < > ( ) ;
    route . add ( 0 ) ;
    for ( int i = 0 ;
    i < stars . get ( 0 ) . size ( ) ;
    i ++ ) {
      ArrayList < Integer > tmp = new ArrayList < > ( ) ;
      route . add ( i ) ;
      tmp . add ( stars . get ( i ) . get ( i ) ) ;
      todo . add ( tmp ) ;
    }
    boolean find = false ;
    int maxth = 0 ;
    int n [ ] = new int [ N ] ;
    n [ 0 ] = stars . get ( 0 ) . size ( ) ;
    int rlen = P ;
    while ( todo . size ( ) > 0 ) {
      route = todo . get ( 0 ) ;
      if ( route . size ( ) > rlen + 1 ) {
        todo