@ VisibleForTesting static void updateDP ( int n , int m ) {
  int [ ] [ ] graph = new int [ m ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    graph [ a ] [ b ] = b ;
    graph [ b ] [ a ] = a ;
  }
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > qlist = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    qlist . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  Collections . reverse ( qlist ) ;
  int [ ] [ ] dp = new int [ n + 1 ] [ 11 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    dp [ i ] = new int [ 11 ] ;
    for ( int j = 0 ;
    j < dp [ i ] . length ;
    j ++ ) {
      dp [ i ] [ j ] = - 1 ;
    }
  }
  int [ ] col = new int [ n + 1 ] ;
  /* update dp to the end of the list */
  for ( int i = 0 ;
  i < dp . length ;
  i ++ ) {
    int v = qlist . get ( i ) ;
    int d = graph [ i ] [ j ] ;
    int c = 0 ;
    col [ i ] = c ;
    updatedp ( v , t , d ) ;
    t ++ ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    System . out . println ( col [ dp [ i ] [ 0 ] + 1 ] ) ;
  }
}
