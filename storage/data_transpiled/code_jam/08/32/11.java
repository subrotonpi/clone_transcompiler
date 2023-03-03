static final Scanner getScanner ( ) throws FileNotFoundException {
  final Scanner is = new Scanner ( new File ( "B-small-attempt0.in" ) ) ;
  final int cases = Integer . parseInt ( is . nextLine ( ) ) ;
  int case = 0 ;
  final int [ ] odp = {
    2 , 3 , 5 , 7 }
    ;
    /* Count the number of digits in the string */
    if ( num . length ( ) == 0 ) {
      if ( isUgly ( sum ) ) {
        return 1 ;
      }
      else {
        return 0 ;
      }
    }
    int cug = 0 ;
    for ( int i = 1 ;
    i <= num . length ( ) ;
    i ++ ) {
      final String num = is . nextLine ( ) ;
      num = num . substring ( 0 , num . length ( ) - 1 ) ;
      cug = countUgly ( num , 0 ) ;
      cug /= 2 ;
      System . out . println ( "Case #" + ( case + 1 ) + ": " + cug ) ;
    }
    is . close ( ) ;
    return null ;
  }
  