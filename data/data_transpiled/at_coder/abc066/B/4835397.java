public static void input ( ) {
  String s = input . nextLine ( ) ;
  int l = s . length ( ) ;
  for ( int i = l - 2 + l % 2 ;
  i > 0 ;
  i -= 2 ) {
    if ( s . substring ( 0 , i / 2 ) . equals ( s . substring ( i / 2 , i ) ) ) {
      System . out . println ( i ) ;
      break ;
    }
  }
}
