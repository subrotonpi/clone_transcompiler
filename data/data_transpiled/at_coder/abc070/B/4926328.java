public static void print ( ) {
  int a = 0 ;
  int b = 0 ;
  int c = 0 ;
  int d = 0 ;
  for ( String item : input . nextLine ( ) . split ( " " ) ) {
  }
  int time = 0 ;
  for ( int i = 0 ;
  i < 100 ;
  i ++ ) {
    if ( i >= a && i < b && i >= c && i < d ) {
      time ++ ;
    }
  }
  System . out . println ( time ) ;
}
