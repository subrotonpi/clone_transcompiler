public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int q = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n + 1 ] ;
  for ( int p = 0 ;
  p < n ;
  p ++ ) {
    a [ p ] = 0 ;
  }
  List < List < Integer >> s = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    s . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  for ( int j = 0 ;
  j < q ;
  j ++ ) {
    for ( int k = s . get ( j ) . intValue ( ) ;
    k <= s . get ( j ) . intValue ( ) ;
    k ++ ) {
      a [ k ] = s . get ( j ) . intValue ( ) ;
    }
  }
  a [ 0 ] = 0 ;
  for ( int h = 0 ;
  h < n ;
  h ++ ) {
    System . out . println ( a [ h ] ) ;
  }
}
