@ VisibleForTesting static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  long ans = 0 ;
  for ( List < Integer > p1 : a ) {
    for ( List < Integer > p2 : a ) {
      ans = Math . max ( ans , Math . abs ( p1 . get ( 0 ) - p2 . get ( 0 ) ) * Math . abs ( p1 . get ( 1 ) - p2 . get ( 1 ) ) ) ;
    }
  }
  System . out . println ( Math . sqrt ( ans ) ) ;
}
