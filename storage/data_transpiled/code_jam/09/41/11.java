@ org . junit . experimental . theories . DataPoints public static int [ ] [ ] process2 ( int n , String [ ] l ) throws IOException {
  /* We need to process the file */
  int swaps = 0 ;
  int length = l . length ;
  for ( int i = 0 ;
  i < length ;
  i ++ ) {
    for ( int j = i ;
    j < length ;
    j ++ ) {
      if ( l [ j ] . compareTo ( l [ j ] ) <= 0 ) {
        swaps += j - i ;
        String [ ] temp = l ;
        l = Arrays . copyOf ( l , j ) ;
        l [ j ] = new String [ n ] ;
        l [ i ] = temp ;
        break ;
      }
    }
    else {
      assert false ;
    }
  }
  /* We need to process the file */
  int t = Math . max ( s . lastIndexOf ( '1' ) , 0 ) ;
  /* We need to process the file */
  if ( f == null ) {
    if ( out == null ) {
      out = new java . io . FileOutputStream ( f + ".out.txt" ) ;
    }
    FileInputStream in = new FileInputStream ( f ) ;
    /* We need to process the file */
    in = new FileInputStream ( f ) ;
  }
  else {
    if ( out == null ) {
      out = new java . io . FileOutputStream ( f + ".out.txt" ) ;
    }
  }
  int t = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
  for ( int xm1 = 0 ;
  xm1 < t ;
  xm1 ++ ) {
    n = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
    l = new String [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      l [ i ] = processLine ( in . readLine ( ) . trim ( ) ) ;
    }
    int guess = process2 ( n , l ) ;
    out . write ( "Case #" + ( xm1 + 1 ) + ": " + guess + "\n" ) ;
  }
  if ( out instanceof java . io . PrintWriter ) {
    System . out . println ( out . toString ( ) ) ;
    return out . toString ( ) . split ( "\n" ) ;
  }
  /* We need to process the file */
  TEST_DATA = new String [ ] [ ] {
    {
      "