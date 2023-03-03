public static void theArrayList ( ArrayList < Integer > theArrayList ) {
  theArrayList . add ( 2 ) ;
  for ( int i = 3 ;
  i < 1000 ;
  i ++ ) {
    int t = 0 ;
    for ( int j = 2 ;
    j < i ;
    j ++ ) {
      if ( i % j == 0 ) {
        t = 1 ;
        continue ;
      }
    }
    if ( t == 0 ) {
      theArrayList . add ( i ) ;
    }
  }
  int n ;
  do {
    try {
      n = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    catch ( Exception e ) {
      break ;
    }
  }
  while ( n > 0 ) ;
  HashMap < Integer , Integer > theDic = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < theArrayList . size ( ) ;
  i ++ ) {
    theDic . put ( i , 0 ) ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    int t = i ;
    int j = 0 ;
    while ( j != theArrayList . size ( ) ) {
      if ( t % theArrayList . get ( j ) == 0 ) {
        theDic . put ( theArrayList . get ( j ) , 1 ) ;
        t = t / theArrayList . get ( j ) ;
        continue ;
      }
      j = j + 1 ;
      if ( t == 1 ) {
        break ;
      }
    }
  }
  while ( t == 1 ) ;
  int value = 1 ;
  for ( int i = 0 ;
  i < theDic . size ( ) ;
  i ++ ) {
    value = value % ( 1000000000 + 7 ) * ( theDic . get ( i ) + 1 ) ;
  }
  System . out . println ( value % ( 1000000000 + 7 ) ) ;
}
