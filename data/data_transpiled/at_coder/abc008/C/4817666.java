static final int [ ] getCoin ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  ArrayList < Integer > listC = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) listC . add ( Integer . parseInt ( input ( ) ) ) ;
  double sumEV = 0 ;
  for ( Integer coin : listC ) {
    ArrayList < Integer > tmp = new ArrayList < Integer > ( listC ) ;
    tmp . remove ( coin ) ;
    double ct = 0 ;
    for ( Integer x : tmp ) {
      if ( coin % x == 0 ) ct += 1.0 ;
    }
    if ( ct % 2 == 1 ) sumEV += 0.5 ;
    else sumEV += ( ct + 2.0 ) / ( 2.0 * ct + 2 ) ;
  }
  System . out . println ( sumEV ) ;
}
