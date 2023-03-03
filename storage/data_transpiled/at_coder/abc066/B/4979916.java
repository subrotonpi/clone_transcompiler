public static void input ( ) {
  String s = input . nextLine ( ) ;
  int n = s . length ( ) ;
  for ( int i = 1 ;
  i < Integer . MAX_VALUE ;
  i ++ ) {
    int d = Integer . MAX_VALUE - i ;
    s = s . substring ( 0 , s . length ( ) - 2 ) ;
    if ( s . equals ( s . substring ( 0 , d ) * 2 ) ) {
      System . out . println ( 2 * d ) ;
      break ;
    }
  }
}
