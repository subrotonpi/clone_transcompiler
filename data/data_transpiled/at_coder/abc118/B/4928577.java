private static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int ans = 0 ;
  for ( int x = 0 ;
  x < m ;
  x ++ ) {
    int count = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( a . get ( i ) . contains ( x + 1 ) ) {
        count ++ ;
      }
    }
    if ( count == n ) {
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
