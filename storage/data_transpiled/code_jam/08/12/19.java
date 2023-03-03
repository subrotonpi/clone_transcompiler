public static final String getShortestString ( ) throws IOException {
  String filein = args [ 0 ] ;
  String fileout = args [ 1 ] ;
  BufferedReader fin = new BufferedReader ( new FileReader ( filein ) ) ;
  BufferedWriter fout = new BufferedWriter ( new OutputStreamWriter ( fileout ) ) ;
  int C = Integer . parseInt ( fin . readLine ( ) ) ;
  for ( int i = 1 ;
  i <= C ;
  i ++ ) {
    int N = Integer . parseInt ( fin . readLine ( ) ) ;
    int M = Integer . parseInt ( fin . readLine ( ) ) ;
    int [ ] [ ] malts = new int [ M ] [ N ] ;
    int [ ] tomake = new int [ N ] ;
    for ( int m = 0 ;
    m < M ;
    m ++ ) {
      int [ ] row = new int [ N ] ;
      for ( int n = 0 ;
      n < N ;
      n ++ ) {
        row [ n ] = 0 ;
      }
      malts [ m ] = row ;
    }
    for ( int m = 0 ;
    m < M ;
    m ++ ) {
      String [ ] s = fin . readLine ( ) . split ( " " ) ;
      for ( int n = 0 ;
      n < s . length ;
      n ++ ) {
        s [ n ] = Integer . parseInt ( s [ n ] ) ;
      }
      int T = s [ 0 ] ;
      for ( int n = 0 ;
      n < T ;
      n ++ ) {
        malts [ m ] [ s [ 2 * n + 1 ] - 1 ] = 2 - s [ 2 * n + 2 ] ;
      }
    }
    int again = 1 ;
    int impossible = 0 ;
    while ( again == 1 && impossible == 0 ) {
      for ( int m = 0 ;
      m < malts . length ;
      m ++ ) {
        again = 0 ;
        if ( Integer . parseInt ( malts [ m ] [ m ] ) == 1 ) {
          again = 1 ;
          int idx = malts [ m ] [ m ] . indexOf ( 1 ) ;
          tomake [ m ] = new int [ N ] ;
          malts [ m ] = new int [ N ] ;
          for ( int m2 = 0 ;
          m2 < M ;
          m2 ++ ) {
            switch ( malts [ m2 ] [ idx ] ) {
              case 1 : malts [ m2 ] = new int [ N ] ;
              break ;
              case 2 : malts [ m2 ] [ idx ] = 0 ;
              if ( Integer . parseInt ( malts [ m2 ] [ idx ] ) == 0 ) {
                impossible = 1 ;
              }
              