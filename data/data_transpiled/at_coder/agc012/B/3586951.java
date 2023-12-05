private static void updateDP ( int n , int m ) {
  int [ ] [ ] graph = new int [ n + 1 ] [ m + 1 ] ;
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
  int [ ] [ ] dp = new int [ 11 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < dp . length ;
  i ++ ) {
    dp [ i ] = new int [ 11 ] ;
  }
  int [ ] col = new int [ n + 1 ] ;
  /* update dp to the end of the list */
  for ( int i = 0 ;
  i < dp [ 0 ] . length ;
  i ++ ) {
    if ( dp [ 0 ] [ i ] == - 1 ) {
      for ( int j = 0 ;
      j < d + 1 ;
      j ++ ) {
        if ( dp [ 0 ] [ j ] == - 1 ) {
          dp [ 0 ] [ j ] = j ;
        }
      }
      if ( j > 0 ) {
        for ( int u : graph [ 0 ] ) {
          updateDP ( u , t , j - 1 ) ;
        }
      }
    }
  }
  int t = 0 ;
  for ( int i = 0 ;
  i < qlist . size ( ) ;
  i ++ ) {
    int v = qlist . get ( i ) ;
    int d = qlist . get ( i ) ;
    int c = qlist . get ( i ) ;
    col [ i ] = c ;
    updateDP ( v , t , d ) ;
    t ++ ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    System . out . println ( col [ dp [ i ] [ 0 ] + 1 ] ) ;
  }
}
