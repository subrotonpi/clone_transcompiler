public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < List < Integer >> L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  List < List < Integer >> M = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    M . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  Collections . sort ( L ) ;
  Collections . reverse ( L ) ;
  Collections . sort ( M ) ;
  boolean [ ] LT = new boolean [ N ] ;
  boolean [ ] MT = new boolean [ N ] ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int curx = M . get ( i ) . x ;
    int cury = M . get ( i ) . y ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( LT [ j ] == true ) {
        if ( MT [ i ] == true ) {
          if ( curx >= L . get ( j ) . x && cury >= L . get ( j ) . y ) {
            LT [ j ] = false ;
            ans ++ ;
            MT [ i ] = false ;
          }
        }
      }
    }
  }
  System . out . println ( ans ) ;
}
