public static int getInt ( ) {
  n = input . nextInt ( ) ;
  int ans = 9 * ( n . length ( ) - 1 ) ;
  if ( n . length ( ) > 1 && n . charAt ( 1 ) == '9' * ( n . length ( ) - 1 ) ) {
    System . out . println ( ans + Integer . parseInt ( n . substring ( 0 , 1 ) ) ) ;
  }
  else {
    System . out . println ( ans + Integer . parseInt ( n . substring ( 0 , 1 ) ) - 1 ) ;
  }
  return ans ;
}
