static final String [ ] getStrings ( ) {
  final String [ ] vowels = {
    "a" , "e" , "i" , "o" , "u" }
    ;
    {
      int res = 0 ;
      int cnt = 0 ;
      for ( int i = 0 ;
      i < vowels . length ;
      i ++ ) {
        if ( vowels [ i ] . equals ( vowels [ i ] ) ) {
          if ( res <= 0 ) {
            cnt = 0 ;
          }
        }
        else {
          cnt ++ ;
        }
        if ( cnt >= n ) {
          res ++ ;
        }
      }
      return res ;
    }
    final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    for ( int ca : xrange ( 1 , T + 1 ) ) {
      Arrays . stream ( S ) . forEach ( v -> {
        int n = v . indexOf ( vowels [ i ] ) ;
        int i = Integer . parseInt ( vowels [ i ] ) ;
        int ls = S . length ( ) ;
        int ans = 0 ;
        for ( int j = 0 ;
        j < ls ;
        j ++ ) {
          ans += countCons ( v . substring ( i , j ) , n ) ;
        }
        System . out . println ( "Case #" + ca + ": " + ans ) ;
      }
      ) ;
    }
    return new String [ ] {
    }
    ;
  }
  