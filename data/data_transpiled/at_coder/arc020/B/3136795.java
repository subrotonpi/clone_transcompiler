public static void main ( String input ) {
  int n = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int c = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  }
  int ans = 10 * 9 ;
  for ( int i = 1 ;
  i < 11 ;
  i ++ ) {
    for ( int j = 1 ;
    j < 11 ;
    j ++ ) {
      if ( i == j ) {
        continue ;
      }
      int temp = 0 ;
      for ( int k = 0 ;
      k < n ;
      k ++ ) {
        if ( k % 2 == 0 ) {
          if ( i != a [ k ] ) {
            temp += c ;
          }
        }
        else {
          if ( j != a [ k ] ) {
            temp += c ;
          }
        }
      }
      ans = Math . min ( ans , temp ) ;
    }
  }
  System . out . println ( ans ) ;
}
