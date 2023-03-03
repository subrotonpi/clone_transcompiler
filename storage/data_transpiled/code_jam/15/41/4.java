public static int tnum = Integer . parseInt ( Scanner in ) {
  for ( int tcou = 0 ;
  tcou < tnum ;
  tcou ++ ) {
    int n = in . nextInt ( ) , m = in . nextInt ( ) ;
    char [ ] [ ] t = new char [ n ] [ ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      t [ i ] = in . next ( ) ;
    }
    /*can the first char at the end of the string*/
    if ( t [ r ] . length > 0 && t [ r ] [ c ] + t [ r ] [ c + 1 ] != '.' && t [ r ] [ c ] != '.' && t [ r ] [ c + 1 ] != '.' ) {
      return true ;
    }
    if ( new String ( t ) . charAt ( c ) != '.' ) {
      /*can the first char at the end of the string*/
      if ( t [ r ] [ c ] != '.' ) {
        /*can the first char at the end of the string*/
        if ( t [ r ] [ c ] != '<' ) {
          if ( t [ r ] [ c ] == '>' ) {
            if ( ! can ( t [ r ] [ c ] ) ) {
              /*can the first char at the end of the string*/
              good = false ;
              ans ++ ;
            }
            break ;
          }
        }
      }
    }
    for ( int r = 0 ;
    r < n ;
    r ++ ) {
      for ( int c = m ;
      c > 0 ;
      c -- ) {
        if ( t [ r ] [ c ] != '.' ) {
          /*can the first char at the end of the string*/
          if ( t [ r ] [ c ] == '^' ) {
            if ( ! can ( t [ r ] [ c ] ) ) {
              /*can the first char at the end of the string*/
              if ( ! can ( t [ r ] [ c ] ) ) {
                /*can the second char at the end of the string*/
                ans ++ ;
              }
              break ;
            }
          }
        }
      }
    }
    System . out . println ( "Case #"