public static void main ( int test , int N ) {
  int N = input . nextInt ( ) ;
  int [ ] A = map . get ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int l = 0 ;
    int r = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( A [ j ] > A [ i ] ) {
        if ( j < i ) {
          l ++ ;
        }
        else {
          r ++ ;
        }
      }
    }
    ans += Math . min ( l , r ) ;
  }
  System . out . println ( "Case #" + ( test + 1 ) + ": " + ans ) ;
}
