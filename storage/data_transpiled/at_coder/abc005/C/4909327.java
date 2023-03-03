public static void print ( int t ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > aList = new ArrayList < Integer > ( ) ;
  Collections . sort ( aList ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > bList = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    bList . add ( i ) ;
  }
  if ( n < m ) {
    System . out . println ( "no" ) ;
  }
  else {
    int count = 0 ;
    for ( int b : bList ) {
      for ( int a = 0 ;
      a < aList . size ( ) ;
      a ++ ) {
        if ( b - aList . get ( a ) <= t && b - aList . get ( a ) >= 0 ) {
          count ++ ;
          aList . remove ( a ) ;
          break ;
        }
      }
    }
    if ( count == bList . size ( ) ) {
      System . out . println ( "yes" ) ;
    }
    else {
      System . out . println ( "no" ) ;
    }
  }
}
