public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int MOD = 10 * 9 + 7 ;
  if ( a [ 0 ] != 0 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  Arrays . sort ( a ) ;
  long ans = 1 ;
  long c = 0 ;
  long p = 1 ;
  long x = 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] == x ) {
      c ++ ;
      continue ;
    }
    else if ( a [ i ] == x + 1 ) {
      ans = ( ans * Math . pow ( ( Math . pow ( 2 , p , MOD ) - 1 ) , c , MOD ) * Math . pow ( 2 , c * ( c - 1 ) / 2 , MOD ) ) % MOD ;
      p = c ;
      c = 1 ;
      x ++ ;
    }
    else {
      ans = 0 ;
      break ;
    }
  }
  System . out . println ( ans % MOD ) ;
}
