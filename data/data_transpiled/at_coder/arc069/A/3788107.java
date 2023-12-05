public static int getInt ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) , b = Integer . parseInt ( input . nextLine ( ) ) ;
  int count = 0 ;
  if ( a <= b / 2 ) {
    count += a ;
    b -= a * 2 ;
    count += b / 4 ;
  }
  else {
    count += b / 2 ;
    b -= ( b / 2 ) * 2 ;
    count += b / 4 ;
  }
  return count ;
}
