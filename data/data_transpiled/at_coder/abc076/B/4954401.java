public static void denko ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int k = Integer . parseInt ( input ( ) ) ;
  int denko = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( denko * 2 <= denko + k ) {
      denko = denko * 2 ;
    }
    else {
      denko += k ;
    }
  }
  System . out . println ( denko ) ;
}
