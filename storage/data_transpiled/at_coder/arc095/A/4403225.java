public static void print ( int N ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  Arrays . sort ( a ) ;
  Arrays . sort ( a ) ;
  int a1 = a [ ( N - 1 ) / 2 ] ;
  int a2 = a [ ( N - 1 ) / 2 + 1 ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    if ( ( a [ i ] <= a1 ) && ( a [ i ] <= a2 ) ) {
      print ( a2 ) ;
    }
    else {
      print ( a1 ) ;
    }
  }
}
