public static void input ( String s ) {
  int length = s . length ( ) ;
  for ( int i = 1 ;
  i < length ;
  i ++ ) {
    if ( s . substring ( 0 , length / 2 - i ) . equals ( s . substring ( length / 2 - i , length - i * 2 ) ) ) {
      System . out . println ( ( length / 2 - i ) * 2 ) ;
      break ;
    }
  }
}
