public static void input ( String a , String b ) {
  int [ ] nums = {
    0 , 1 , 2 , 3 , 4 , 4 , 5 , 6 , 7 , 8 }
    ;
    int [ ] nums1 = {
      0 , 1 , 2 , 3 , 3 , 4 , 5 , 6 , 7 , 7 }
      ;
      int ans = 0 ;
      for ( int i = 0 ;
      i < b . length ( ) ;
      i ++ ) {
        ans += nums [ Integer . parseInt ( b . substring ( i , i + 1 ) ) ] * ( 8 * ( b . length ( ) - i - 1 ) ) ;
        if ( b . substring ( i , i + 1 ) . equals ( "4" ) || b . substring ( i + 1 ) . equals ( "9" ) ) {
          ans -- ;
          break ;
        }
      }
      for ( int i = 0 ;
      i < a . length ( ) ;
      i ++ ) {
        ans -= nums [ Integer . parseInt ( a . substring ( i , i + 1 ) ) ] * ( 8 * ( a . length ( ) - i - 1 ) ) ;
        if ( a . substring ( i , i + 1 ) . equals ( "4" ) || a . substring ( i + 1 ) . equals ( "9" ) ) {
          break ;
        }
      }
      ans = Integer . parseInt ( b ) - Integer . parseInt ( a ) - ans ;
      System . out . println ( ans ) ;
    }
    