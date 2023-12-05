public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  String ans = "YES" ;
  int suma = Arrays . stream ( a ) . sum ( ) ;
  int i = suma / ( n * ( n + 1 ) / 2 ) ;
  int [ ] a2 = new int [ n ] ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    a2 [ j ] = a [ j ] - a [ j - 1 ] - i ;
  }
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    if ( j % n != 0 || j > 0 ) ans = "NO" ;
  }
  System . out . println ( ans ) ;
}
