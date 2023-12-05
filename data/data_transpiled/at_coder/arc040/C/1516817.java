public static void field ( List < List < String >> field ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    field . add ( new LinkedList < String > ( ) ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( field . get ( i ) . contains ( "." ) ) {
      int j = n - field . get ( i ) . subList ( 0 , field . get ( i ) . size ( ) - 1 ) . size ( ) ;
      field . set ( i , new ArrayList < String > ( ) ) ;
      if ( i != n - 1 ) {
        field . set ( i + 1 , j , new ArrayList < String > ( ) ) ;
      }
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
