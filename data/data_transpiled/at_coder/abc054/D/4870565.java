public static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . readLine ( ) ) ;
  int B = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] L = new int [ N ] [ 401 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    int c = Integer . parseInt ( input . readLine ( ) ) ;
    L [ i ] [ b ] = c ;
  }
  int [ ] [ ] dp = new int [ 401 ] [ 401 ] ;
  for ( int i = 0 ;
  i < 401 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 401 ;
    j ++ ) {
      dp [ i ] [ j ] = 100000 ;
    }
    dp [ 0 ] [ 0 ] = 0 ;
    for ( int n = 0 ;
    n < N ;
    n ++ ) {
      for ( int i = 0 ;
      i < 401 ;
      i ++ ) {
        for ( int j = 0 ;
        j < 401 ;
        j ++ ) {
          if ( dp [ 400 - i ] [ 400 - j ] < 100000 ) {
            if ( 400 - i + L [ n ] [ 0 ] <= 400 && 400 - j + L [ n ] [ 1 ] <= 400 ) {
              if ( dp [ 400 - i + L [ n ] [ 0 ] ] [ 400 - j + L [ n ] [ 1 ] ] > dp [ 400 - i ] [ 400 - j ] + L [ n ] [ 2 ] ) {
                dp [ 400 - i + L [ n ] [ 0 ] ] [ 400 - j + L [ n ] [ 1 ] ] = dp [ 400 - i ] [ 400 - j ] + L [ n ] [ 2 ] ;
              }
            }
          }
        }
      }
    }
  }
  int ans = 100000 ;
  for ( int i = 1 ;
  i < 401 ;
  i ++ ) {
    for ( int j = 1 ;
    j < 401 ;
    j ++ ) {
      if ( i * B == j * A && ans > dp [ i ] [ j ] ) {
        ans = dp [ i ] [ j ] ;
      }
    }
  }
  if ( ans < 100000 ) {
    System . out . println ( ans ) ;
  }
  else {
    System . out . println ( - 1 ) ;
  }
  return ans ;
}
