public static void print ( String s ) {
  String t = input . next ( ) ;
  int m = 0 ;
  for ( int i = N ;
  i > 0 ;
  i -- ) {
    boolean unity = true ;
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      if ( s . charAt ( s . length ( ) - ( j + 1 ) ) == t . charAt ( i - j - 1 ) ) {
        continue ;
      }
      else {
        unity = false ;
      }
    }
    if ( unity ) {
      m = i ;
      break ;
    }
  }
  System . out . println ( String . valueOf ( 2 * N - m ) ) ;
}
