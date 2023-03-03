public static int [ ] getDistance ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , m = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( m < 2 * n || 4 * n < m ) {
    System . out . println ( - 1 , - 1 , - 1 ) ;
  }
  else {
    int f = m - 2 * n ;
    int baby = f / 2 ;
    int old = f % 2 ;
    int adult = n - baby - old ;
    System . out . println ( adult + " " + old + " " + baby ) ;
  }
  return new int [ ] {
    n , m }
    ;
  }
  