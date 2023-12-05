public static final String [ ] [ ] getStrings ( ) throws IOException {
  System . setIn ( new FileInputStream ( "data.txt" ) ) ;
  System . setOut ( new FileOutputStream ( "out.txt" ) ) ;
  BufferedReader input = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  for ( int cnum = 0 ;
  cnum < Integer . parseInt ( input . readLine ( ) ) ;
  cnum ++ ) {
    System . out . println ( "Case #" + ( cnum + 1 ) + ":" ) ;
    int r = Integer . parseInt ( input . readLine ( ) ) ;
    int c = Integer . parseInt ( input . readLine ( ) ) ;
    char [ ] [ ] g = new char [ r ] [ c ] ;
    for ( int i = 0 ;
    i < r ;
    i ++ ) g [ i ] = new char [ c ] ;
    boolean started = false ;
    for ( int i = 0 ;
    i < r ;
    i ++ ) {
      if ( ! started ) {
        for ( int j = 0 ;
        j < c ;
        j ++ ) {
          if ( ( ! started ) && g [ i ] [ j ] != '?' ) started = true ;
          else if ( started && g [ i ] [ j ] == '?' ) g [ i ] [ j ] = g [ i ] [ j - 1 ] ;
        }
        if ( started ) {
          for ( int j = 0 ;
          j < c ;
          j ++ ) {
            if ( g [ i ] [ j ] == '?' ) g [ i ] [ j ] = g [ i ] [ j + 1 ] ;
            for ( int ii = 0 ;
            ii < i ;
            ii ++ ) g [ ii ] [ j ] = g [ i ] [ j ] ;
          }
        }
      }
      else {
        for ( int j = 0 ;
        j < c ;
        j ++ ) {
          if ( j > 0 && g [ i ] [ j ] == g [ i ] [ j - 1 ] ) continue ;
          int jj = j ;
          boolean hit = false ;
          if ( g [ i ] [ j ] != '?' ) hit = true ;
          while ( jj + 1 < c && g [ i - 1 ] [ j ] == g [ i - 1 ] [ jj + 1 ] ) {
            jj ++ ;
            if ( g [ i ] [ jj ] != '?' ) hit = true ;
          }
          if ( ! hit ) {
            for ( int j = j ;
            j <= jj ;
            j ++