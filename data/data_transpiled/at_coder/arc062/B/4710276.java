public static void input ( ) {
  String s = input ( ) ;
  String m = "gp" + ( s . length ( ) / 2 + 1 ) ;
  int g = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == m . charAt ( i ) ) {
      continue ;
    }
    else if ( s . charAt ( i ) == 'p' ) {
      g -- ;
    }
    else {
      g ++ ;
    }
  }
  System . out . println ( g ) ;
}
