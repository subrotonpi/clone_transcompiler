public static int k = Integer . parseInt ( input ) {
  int n = 500 ;
  if ( k <= n ) {
    System . out . println ( k ) ;
    List < Integer > l = new LinkedList < Integer > ( ) ;
    l . add ( 1 ) ;
    for ( int i = 0 ;
    i < k ;
    i ++ ) {
      a = new ArrayList < Integer > ( ) ;
      for ( int j = 0 ;
      j < k ;
      j ++ ) {
        a . add ( Integer . toString ( j ) ) ;
      }
      System . out . println ( Arrays . toString ( a . toArray ( ) ) ) ;
    }
  }
  else {
    System . out . println ( n ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      a = new ArrayList < Integer > ( ) ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        a . add ( Integer . toString ( 1 + ( i + j ) % n + n * ( i % 2 == 0 ? 1 + ( i + j ) % n + n : k ) ) ) ;
      }
      System . out . println ( Arrays . toString ( a . toArray ( ) ) ) ;
    }
  }
  return n ;
}
