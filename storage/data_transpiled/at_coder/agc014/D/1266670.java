public static int N = Integer . parseInt ( input ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> lis = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    lis . add ( new ArrayList < > ( ) ) ;
  }
  for ( int aI = Integer . parseInt ( input . nextLine ( ) ) , bI = Integer . parseInt ( input . nextLine ( ) ) ;
  aI < N - 1 ;
  aI ++ , bI ++ ) {
    lis . get ( aI - 1 ) . add ( bI - 1 ) ;
    lis . get ( bI - 1 ) . add ( aI - 1 ) ;
  }
  while ( true ) {
    int sumsum = 0 ;
    for ( List < Integer > list : lis ) {
      sumsum += list . stream ( ) . mapToInt ( i -> i + 1 ) . sum ( ) ;
    }
    if ( sumsum == 0 ) {
      System . out . println ( "Second" ) ;
      quit ( ) ;
    }
    for ( int i = 0 ;
    i < lis . size ( ) ;
    i ++ ) {
      if ( lis . get ( i ) . size ( ) == 1 ) {
        int b = lis . get ( i ) . get ( 0 ) ;
        lis . get ( i ) . remove ( b ) ;
        lis . get ( b ) . remove ( i ) ;
        for ( int c = 0 ;
        c < lis . get ( b ) . size ( ) ;
        c ++ ) {
          lis . get ( c ) . remove ( b ) ;
          if ( lis . get ( c ) . size ( ) == 0 ) {
            System . out . println ( "First" ) ;
            quit ( ) ;
          }
        }
        lis . get ( b ) . clear ( ) ;
      }
    }
  }
}
