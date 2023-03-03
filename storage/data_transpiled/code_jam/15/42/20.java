static final String solve ( ) {
  final Scanner in = new Scanner ( System . in ) ;
  final double rate = in . nextDouble ( ) ;
  int temp ;
  int temp ;
  int rate = in . nextInt ( ) ;
  if ( Math . abs ( temp - X ) < 1e-8 ) {
    return "" + ( V / rate ) ;
  }
  if ( temp < X ) {
    ret = removeSource ( 0 ) ;
    if ( ret != 0 ) {
      return ret ;
    }
  }
  else {
    ret = removeSource ( R . length - 1 ) ;
    if ( ret != 0 ) {
      return ret ;
    }
  }
  if ( R . length ( ) == 0 ) {
    assert false ;
  }
  System . out . format ( "Case #%d: %s" , testcase + 1 , solve ( ) ) ;
  return null ;
}
