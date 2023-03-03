public static int input ( ) {
  int a = Integer . parseInt ( input ( ) ) ;
  int all = 0 ;
  int fl = 0 ;
  int x = a ;
  for ( int i = 0 ;
  i < a ;
  i ++ ) {
    fl = 0 ;
    String b = input ( ) ;
    if ( ( a == 1 ) && ( b . charAt ( 0 ) == '.' ) ) {
      all = 1 ;
    }
    else if ( ( x == 0 ) && ( b . charAt ( 0 ) == '.' ) ) {
      x = a ;
    }
    else {
      for ( int j = 0 ;
      j < x ;
      j ++ ) {
        if ( ( b . charAt ( j ) == '.' ) ) {
          x = j ;
          all ++ ;
          fl = 1 ;
          break ;
        }
      }
      if ( ( fl == 0 ) && ( b . charAt ( 0 ) == '.' ) ) {
        x = a ;
      }
    }
  }
  System . out . println ( all ) ;
  return all ;
}
