public static String solve ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  List < List > F = new ArrayList < > ( N + 1 ) ;
  int [ ] D = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    D [ a ] ++ ;
    D [ b ] ++ ;
    F . get ( a ) . add ( b ) ;
    F . get ( b ) . add ( a ) ;
  }
  int [ ] E = new int [ 7 ] ;
  List < Integer > X = new LinkedList < > ( ) ;
  for ( int a = 1 , d = 1 ;
  a < D . length ;
  a ++ ) {
    int d = Integer . parseInt ( input . readLine ( ) ) ;
    if ( d % 2 == 0 ) {
      if ( d >= 6 ) {
        E [ 6 ] ++ ;
      }
      else if ( d == 4 ) {
        E [ 4 ] ++ ;
        X . add ( a ) ;
      }
      else {
        E [ d ] ++ ;
      }
    }
    else {
      return "No" ;
      E [ 1 ] ++ ;
    }
  }
  if ( E [ 6 ] > 0 || E [ 4 ] > 2 ) {
    return "Yes" ;
  }
  else if ( E [ 4 ] < 2 ) {
    return "No" ;
  }
  else {
    int x = X . get ( 0 ) ;
    int y = X . get ( 1 ) ;
    Set < Integer > q = new HashSet < > ( ) ;
    q . add ( new Integer ( y ) ) ;
    Set < Integer > R = new HashSet < > ( ) ;
    q . add ( new Integer ( x ) ) ;
    while ( q . size ( ) > 0 ) {
      int z = q . remove ( ) ;
      R . add ( z ) ;
      q . addAll ( F . get ( z ) . subtract ( R ) ) ;
    }
    if ( new HashSet < > ( F . get ( x ) ) . containsAll ( R ) == new HashSet < > ( F . get ( x ) ) ) {
      return "No" ;
    }
    else {
      return "Yes" ;
    }
  }
}
