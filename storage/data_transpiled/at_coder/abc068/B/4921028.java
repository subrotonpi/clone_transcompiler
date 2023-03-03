public static void main ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] A = new int [ 7 ] ;
  for ( int i = 1 ;
  i <= 7 ;
  i ++ ) {
    A [ i ] = 2 * i ;
  }
  int ans = 1 ;
  for ( int a : A ) {
    if ( ( n < a ) ) {
      break ;
    }
    ans = a ;
  }
  System . out . println ( ans ) ;
}
