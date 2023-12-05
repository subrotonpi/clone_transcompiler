static final String getAlphabet ( ) {
  final String alphabet = string . getAlphabet ( ) ;
  final String S = input . next ( ) ;
  final int [ ] count = new int [ alphabet . length ( ) ] ;
  for ( int i = 0 ;
  i < count . length ;
  i ++ ) {
    final char a = alphabet . charAt ( i ) ;
    if ( count [ alphabet . indexOf ( a ) ] == 0 ) {
      System . out . println ( S + a ) ;
      exit ( ) ;
    }
  }
  count [ alphabet . length ( ) ] = 0 ;
  for ( int i = 0 ;
  i < count . length ;
  i ++ ) count [ i ] = 0 ;
  String cand = "" ;
  for ( int i = S . length ( ) - 1 ;
  i >= 0 ;
  i -- ) {
    cand += S . charAt ( i ) ;
    if ( i == S . length ( ) - 1 ) {
      System . out . println ( - 1 ) ;
      exit ( ) ;
    }
    String res = "" ;
    for ( int j = 0 ;
    j < cand . length ( ) ;
    j ++ ) {
      final char a = cand . charAt ( j ) ;
      if ( ( S . charAt ( S . length ( ) - ( i + 2 ) ) < ( a ) ) && ( a < ' ' ) ) {
        if ( res != null && res . compareTo ( S . substring ( 0 , S . length ( ) - i - 2 ) + a ) < 0 ) {
          exit ( ) ;
        }
        else {
          res = S . substring ( 0 , S . length ( ) - i - 2 ) + a ;
        }
      }
    }
    if ( res != null ) {
      System . out . println ( res ) ;
      exit ( ) ;
    }
  }
  return cand ;
}
