public static int [ ] [ ] getPoints ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] f = new int [ n ] [ n ] ;
  int [ ] [ ] p = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) f [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) p [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = - 10 * 9 ;
  for ( int i = 1 ;
  i <= 2 * 10 ;
  i ++ ) {
    int a = 0 ;
    int [ ] m = {
      i % 2 , i / 2 % 2 , i / 4 % 2 , i / 8 % 2 , i / 16 % 2 , i / 32 % 2 , i / 64 % 2 , i / 128 % 2 , i / 256 % 2 , i / 512 % 2 }
      ;
      int [ ] mm = new int [ n ] ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) mm [ i ] = 0 ;
      for ( int i = 0 ;
      i < 10 ;
      i ++ ) {
        for ( int j = 0 ;
        j < n ;
        j ++ ) {
          if ( m [ i ] == 1 && f [ j ] [ i ] == 1 ) mm [ j ] ++ ;
        }
      }
      for ( int i = 0 ;
      i < n ;
      i ++ ) a += p [ i ] [ mm [ i ] ] ;
      ans = Math . max ( ans , a ) ;
    }
    System . out . println ( ans ) ;
    return f ;
  }
  