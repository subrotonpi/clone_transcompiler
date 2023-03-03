public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int X = Integer . parseInt ( input ) ;
  int [ ] S = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S [ i ] = Integer . parseInt ( input ) ;
  }
  Arrays . sort ( S ) ;
  int ans = 0 ;
  int a = 0 , b = N - 1 ;
  while ( a <= b ) {
    if ( a < b && S [ a ] + S [ b ] <= X ) {
      a ++ ;
    }
    b -- ;
    ans ++ ;
  }
  System . out . println ( "Case #" + ( test + 1 ) + ": " + ans ) ;
}
