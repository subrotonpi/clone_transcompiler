public static void solve ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] h = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    h [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans_min = 0 ;
  int ans_max = 10 * 9 ;
  while ( ans_min + 1 < ans_max ) {
    int ans = ( ans_min + 1 ) / 2 ;
    int count = 0 ;
    for ( int i = 0 ;
    i < h . length ;
    i ++ ) {
      count += ( h [ i ] - B ) ;
    }
    if ( count > ans ) ans_min = ans ;
    else ans_max = ans ;
  }
  System . out . println ( ans_max ) ;
}
