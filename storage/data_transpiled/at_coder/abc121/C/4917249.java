public static void main ( String input ) {
  int n = Integer . parseInt ( input ) , m = Integer . parseInt ( input ) ;
  int [ ] [ ] ab = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ab [ i ] [ 0 ] = Integer . parseInt ( input ) ;
  }
  Arrays . sort ( ab ) ;
  int ans = 0 ;
  Iterator < Integer > a = ab [ 0 ] ;
  while ( a . hasNext ( ) ) {
    a . next ( ) ;
    if ( m == 0 ) break ;
    for ( ;
    ;
    ) {
      if ( m == 0 ) break ;
      m -- ;
      ans += a . nextInt ( ) ;
    }
  }
  System . out . println ( ans ) ;
}
