static final int [ ] getCounts ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Map < Integer , Integer > ad = new LinkedHashMap < Integer , Integer > ( a ) ;
  int counter = 0 ;
  for ( Integer i : ad . values ( ) ) {
    if ( i % 2 == 1 ) {
      counter ++ ;
    }
  }
  System . out . println ( counter ) ;
  return a ;
}
