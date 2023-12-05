public static void d ( ) {
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int count = 0 ;
  if ( s <= w && w <= t ) {
    count ++ ;
  }
  for ( ;
  ;
  ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    w += a ;
    if ( s <= w && w <= t ) {
      count ++ ;
    }
  }
  System . out . println ( count ) ;
}
