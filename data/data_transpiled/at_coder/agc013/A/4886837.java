public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int prev = a [ 0 ] ;
  int state = 0 ;
  int ans = 1 ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    int cur = a [ i ] ;
    if ( state == 1 && prev > cur ) {
      ans ++ ;
      state = 0 ;
    }
    else if ( state == 2 && prev < cur ) {
      ans ++ ;
      state = 0 ;
    }
    else {
      if ( prev > cur ) {
        state = 2 ;
      }
      else if ( prev < cur ) {
        state = 1 ;
      }
    }
    prev = cur ;
  }
  System . out . println ( ans ) ;
}
