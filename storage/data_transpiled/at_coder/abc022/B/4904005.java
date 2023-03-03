@ VisibleForTesting static void from ( LinkedHashMap < String , Integer > map ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  map . clear ( ) ;
  int ans = 0 ;
  for ( Map . Entry < String , Integer > entry : map . entrySet ( ) ) {
    if ( entry . getValue ( ) >= 2 ) {
      ans += entry . getValue ( ) - 1 ;
    }
  }
  System . out . println ( ans ) ;
}
