public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int temp = Integer . parseInt ( input ) ;
    a [ i ] = temp ;
  }
  if ( a [ 0 ] != 0 ) {
    System . out . println ( "-1" ) ;
  }
  else {
    boolean check = true ;
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      if ( a [ i + 1 ] >= a [ i ] + 2 ) {
        System . out . println ( "-1" ) ;
        check = false ;
        break ;
      }
    }
    if ( check ) {
      int ans = Integer . MAX_VALUE ;
      for ( int i = 0 ;
      i < n - 1 ;
      i ++ ) {
        if ( a [ i + 1 ] == a [ i ] + 1 ) {
          ans -= a [ i ] ;
        }
      }
      System . out . println ( ans ) ;
    }
  }
}
