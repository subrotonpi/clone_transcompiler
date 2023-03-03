public static String [ ] [ ] inputF = new String [ ] [ ] {
  {
    "C-small-attempt0.in" , "C-small-attempt0.out" }
    ;
    PrintWriter output = new PrintWriter ( "C-small-attempt0.out" ) ;
    int numCases = Integer . parseInt ( inputF . readLine ( ) ) ;
    /* Check config */
    int r = houseConfig . length ;
    int c = houseConfig [ 0 ] . length ;
    char [ ] [ ] locks = new char [ r ] [ c ] ;
    for ( int i = 0 ;
    i < r ;
    i ++ ) {
      char c = houseConfig [ i ] [ j ] ;
      if ( c == '#' ) break ;
      else if ( c == '|' ) {
        locks [ i ] [ k ] = 'C' ;
      }
    }
    char [ ] [ ] updateMade = {
      {
        'C' , '-' }
      }
      ;
      for ( int i = 0 ;
      i < r ;
      i ++ ) {
        char c = houseConfig [ i ] [ j ] ;
        if ( c == '#' ) break ;
        else if ( c == '-' ) {
          locks [ i ] [ j ] = '.' ;
        }
      }
      char [ ] [ ] c = houseConfig [ i ] [ j ] ;
      if ( c == '#' ) break ;
      boolean horizontalCollide = false ;
      for ( int k = 0 ;
      k < c ;
      k ++ ) {
        char c = houseConfig [ i ] [ j ] ;
        if ( c == '#' ) break ;
        else if ( c == '|' ) {
          if ( c == '-' ) break ;
        }
        else if ( c == '.' ) {
          if ( c == '|' ) {
            horizontalCollide = true ;
            break ;
          }
        }
        for ( int k = 0 ;
        k < c ;
        k ++ ) {
          char c = houseConfig [ i ] [ j ] ;
          if ( c == '#' ) break ;
        }
        for ( int k = 0 ;
        k < c ;
        k ++ ) {
          char c = houseConfig [ i ] [ j ] ;
          if ( c == '#' ) break ;
        }
      }
      for ( int i = 0 ;
      i < r ;
      i ++ ) {
        char c = houseConfig [ i ] [ j ] ;
        if ( c == '#' ) break ;
      }
      for ( int k = 0 ;
      k < c ;
      k ++ ) {
        char