@ InputFunction public static void input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> A = new ArrayList < > ( ) ;
  int [ ] S = new int [ N + 2 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    List < Integer > L = new LinkedList < > ( ) ;
    L . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    A . add ( L ) ;
    S [ L . get ( 0 ) ] ++ ;
    S [ L . get ( 1 ) + 1 ] -- ;
  }
  for ( int i = 1 ;
  i < S . length ;
  i ++ ) S [ i ] += S [ i - 1 ] ;
  int [ ] T = new int [ N + 2 ] ;
  for ( int i = 1 ;
  i < T . length ;
  i ++ ) T [ i ] = T [ i - 1 ] + ( S [ i ] <= 1 ? 1 : 0 ) ;
  int cnt = 0 ;
  List < Integer > ANS = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    if ( T [ A . get ( i ) . get ( 0 ) - 1 ] == T [ A . get ( i ) . get ( 1 ) ] ) {
      ANS . add ( i + 1 ) ;
      cnt ++ ;
    }
  }
  System . out . println ( cnt ) ;
  for ( int i = 0 ;
  i < cnt ;
  i ++ ) System . out . println ( ANS [ i ] ) ;
}
