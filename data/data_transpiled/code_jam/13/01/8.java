public static boolean yoba ( String [ ] s , char ch ) {
  boolean [ ] lines = new boolean [ 10 ] ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 4 ;
    j ++ ) {
      lines [ j ] = lines [ j ] && ( s [ i ] . charAt ( j ) == ch || s [ j ] . charAt ( j ) == 'T' ) ;
      lines [ j + 4 ] = lines [ j + 4 ] && ( s [ j ] . charAt ( i ) == ch || s [ j ] . charAt ( i ) == 'T' ) ;
    }
    lines [ 8 ] = lines [ 8 ] && ( s [ i ] . charAt ( i ) == ch || s [ i ] . charAt ( i ) == 'T' ) ;
    lines [ 9 ] = lines [ 9 ] && ( s [ 3 - i ] . charAt ( i ) == ch || s [ 3 - i ] . charAt ( i ) == ch || s [ 3 - i ] . charAt ( i ) == 'T' ) ;
  }
  return ArrayUtils . isNotEmpty ( lines ) ;
  for ( int i = 0 ;
  i < Integer . parseInt ( input ( ) ) ;
  i ++ ) {
    StringBuilder sb = new StringBuilder ( ) ;
    for ( int j = 0 ;
    j < 4 ;
    j ++ ) {
      sb . append ( s [ j ] ) ;
    }
    String ans ;
    if ( yoba ( sb , "X" ) ) {
      ans = "X won" ;
    }
    else if ( yoba ( sb , "O" ) ) {
      ans = "O won" ;
    }
    else if ( ! sb . toString ( ) . contains ( "." ) ) {
      ans = "Draw" ;
    }
    else {
      ans = "Game has not completed" ;
    }
    input ( ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + ans ) ;
  }
  return ArrayUtils . isNotEmpty ( lines ) ;
}
