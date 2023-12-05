static final int [ ] getDigits ( ) {
  String S = input ( ) ;
  int total = 0 ;
  int prev = 0 ;
  for ( boolean [ ] p : new boolean [ ] {
    false , true }
    ) {
      prev = 0 ;
      for ( int i = 0 ;
      i < p . length ;
      i ++ ) {
        if ( p [ i ] ) {
          total += Integer . parseInt ( S . substring ( prev , i + 1 ) ) ;
          prev = i + 1 ;
        }
      }
      total += Integer . parseInt ( S . substring ( prev ) ) ;
    }
    if ( total == 0 ) {
      total = Integer . MAX_VALUE ;
    }
    System . out . println ( total ) ;
    return null ;
  }
  