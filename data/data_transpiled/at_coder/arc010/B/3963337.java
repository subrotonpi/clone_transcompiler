@ VisibleForTesting static void from ( Scanner input ) {
  int N = input . nextInt ( ) ;
  boolean [ ] flag = new boolean [ 366 ] ;
  for ( int i = 0 ;
  i < 366 ;
  i ++ ) {
    flag [ i ] = i % 7 == 0 || i % 7 == 6 ? true : false ;
  }
  Calendar start = Calendar . getInstance ( ) ;
  start . set ( 2012 , 1 , 1 ) ;
  for ( ;
  ;
  ) {
    int month = Integer . parseInt ( input . next ( ) ) ;
    int day = Integer . parseInt ( input . next ( ) ) ;
    int index = ( new GregorianCalendar ( 2012 , month , day ) . getTimeInMillis ( ) - start . getTimeInMillis ( ) ) ;
    do {
      if ( index < 366 ) {
        if ( flag [ index ] ) {
          index ++ ;
        }
        else {
          flag [ index ] = true ;
          break ;
        }
      }
      else {
        break ;
      }
    }
    while ( index < 366 ) ;
  }
  int ans = 0 ;
  int length = 0 ;
  for ( int i = 0 ;
  i < 366 ;
  i ++ ) {
    if ( flag [ i ] ) {
      length ++ ;
      ans = Math . max ( ans , length ) ;
    }
    else {
      length = 0 ;
    }
  }
  System . out . println ( ans ) ;
}
