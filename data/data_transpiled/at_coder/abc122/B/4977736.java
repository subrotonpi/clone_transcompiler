public static void input ( ) {
  int max = 0 ;
  int cnt = 0 ;
  for ( char i : str ) {
    if ( ( i == 'A' || i == 'C' || i == 'G' || i == 'T' ) ) {
      cnt ++ ;
      if ( ( cnt >= max ) && ( cnt <= max ) ) {
        max = cnt ;
      }
    }
    else {
      cnt = 0 ;
    }
  }
  System . out . println ( max ) ;
}
