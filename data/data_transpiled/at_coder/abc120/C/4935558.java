public static void input ( ) {
  int a = 0 ;
  int b = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( ( s . charAt ( i ) == '0' ) ) a ++ ;
    else b ++ ;
  }
  System . out . println ( s . length ( ) - Math . abs ( a - b ) ) ;
}
