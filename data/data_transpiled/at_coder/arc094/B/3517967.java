static final int n = Integer . parseInt ( input ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int ans = 0 ;
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = a * b ;
    int d = ( int ) Math . sqrt ( c ) ;
    if ( d * d == c ) {
      d -- ;
    }
    ans += d * 2 ;
    if ( d >= a ) {
      ans -- ;
    }
    if ( d >= b ) {
      ans -- ;
    }
    if ( ( d * ( d + 1 ) ) >= c ) {
      ans -- ;
    }
    System . out . println ( ans ) ;
  }
  return n ;
}
