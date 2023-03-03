public static String input ( ) {
  int N = input . nextInt ( ) ;
  int numN = Integer . parseInt ( N ) ;
  boolean flag = false ;
  if ( ( "3" . equals ( N ) ) ) {
    flag = true ;
  }
  if ( ( numN % 3 ) == 0 ) {
    flag = true ;
  }
  if ( ( flag ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return "" ;
}
