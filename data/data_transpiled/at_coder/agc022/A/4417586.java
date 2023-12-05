static final String getString ( ) {
  final char [ ] A = new char [ 26 ] ;
  final String S = input ( ) ;
  if ( S . equals ( A [ 0 ] ) ) {
    System . out . println ( - 1 ) ;
  }
  else if ( S . length ( ) == 26 ) {
    int i = - 1 ;
    while ( S . charAt ( i - 1 ) > S . charAt ( i ) ) i -- ;
    for ( int j = - 1 ;
    j >= i ;
    j -- ) {
      if ( S . charAt ( j ) > S . charAt ( i - 1 ) ) {
        char c = S . charAt ( j ) ;
        break ;
      }
    }
    System . out . println ( S . substring ( 0 , i - 1 ) + c ) ;
  }
  else {
    char c = new TreeSet < > ( new StringComparator ( ) ) . first ( ) . toString ( ) ;
    System . out . println ( S + c ) ;
  }
  return S ;
}
