public static int input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    a . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  double [ ] [ ] s = new double [ n + 1 ] [ n + 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    s [ i ] [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    s [ i ] [ 0 ] = 0 ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    s [ a [ i ] [ 0 ] ] [ a [ i ] [ 1 ] ] = a [ i ] [ 2 ] ;
    s [ a [ i ] [ 1 ] ] [ a [ i ] [ 0 ] ] = a [ i ] [ 2 ] ;
  }
  for ( int h = 1 ;
  h <= n ;
  h ++ ) {
    for ( int i = 1 ;
    i <= n ;
    i ++ ) {
      for ( int j = 1 ;
      j <= n ;
      j ++ ) {
        if ( s [ i ] [ j ] > s [ i ] [ h ] + s [ h ] [ j ] ) {
          s [ i ] [ j ] = s [ i ] [ h ] + s [ h ] [ j ] ;
        }
      }
    }
  }
  int c = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    for ( int j = 1 ;
    j <= n ;
    j ++ ) {
      if ( s [ j ] [ a [ i ] [ 0 ] ] != Double . NaN ) {
        if ( s [ j ] [ a [ i ] [ 0 ] ] + a [ i ] [ 2 ] == s [ j ] [ a [ i ] [ 1 ] ] ) {
          break ;
        }
      }
    }
    else {
      c ++ ;
    }
  }
  System . out . println ( c ) ;
  return c ;
}
