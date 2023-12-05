static final String [ ] DIRS = new String [ ] {
  ">" , ( short ) 1 , ( short ) 0 , ( short ) - 1 , ( short ) - 1 , ( short ) - 1 , ( short ) 1 , ( short ) 1 , }
  ;
  /* escapes the R and C into the m array */
  for ( int n : xrange ( 1 , 1000 ) ) {
    int r = i + DIRS [ d ] [ 0 ] * n ;
    int c = j + DIRS [ d ] [ 1 ] * n ;
    if ( r < 0 || r >= R || c < 0 || c >= C ) {
      return true ;
    }
    if ( m [ r ] [ c ] != '.' ) {
      return false ;
    }
  }
  /* compute the m array */
  int total = 0 ;
  for ( int i : xrange ( R ) ) {
    for ( int j : xrange ( C ) ) {
      if ( m [ i ] [ j ] == '.' ) {
        continue ;
      }
      if ( ! escapes ( R , C , m , i , j , m [ i ] [ j ] ) ) {
        continue ;
      }
      boolean found = false ;
      for ( int c : DIRS . keySet ( ) ) {
        if ( ! escapes ( R , C , m , i , j , c ) ) {
          found = true ;
          break ;
        }
      }
      if ( ! found ) {
        return "IMPOSSIBLE" ;
      }
      total ++ ;
    }
  }
  /* parse the data */
  int R = Integer . parseInt ( System . in . readLine ( ) ) ;
  int C = Integer . parseInt ( System . in . readLine ( ) ) ;
  int [ ] m = new int [ R ] ;
  for ( int i : xrange ( R ) ) {
    m [ i ] = System . in . readLine ( ) ;
  }
  / * ▁ if ▁ ( Class . getName ( ) ▁ = = ▁ "java.lang.String" ) ▁ {
    STRNEWLINE ▁ System . setIn ( "java.lang.String" , ▁ "java.lang.String" ) ;
    STRNEWLINE ▁ int ▁ T ▁ = ▁ Integer . parseInt ( System . in . readLine ( ) ) ;
    STRNEWLINE ▁ for ( int ▁ i ▁ : ▁ xrange ( T ) ) ▁ {
      STRNEWLINE ▁ int ▁ data ▁ = ▁ parse ( ) ;
      STRNEWLINE ▁ String ▁ result ▁ = ▁ compute ( data ) ;
      STRNEWLINE ▁ System . out . println ( " Case