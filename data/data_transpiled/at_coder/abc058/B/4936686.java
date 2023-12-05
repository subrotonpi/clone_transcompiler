public static void print ( String O ) {
  String E = input ;
  for ( int i = 0 ;
  i < O . length ( ) + E . length ( ) ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      System . out . print ( O . charAt ( ( int ) ( i / 2 ) ) ) ;
    }
    else {
      System . out . print ( E . charAt ( ( int ) ( ( i - 1 ) / 2 ) ) ) ;
    }
  }
}
