@ Function public static void main ( List < Integer > input ) {
  int n = Integer . parseInt ( input . get ( ) ) ;
  int ng1 = Integer . parseInt ( input . get ( ) ) ;
  int ng2 = Integer . parseInt ( input . get ( ) ) ;
  int ng3 = Integer . parseInt ( input . get ( ) ) ;
  int [ ] dp = new int [ ] {
    1000 }
    ;
    dp [ n ] = 0 ;
    for ( int i = n ;
    i > 0 ;
    i -- ) {
      if ( i == ng1 || i == ng2 || i == ng3 ) {
        if ( i == n ) {
          System . out . println ( "NO" ) ;
          exit ( ) ;
        }
        continue ;
      }
      for ( int j = 1 ;
      j <= 4 ;
      j ++ ) {
        dp [ i - j ] = Math . min ( dp [ i ] + 1 , dp [ i - j ] ) ;
      }
    }
    if ( dp [ 0 ] <= 100 ) {
      System . out . println ( "YES" ) ;
    }
    else {
      System . out . println ( "NO" ) ;
    }
  }
  