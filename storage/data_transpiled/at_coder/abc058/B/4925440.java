public static void print ( String O ) {
  String E = input ( ) ;
  if ( O . length ( ) == E . length ( ) ) {
    for ( int i = 0 ;
    i < O . length ( ) ;
    i ++ ) {
      System . out . print ( O . charAt ( i ) + E . charAt ( i ) ) ;
    }
  }
  else {
    for ( int i = 0 ;
    i < E . length ( ) ;
    i ++ ) {
      System . out . print ( O . charAt ( i ) + E . charAt ( i ) ) ;
    }
    System . out . println ( O . substring ( O . length ( ) - 1 ) ) ;
  }
}
