public static void input ( Scanner scanner ) {
  char c = scanner . next ( ) ;
  int n = scanner . nextInt ( ) ;
  int idx = 1 ;
  while ( idx < n && scanner . next ( ) == '0' ) {
    idx ++ ;
  }
  int a ;
  if ( scanner . next ( ) != '0' ) {
    a = Integer . parseInt ( scanner . next ( ) . substring ( 0 , idx ) ) ;
  }
  else {
    a = Integer . parseInt ( "1" + scanner . next ( ) . substring ( 0 , idx ) ) ;
  }
  scanner . next ( ) ;
  int d = - 1 ;
  if ( scanner . next ( ) == '' ) {
    d = 1 ;
  }
  else {
    String nc = scanner . next ( ) ;
    do {
      boolean ok = false ;
      for ( int i = 0 ;
      i < 10 ;
      i ++ ) {
        String tmp = nc + i ;
        int diff = Integer . parseInt ( tmp ) - a ;
        if ( diff >= 1 ) {
          ok = true ;
          d = diff ;
          break ;
        }
      }
      if ( ok ) {
        break ;
      }
      else {
        nc = nc + '0' ;
      }
    }
    while ( true ) ;
  }
  n = scanner . nextInt ( ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    boolean ok = true ;
    int e = scanner . nextInt ( ) - a ;
    if ( e <= 0 ) {
      continue ;
    }
    int cur = a + e ;
    int j = i ;
    while ( j < n ) {
      cur += e ;
      String tar = Integer . toString ( cur ) ;
      for ( int k = 0 ;
      k < tar . length ( ) ;
      k ++ ) {
        if ( j == n ) {
          break ;
        }
        if ( tar . charAt ( k ) != scanner . next ( ) ) {
          ok = false ;
        }
        j ++ ;
      }
    }
    if ( ok ) {
      d = Math . min ( d , e ) ;
    }
  }
  System . out . println ( a + " " + d ) ;
}
