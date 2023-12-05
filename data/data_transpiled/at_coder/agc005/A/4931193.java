public static void input ( ) {
  int count = 0 ;
  int s = 0 ;
  for ( char x : X ) {
    if ( x == 'S' ) {
      s ++ ;
    }
    else if ( s > 0 ) {
      s -- ;
      count ++ ;
    }
  }
  System . out . println ( X . length - count * 2 ) ;
}
