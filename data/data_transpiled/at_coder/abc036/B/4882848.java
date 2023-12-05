static final int [ ] [ ] getRotationMatrix ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < List < Integer >> x = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    x . add ( Collections . singletonList ( input . nextLine ( ) ) ) ;
  }
  final Matrix xn = new Matrix ( x ) ;
  final int [ ] [ ] array = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      array [ i ] [ j ] = x . get ( j ) . get ( i ) ;
    }
  }
  final int [ ] [ ] result = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    result [ i ] = xn . transpose ( ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . arraycopy ( array , 0 , result , N , N ) ;
  }
  return result ;
}
