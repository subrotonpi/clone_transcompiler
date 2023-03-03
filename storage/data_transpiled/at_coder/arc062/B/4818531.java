public static void input ( Scanner s ) {
  int gu = 0 ;
  int pa = 0 ;
  int win = 0 ;
  while ( s . hasNextInt ( ) ) {
    char t = s . charAt ( 0 ) ;
    if ( t == 'g' ) {
      if ( gu > pa ) {
        pa ++ ;
        win ++ ;
      }
      else {
        gu ++ ;
      }
    }
    else {
      if ( gu > pa ) {
        pa ++ ;
      }
      else {
        win -- ;
        gu ++ ;
      }
    }
  }
  System . out . println ( win ) ;
}
