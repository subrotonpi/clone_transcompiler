static void print ( ) {
  import sys ;
  int a = 0 ;
  for ( String i : sys . stdin ) {
    if ( "r" . equals ( i ) ) {
      a ++ ;
    }
  }
  System . out . println ( a ) ;
}
