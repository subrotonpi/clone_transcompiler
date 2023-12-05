public static int [ ] a ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ( ) ) - 1 ;
  }
  int button = 0 ;
  int push = 0 ;
  while ( a [ button ] != - 1 ) {
    push ++ ;
    int tmp = a [ button ] ;
    a [ button ] = - 1 ;
    if ( tmp == - 1 ) {
      push ++ ;
    }
    button ++ ;
  }
  return a ;
}
