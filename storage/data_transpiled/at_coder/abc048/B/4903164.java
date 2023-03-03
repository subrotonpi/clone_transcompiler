public static int a ( ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int count = 0 ;
  if ( a % x == 0 ) {
    count ++ ;
  }
  if ( b >= a + ( x - a % x ) ) {
    int p = b - a - ( x - a % x ) ;
    count += p / x + 1 ;
  }
  return count ;
}
