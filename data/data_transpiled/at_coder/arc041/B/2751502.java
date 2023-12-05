public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  List < List < Integer >> B = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    B . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  List < List < Integer >> A = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( new ArrayList < > ( ) ) ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    A . add ( new ArrayList < > ( ) ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 1 ;
    j < M - 1 ;
    j ++ ) {
      int x = Math . min ( B . get ( i + 1 ) . get ( j ) , B . get ( i - 1 ) . get ( j ) , B . get ( i ) . get ( j + 1 ) , B . get ( i ) . get ( j - 1 ) ) ;
      A . get ( i ) . set ( j , x ) ;
      B . get ( i + 1 ) . set ( j , x ) ;
      B . get ( i - 1 ) . set ( j , x ) ;
      B . get ( i ) . set ( j + 1 , x ) ;
      B . get ( i ) . set ( j - 1 , x ) ;
    }
  }
  for ( List < Integer > a : A ) {
    System . out . println ( Arrays . toString ( a ) ) ;
  }
}
