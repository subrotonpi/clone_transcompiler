public static int [ ] getSummarizer ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) , k = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( k == 0 ) {
    System . out . println ( 2 * ( 10 * 12 ) - a ) ;
  }
  else {
    int ans = a ;
    int cnt = 0 ;
    while ( ans < 2 * ( 10 * 12 ) ) {
      cnt ++ ;
      ans += ans * k + 1 ;
    }
    System . out . println ( cnt ) ;
  }
  return new int [ ] {
    a , k }
    ;
  }
  