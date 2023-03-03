public static int d = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) {
  int i ;
  int [ ] cnt = new int [ 10 ] ;
  int digit = 0 ;
  String s = new String ( s ) ;
  int let = 0 ;
  while ( mp [ let ] >= 1 ) {
    for ( int j = 0 ;
    j < s . length ( ) ;
    j ++ ) {
      mp [ i ] -- ;
    }
    cnt [ digit ] ++ ;
  }
  for ( i = 1 ;
  i <= d ;
  i ++ ) {
    System . out . println ( "Case #" + i + ":" ) ;
    cnt = new int [ 10 ] ;
    mp = new int [ 26 ] ;
    for ( int j = 0 ;
    j < 26 ;
    j ++ ) {
      mp [ ( char ) ( 'A' + j ) ] = 0 ;
    }
    s = new String ( s ) ;
    for ( int j = 0 ;
    j < s . length ( ) ;
    j ++ ) {
      mp [ s . charAt ( j ) ] ++ ;
    }
    go ( mp , cnt , 0 , "ZERO" , "Z" ) ;
    go ( mp , cnt , 2 , "TWO" , "W" ) ;
    go ( mp , cnt , 6 , "SIX" , "X" ) ;
    go ( mp , cnt , 8 , "EIGHT" , "G" ) ;
    go ( mp , cnt , 4 , "FOUR" , "U" ) ;
    go ( mp , cnt , 1 , "ONE" , "O" ) ;
    go ( mp , cnt , 7 , "SEVEN" , "S" ) ;
    go ( mp , cnt , 5 , "FIVE" , "V" ) ;
    go ( mp , cnt , 3 , "THREE" , "R" ) ;
    go ( mp , cnt , 9 , "NINE" , "I" ) ;
    StringBuffer ans = new StringBuffer ( ) ;
    for ( i = 0 ;
    i < 10 ;
    i ++ ) {
      for ( int j = 0 ;
      j < cnt [ i ] ;
      j ++ ) {
        ans . append ( i ) ;
      }
    }
    System . out . println ( ans ) ;
  }
  return d ;
}
