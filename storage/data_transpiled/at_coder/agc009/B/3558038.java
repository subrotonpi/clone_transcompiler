@ Sys public static int [ ] [ ] f ( ) {
  setRecursionLimit ( 100000 ) ;
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] x = new int [ n ] [ n ] , q = new int [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) - 1 ;
    x [ a ] [ i ] = i + 1 ;
  }
  return new int [ ] [ ] {
    q [ 0 ] }
    ;
  }
  