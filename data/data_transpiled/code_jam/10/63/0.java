static void main ( String [ ] args ) {
  int [ ] [ ] x2 = new int [ 41 ] [ 21 ] ;
  for ( int i = 0 ;
  i < 20 ;
  i ++ ) {
    x2 [ i + 1 ] = Arrays . copyOf ( x2 [ i + 1 ] , x2 [ i ] . length ) ;
  }
  String type = "test" ;
  for ( int o = 0 ;
  o < args . length ;
  o ++ ) {
    if ( "-h" . equals ( args [ o ] ) || "-help" . equals ( args [ o ] ) ) {
      usage ( ) ;
      System . exit ( 2 ) ;
    }
    else if ( "-s" . equals ( args [ o ] ) || "-small" . equals ( args [ o ] ) ) {
      type = "small" ;
    }
    else if ( "-l" . equals ( args [ o ] ) || "-large" . equals ( args [ o ] ) ) {
      type = "large" ;
    }
  }
  String infile = "c:\\documents and codejam\\linguo\\/problemC-" + type + ".in" ;
  String outfile = "c:\\documents and codejam\\linguo\\/problemC-" + type + ".out" ;
  SolveCodeJam ( infile , ProblemC , outfile ) ;
  if ( __name__ . equals ( "__main__" ) ) {
    main ( ) ;
  }
  for ( int i = 0 ;
  i < 20 ;
  i ++ ) {
    System . out . println ( i ) ;
    for ( int j = 0 ;
    j < 61 ;
    j ++ ) {
      for ( int k = 0 ;
      k < 41 ;
      k ++ ) {
        for ( int l = 0 ;
        l < 21 ;
        l ++ ) {
          x3 [ i + 1 ] [ j ] [ k ] [ l ] = ok ( i , j - 1 , k , l ) && ( ok ( i , j - 2 , k , l ) || ok ( i , j , k - 1 , l ) ) && ( ok ( i , j - 3 , k , l ) || ok ( i , j - 1 , k - 1 , l ) || ok ( i , j , k , l ) ) ;
        }
      }
    }
  }
  x3 = new String [ 21 ] [ 21 ] ;
  for ( int j = 0 ;
  j < 21 ;
  j ++ ) {
    for ( int k = 0 ;
    k < 21 ;
    