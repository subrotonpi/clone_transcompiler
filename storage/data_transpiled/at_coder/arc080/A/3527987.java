public static final int [ ] getA ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int n4 = 0 ;
  int n2 = 0 ;
  int n1 = 0 ;
  for ( int a : A ) {
    if ( a % 4 == 0 ) {
      n4 ++ ;
    }
    else if ( a % 2 == 0 ) {
      n2 ++ ;
    }
    else {
      n1 ++ ;
    }
  }
  int type = 4 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    switch ( type ) {
      case 4 : break ;
    }
  }
  return A ;
}
