public static void main ( String input ) {
  int m ;
  do {
    m = Integer . parseInt ( input . substring ( 0 , 1 ) ) ;
    if ( m >= 0 ) {
      if ( m <= 100000 ) {
        break ;
      }
    }
  }
  while ( m < 100 ) ;
  int vv = 0 ;
  if ( m <= 5000 ) {
    vv = m / 100 ;
  }
  else {
    vv = m / 1000 ;
  }
}
