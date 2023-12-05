public static void print ( int d ) {
  int j = Integer . parseInt ( input . nextLine ( ) ) ;
  int g = 0 ;
  Iterator < Integer > a = d . iterator ( ) ;
  Iterator < Integer > b = j . iterator ( ) ;
  while ( a . hasNext ( ) ) g += Math . max ( a . next ( ) , b . hasNext ( ) ) ;
  System . out . println ( g ) ;
}
