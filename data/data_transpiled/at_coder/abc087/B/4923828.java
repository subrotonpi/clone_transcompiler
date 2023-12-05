static final int getA ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  int a = Math . floor ( X / 500 ) ;
  for ( int i = 0 ;
  i < Math . min ( A , a ) + 1 ;
  i ++ ) {
    int X2 = X - 500 * i ;
    int b = Math . floor ( X2 / 100 ) ;
    for ( int j = 0 ;
    j < Math . min ( B , b ) + 1 ;
    j ++ ) {
      int X3 = X2 - 100 * j ;
      if ( X3 % 50 == 0 ) {
        int c = X3 / 50 ;
        if ( c <= C ) {
          ans ++ ;
        }
        else {
          continue ;
        }
      }
      else {
        continue ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
