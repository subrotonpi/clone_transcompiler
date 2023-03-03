@ String ( filename = "B-large.in" ) public static void main ( String filename ) throws IOException {
  BufferedReader br = new BufferedReader ( new FileReader ( filename ) ) ;
  PrintWriter of = new PrintWriter ( "B-large.out" ) ;
  /* Try config */
  int [ ] [ ] c = cust ;
  for ( int i = 0 ;
  i < c . length ;
  i ++ ) {
    boolean good = false ;
    for ( int j = 0 ;
    j < c [ i ] . length ;
    j ++ ) {
      if ( ( ans [ c [ i ] [ j ] - 1 ] [ j ] == 1 ) && ( j < c [ i ] . length - 1 ) ) {
        good = true ;
        break ;
      }
    }
    if ( ( ! good ) && ( j < c . length - 1 ) ) {
      for ( int j = 0 ;
      j < c . length ;
      j ++ ) {
        if ( ( ans [ c [ i ] [ j ] ] [ j ] == 1 ) && ( j < c [ i ] . length - 1 ) ) {
          ans [ c [ i ] [ j ] - 1 ] = 1 ;
          if ( ( good = false ) && ( j < c [ i ] . length - 1 ) ) {
            good = true ;
            break ;
          }
          ans [ c [ i ] [ j ] ] = 0 ;
        }
      }
      return good ;
    }
  }
  int C = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int x = 0 ;
  x < C ;
  x ++ ) {
    int N = Integer . parseInt ( br . readLine ( ) ) ;
    int [ ] customers = new int [ N ] ;
    for ( int y = 0 ;
    y < M ;
    y ++ ) {
      customers [ y ] = Integer . parseInt ( br . readLine ( ) ) ;
    }
  }
  int [ ] ans = new int [ N ] ;
  if ( ( good = false ) && ( ans . length > 0 ) ) {
    String s = "" ;
    for ( int k = 0 ;
    k < ans . length ;
    k ++ ) {
      s += ans [ k ] + " " ;
    }
    print >> of . println ( "Case #" + ( x + 1 ) + ": " + s ) ;
    print >> of . println ( ) ;
  }
  else {
    print > of . println ( "Case #" + ( x + 1 ) + ": IMPOSSIBLE" ) ;
    print > of . println