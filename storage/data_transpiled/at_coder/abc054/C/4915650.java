public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    L . get ( a - 1 ) . add ( b - 1 ) ;
    L . get ( b - 1 ) . add ( a - 1 ) ;
  }
  final int [ ] s = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    s [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int count = 0 ;
  for ( int [ ] p : s ) {
    if ( p [ 0 ] == 0 ) {
      boolean flag = true ;
      for ( int i = 0 ;
      i < N - 1 ;
      i ++ ) {
        if ( ! L . get ( p [ i + 1 ] ) . contains ( p [ i ] ) ) {
          flag = false ;
        }
      }
      if ( flag ) {
        count ++ ;
      }
    }
  }
  System . out . println ( count ) ;
  return count ;
}
