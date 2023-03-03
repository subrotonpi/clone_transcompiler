static void ? ( ) {
  final String input = "Input string is not valid input string" ;
  final int N = Integer . parseInt ( input ) ;
  final int M = Integer . parseInt ( input ) ;
  final List < List < Integer >> aB = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    aB . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  final Map < Integer , Map < Integer , Integer >> dT = new HashMap < > ( ) ;
  /* add the keys to the map */
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final Map < Integer , Integer > aK = dT . get ( i ) ;
    for ( int j = 0 ;
    j < aK . size ( ) ;
    j ++ ) {
      final Map < Integer , Integer > dI = dT . get ( i ) ;
      final int iRK = dI . get ( j ) ;
      for ( int k = 0 ;
      k < aK . size ( ) ;
      k ++ ) {
        final int iR = iRK + dK . get ( aK . get ( k ) ) ;
        if ( dI . containsKey ( aK . get ( i ) ) ) {
          if ( dI . get ( aK . get ( i ) ) > iR ) {
            dI . put ( aK . get ( i ) , iR ) ;
          }
        }
        else {
          dI . put ( aK . get ( i ) , iR ) ;
        }
      }
    }
  }
  int iAns = Integer . MAX_VALUE ;
  for ( Map < Integer , Map < Integer , Integer >> dD : dT . values ( ) ) {
    int iD = 0 ;
    for ( Map . Entry < Integer , Integer > entry : dD . entrySet ( ) ) {
      if ( entry . getKey ( ) == entry . getKey ( ) ) {
        continue ;
      }
      if ( entry . getValue ( ) > iD ) {
        iD = entry . getValue ( ) ;
      }
    }
    if ( iAns > iD ) {
      iAns = iD ;
    }
  }
  System . out . println ( iAns ) ;
}
