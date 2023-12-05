public static String print ( ) {
  StringBuilder ans = new StringBuilder ( ) ;
  while ( ( N = input . nextInt ( ) ) != 0 ) {
    if ( ( N == 1 ) && ( N == 0 ) ) {
      ans . append ( '1' ) ;
      break ;
    }
    else if ( ( N % ( - 2 ) == - 1 ) ) {
      ans . append ( '1' ) ;
      N = N / ( - 2 ) + 1 ;
    }
    else {
      ans . append ( '0' ) ;
      N = N / ( - 2 ) ;
    }
  }
  ans . reverse ( ) ;
  String anStr = ans . toString ( ) ;
  System . out . println ( anStr ) ;
  return anStr ;
}
