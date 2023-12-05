public static int N = Integer . parseInt ( input ) {
  String S = input . next ( ) ;
  int a = 0 ;
  int b = 0 ;
  int sub = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( S . charAt ( i ) == '(' ) {
      a ++ ;
    }
    else {
      b ++ ;
    }
    if ( a - b <= sub ) {
      sub = a - b ;
    }
  }
  S = '(' ) ' ; return S ; }