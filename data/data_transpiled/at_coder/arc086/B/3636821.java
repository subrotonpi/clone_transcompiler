public static int [ ] inpl ( ) {
  return Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = inpl ( ) ;
  double mini = Double . MAX_VALUE ;
  double maxi = - mini ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    mini = Math . min ( mini , a [ i ] ) ;
    maxi = Math . max ( maxi , a [ i ] ) ;
  }
  System . out . println ( 2 * N - 1 ) ;
  if ( maxi > - mini ) {
    int x = a [ a . length - 1 ] + 1 ;
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      System . out . println ( x + " " + i ) ;
    }
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      System . out . println ( i + " " + i ) ;
    }
  }
  else {
    int x = a [ a . length - 1 ] + 1 ;
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      System . out . println ( x + " " + i ) ;
    }
    for ( int i = N ;
    i >= 1 ;
    i -- ) {
      System . out . println ( i + " " + i - 1 ) ;
    }
  }
  return a ;
}
