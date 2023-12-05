public static void print ( int N ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  Arrays . sort ( a ) ;
  Arrays . sort ( a ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      ans += aSort [ i ] ;
    }
    else {
      ans -= aSort [ i ] ;
    }
  }
  System . out . println ( ans ) ;
}
