@ VisibleForTesting static void from ( Date d ) {
  Date d = new Date ( 2012 , 1 , 1 ) ;
  int v = 0 ;
  Set < Calendar > st = new HashSet < > ( ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    Calendar buf = Calendar . getInstance ( ) ;
    buf . setTime ( d ) ;
    buf . add ( Calendar . DATE , b ) ;
    while ( true ) {
      int wd = buf . get ( Calendar . DAY_OF_WEEK ) ;
      if ( wd != 5 && wd != 6 && ! buf . equals ( d ) ) {
        st . add ( buf ) ;
        break ;
      }
      buf . add ( Calendar . DATE , 1 ) ;
    }
  }
  int ans = 0 ;
  while ( d . getYear ( ) == 2012 ) {
    int wd = d . getDayOfWeek ( ) ;
    if ( wd == 5 || wd == 6 || st . contains ( d ) ) {
      v ++ ;
    }
    else {
      v = 0 ;
    }
    ans = Math . max ( ans , v ) ;
    d . add ( Calendar . DATE , 1 ) ;
  }
  System . out . println ( ans ) ;
}
