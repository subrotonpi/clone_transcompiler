@ VisibleForTesting static double solve ( double d , double a , List < Pair < Double , Double >> otherCar ) {
  String line = System . getProperty ( "line.separator" ) ;
  String [ ] fields = line . split ( " " ) ;
  assert fields . length == 1 ;
  int ntc = Integer . parseInt ( fields [ 0 ] ) ;
  {
    double d = Double . parseDouble ( fields [ 0 ] ) ;
    double d = Double . parseDouble ( fields [ 1 ] ) ;
    double d = Double . parseDouble ( fields [ 2 ] ) ;
    double d = Double . parseDouble ( fields [ 3 ] ) ;
    double d = Double . parseDouble ( fields [ 4 ] ) ;
    double d = Double . parseDouble ( fields [ 5 ] ) ;
    double d = Double . parseDouble ( fields [ 6 ] ) ;
    double d = Double . parseDouble ( fields [ 7 ] ) ;
    double d = Double . parseDouble ( fields [ 8 ] ) ;
    double d = Double . parseDouble ( fields [ 9 ] ) ;
    double d = Double . parseDouble ( fields [ 10 ] ) ;
    double n = Double . parseDouble ( fields [ 11 ] ) ;
    int a = Integer . parseInt ( fields [ 12 ] ) ;
    List < Pair < Double , Double >> otherCar = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      double time = Double . parseDouble ( fields [ i ] ) ;
      double distance = Double . parseDouble ( fields [ i ] ) ;
      if ( distance > d ) {
        if ( first ) {
          break ;
        }
        time = lastTime + ( time - lastTime ) * ( d - lastDistance ) / ( distance - lastDistance ) ;
        distance = d ;
      }
      first = false ;
      double arrivalTime = Math . sqrt ( 2 * distance / a ) ;
      if ( arrivalTime < time ) {
        double curWaitTime = time - arrivalTime ;
        if ( curWaitTime > wait_time ) {
          wait_time = curWaitTime ;
        }
        lastTime = time ;
        lastDistance = distance ;
      }
      arrivalTime = Math . sqrt ( 2 * d / a ) ;
    }
    return d + arrivalTime ;
  }
}
