public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] p = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    p [ i ] = Integer . parseInt ( input ) ;
  }
  Map < Integer , Integer > map = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < p . length ;
  i ++ ) {
    map . put ( pi , i ) ;
  }
  int idx = - 1 ;
  int count = 0 ;
  int ma = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    if ( map . get ( i ) > idx ) {
      count ++ ;
      idx = map . get ( i ) ;
    }
    else {
      ma = i ;
    }
  }
  ma = - 1 ;
}
