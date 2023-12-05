@ VisibleForTesting static void from ( LinkedHashMap < String , Integer > input ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] inputs = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    inputs [ i ] = input . get ( ) ;
  }
  Counter counter = new Counter ( inputs ) ;
  int answer = 0 ;
  for ( Entry < String , Integer > entry : counter . entrySet ( ) ) {
    if ( entry . getValue ( ) % 2 != 0 ) {
      answer ++ ;
    }
  }
  System . out . println ( answer ) ;
}
