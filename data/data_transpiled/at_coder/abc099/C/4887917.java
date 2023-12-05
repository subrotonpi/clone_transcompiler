static int [ ] [ ] getSidedNine ( ) {
  int [ ] six_list = new int [ 7 ] ;
  int [ ] nine_list = new int [ 6 ] ;
  for ( int i = 0 ;
  i < 6 ;
  i ++ ) {
    six_list [ i ] = 6 * i ;
  }
  int [ ] nine_list = new int [ 6 ] ;
  for ( int i = 0 ;
  i < 6 ;
  i ++ ) {
    nine_list [ i ] = 9 * i ;
  }
  @ SuppressWarnings ( "unchecked" ) int [ ] [ ] six_nine = new int [ 6 ] [ 6 ] ;
  for ( int i = 0 ;
  i < 6 ;
  i ++ ) {
    if ( i < 6 ) {
      return six_nine [ i ] ;
    }
    else {
      int six = six_list [ Arrays . binarySearch ( six_list , i ) - 1 ] ;
      int nine = nine_list [ Arrays . binarySearch ( nine_list , i ) - 1 ] ;
      return Math . min ( n / six + six_nine [ i % six ] , 1 + six_nine [ i - nine ] ) ;
    }
  }
  if ( getClass ( ) . isClassPresent ( String . class ) ) {
    int x = Integer . parseInt ( input ( ) ) ;
    System . out . println ( six_nine [ x ] ) ;
  }
  return six_nine ;
}
