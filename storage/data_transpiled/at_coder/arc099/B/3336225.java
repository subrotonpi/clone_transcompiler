@ Function public static void f ( ) {
  f ( x -> Integer . parseInt ( String . valueOf ( x ) ) ) ;
  long a = 1 , b = 1 ;
  for ( int i = 0 ;
  i < Integer . parseInt ( input . nextLine ( ) ) ;
  i ++ ) {
    System . out . println ( a ++ ) ;
    b = a ;
    for ( int j = 0 ;
    a <= Integer . MAX_VALUE ;
    j ++ ) {
      long t = a % 10 * j ;
      t = a - t + 10 * j - 1 ;
      if ( b * f ( t ) > t * f ( b ) ) {
        b = t ;
      }
    }
    a = b ;
  }
}
