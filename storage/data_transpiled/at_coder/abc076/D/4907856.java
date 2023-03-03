public static void print ( int n = Integer . parseInt ( input ) ) {
  int [ ] ts = new int [ n ] ;
  for ( String item : input . split ( " " ) ) {
    ts [ 0 ] = Integer . parseInt ( item ) * 2 ;
  }
  int [ ] vs = new int [ n ] ;
  for ( String item : input . split ( " " ) ) {
    vs [ 0 ] = Integer . parseInt ( item ) ;
  }
  int time = Arrays . stream ( ts ) . mapToInt ( Integer :: parseInt ) . sum ( ) + 1 ;
  double [ ] speedL = new double [ time ] ;
  double [ ] speedR = new double [ time ] ;
  int tId = 0 ;
  double speed = 0 ;
  int [ ] tsCopy = ts . clone ( ) ;
  for ( int i = time + 1 ;
  i >= 0 ;
  i -- ) {
    tsCopy [ tId ] -- ;
    speedL [ i ] = speed ;
    if ( speed >= vs [ tId ] ) {
      speed = vs [ tId ] ;
    }
    else {
      speed += 0.5 ;
    }
    if ( ts [ tId ] == 0 ) {
      if ( tId <= 0 ) {
        break ;
      }
      tId -- ;
    }
  }
  System . out . println ( Arrays . toString ( speedR ) / 2.0 ) ;
}
