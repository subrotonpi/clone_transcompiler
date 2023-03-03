public static int [ ] [ ] solve ( int N , int M ) {
  List < List < Integer >> L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int [ ] [ ] x = new int [ N ] [ M ] ;
  int [ ] x1 = new int [ N ] ;
  int a1 = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    x [ i ] = Integer . MIN_VALUE ;
  }
  Arrays . sort ( x ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    a1 += x1 [ i ] ;
  }
  int [ ] x2 = new int [ N ] ;
  int a2 = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    x [ i ] = L . get ( i ) . get ( 0 ) + L . get ( i ) . get ( 1 ) - L . get ( i ) . get ( 2 ) ;
  }
  Arrays . sort ( x2 ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    a2 += x2 [ i ] ;
  }
  int [ ] x3 = new int [ N ] ;
  int a3 = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    x [ i ] = L . get ( i ) . get ( 0 ) - L . get ( i ) . get ( 1 ) + L . get ( i ) . get ( 2 ) ;
  }
  Arrays . sort ( x3 ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    a3 += x3 [ i ] ;
  }
  int [ ] x4 = new int [ N ] ;
  int a4 = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    x [ i ] = L . get ( i ) . get ( 0 ) - L . get ( i ) . get ( 1 ) - L . get ( i ) . get ( 2 ) ;
  }
  Arrays . sort ( x4 ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    a4 += x4 [ i ] ;
  }
  int [ ] x5 = new int [ N ] ;
  int a5 = 0 ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    x5 [ i ] = - L . get ( i ) . get