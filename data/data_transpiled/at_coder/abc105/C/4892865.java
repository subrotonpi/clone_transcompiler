public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  StringBuffer ans = new StringBuffer ( ) ;
  while ( N > 0 ) {
    if ( N % 2 != 0 ) {
      N -- ;
      ans . append ( '1' ) ;
    }
    else {
      ans . append ( '0' ) ;
    }
    N /= - 2 ;
  }
  if ( ans . length ( ) > 0 ) {
    print ( ans . substring ( 0 , ans . length ( ) - 1 ) ) ;
  }
  else {
    print ( 0 ) ;
  }
}
