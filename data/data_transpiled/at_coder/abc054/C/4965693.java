private static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  List < List < Integer >> L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( new ArrayList < > ( ) ) ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    L . get ( a - 1 ) . add ( b - 1 ) ;
    L . get ( b - 1 ) . add ( a - 1 ) ;
  }
  final int count = 0 ;
  for ( int [ ] p : L ) {
    if ( p [ 0 ] == 0 ) {
      boolean flag = true ;
      for ( int i = 0 ;
      i < N - 1 ;
      i ++ ) {
        if ( ! p [ i + 1 ] . equals ( L . get ( p [ i ] ) ) ) {
          flag = false ;
        }
      }
      if ( flag ) {
        count ++ ;
      }
    }
  }
  System . out . println ( count ) ;
}
