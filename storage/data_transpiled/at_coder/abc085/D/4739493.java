public static void print ( int n , int h ) {
  int [ ] an = new int [ n ] ;
  int [ ] bn = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    an [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    bn [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( an , Collections . reverseOrder ( ) ) ;
  Arrays . sort ( bn , Collections . reverseOrder ( ) ) ;
  int ans = 0 ;
  for ( int b : bn ) {
    if ( b > an [ b ] && h > 0 ) {
      h -= b ;
      ans ++ ;
    }
  }
  ans += h <= 0 ? 0 : h / an [ b ] + ( h % an [ b ] > 0 ? 1 : 0 ) ;
  System . out . println ( ans ) ;
}
