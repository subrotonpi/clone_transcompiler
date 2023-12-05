public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  List < List < Integer >> data = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    data . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  List < List < Integer >> tree = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    tree . add ( new ArrayList < > ( ) ) ;
  }
  for ( int a = 0 ;
  a < data . size ( ) ;
  a ++ ) {
    int b = data . get ( a ) . get ( 0 ) ;
    tree . get ( a - 1 ) . get ( 1 ) . add ( b - 1 ) ;
    tree . get ( b - 1 ) . get ( 1 ) . add ( a - 1 ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    List < Integer > ans = new ArrayList < > ( ) ;
    for ( int j = 0 ;
    j < tree . get ( i ) . get ( 1 ) ;
    j ++ ) {
      for ( int k = 0 ;
      k < tree . get ( j ) . get ( 1 ) ;
      k ++ ) {
        if ( k != i && ! ans . contains ( tree . get ( j ) . get ( 0 ) ) && ! tree . get ( i ) . get ( 1 ) . contains ( tree . get ( j ) . get ( 1 ) ) ) {
          ans . add ( tree . get ( i ) . get ( 0 ) ) ;
        }
      }
    }
    System . out . println ( ans . size ( ) ) ;
  }
}
