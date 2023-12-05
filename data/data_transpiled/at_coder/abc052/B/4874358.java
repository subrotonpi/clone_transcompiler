public static int n ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = input . nextLine ( ) ;
  int x = 0 ;
  int m = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    char ch = s . charAt ( i ) ;
    if ( ch == 'I' ) {
      x ++ ;
      if ( m < x ) m = x ;
    }
    else {
      x -- ;
      if ( m < x ) m = x ;
    }
  }
  return m ;
}
