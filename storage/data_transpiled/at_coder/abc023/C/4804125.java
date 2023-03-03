@ VisibleForTesting static void from ( LinkedHashMap < String , Integer > input ) {
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> RC = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    RC . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int [ ] rows = new int [ r ] ;
  int [ ] colums = new int [ c ] ;
  for ( int i = 0 ;
  i < RC . size ( ) ;
  i ++ ) {
    rows [ i ] = 0 ;
    colums [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < rows . length ;
  i ++ ) {
    rows [ i ] += RC . get ( i ) . get ( i ) * C . get ( k - i ) ;
  }
  for ( int i = 0 ;
  i < RC . size ( ) ;
  i ++ ) {
    if ( rows [ i - 1 ] + colums [ j - 1 ] == k ) {
      res -- ;
    }
    if ( rows [ i - 1 ] + colums [ j - 1 ] == k + 1 ) {
      res ++ ;
    }
  }
  System . out . println ( res ) ;
}
