public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] c = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    c [ i ] = Integer . parseInt ( input ) ;
  }
  int s = Arrays . stream ( c ) . sum ( ) ;
  if ( s % n == 0 ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Math . abs ( c [ i - j ] ) % 3 == 0 ? 1 : 0 ;
  }
  int m = 0 ;
  int head = 0 ;
  int c = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] == 1 ) {
      c ++ ;
    }
    else {
      m = Math . max ( m , c ) ;
      if ( i == c ) {
        head = c ;
      }
      c = 0 ;
    }
  }
  m = Math . max ( m , head + c ) ;
  System . out . println ( ( m + 3 ) / 2 ) ;
}
