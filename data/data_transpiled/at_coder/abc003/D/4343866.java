@ Function public static int factorial ( ) {
  int div = ( int ) ( 1e9 + 7 ) ;
  @ SuppressWarnings ( "unused" ) int i = ( int ) ( i - 1 ) ;
  @ Function ( "i" ) int i = ( int ) ( i - 1 ) ;
  @ Function ( "j" ) int j = ( int ) ( j - 1 ) ;
  Function < Integer , Integer > numdl = ( n , d , l ) -> {
    int num ;
    if ( n * y == d + l ) {
      num = iCj ( n , d ) * iCj ( n - d , l ) ;
    }
    else {
      num = numdl . apply ( n * y , d , l ) ;
      num -= numdl . apply ( n * ( y - 1 ) , d , l ) * 2 ;
      num -= numdl . apply ( ( x - 1 ) * y , d , l ) * 2 ;
      num += numdl . apply ( ( x - 2 ) * y , d , l ) * 2 ;
      num += numdl . apply ( ( x - 1 ) * ( y - 1 ) , d , l ) * 4 ;
      num -= numdl . apply ( ( x - 2 ) * ( y - 1 ) , d , l ) * 2 ;
      num -= numdl . apply ( ( x - 1 ) * ( y - 2 ) , d , l ) * 2 ;
      num += numdl . apply ( ( x - 2 ) * ( y - 2 ) , d , l ) ;
    }
  }
  ;
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  int l = Integer . parseInt ( input . nextLine ( ) ) ;
  int area = ( r - x + 1 ) * ( c - y + 1 ) ;
  System . out . println ( ( ( x + y + 1 ) * area ) % div ) ;
  return div ;
}
