public static int N ( Scanner input , int M ) {
  List < List < Integer >> L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    L . add ( Collections . singletonList ( input . nextLine ( ) ) ) ;
  }
  int [ ] ball = new int [ N ] ;
  boolean [ ] aka = new boolean [ N ] ;
  aka [ 0 ] = true ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    if ( aka [ L . get ( i ) . get ( 0 ) - 1 ] == true ) {
      aka [ L . get ( i ) . get ( 1 ) - 1 ] = true ;
    }
    ball [ L . get ( i ) . get ( 0 ) - 1 ] -- ;
    if ( ball [ L . get ( i ) . get ( 0 ) - 1 ] == 0 ) {
      aka [ L . get ( i ) . get ( 0 ) - 1 ] = false ;
    }
    ball [ L . get ( i ) . get ( 1 ) - 1 ] ++ ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( aka [ i ] == true ) ans ++ ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
