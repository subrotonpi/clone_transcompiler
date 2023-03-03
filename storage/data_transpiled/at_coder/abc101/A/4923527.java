public static void input ( ) {
  int number = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == '+' ) number ++ ;
    else number -- ;
  }
  System . out . println ( number ) ;
}
