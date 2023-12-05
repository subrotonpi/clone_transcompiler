private static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  List < List < Integer >> l = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l . add ( new ArrayList < > ( ) ) ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    l . get ( a - 1 ) . add ( b - 1 ) ;
    l . get ( b - 1 ) . add ( a - 1 ) ;
  }
  final int ans = 0 ;
  for ( int [ ] p : l ) {
    if ( p [ 0 ] == 0 ) {
      boolean flag = true ;
      for ( int i = 0 ;
      i < n - 1 ;
      i ++ ) {
        if ( ! p [ i + 1 ] . equals ( l . get ( p [ i ] ) ) ) {
          flag = false ;
        }
      }
      if ( flag ) {
        ans ++ ;
      }
    }
  }
  System . out . println ( ans ) ;
}
