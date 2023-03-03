public static void input ( Scanner s ) {
  int n = s . nextInt ( ) ;
  int [ ] [ ] a = new int [ n ] [ 2 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] [ 0 ] += a [ i - 1 ] [ 0 ] ;
    a [ i ] [ 1 ] += a [ i - 1 ] [ 1 ] ;
    if ( s . next ( ) == '+' ) {
      a [ i ] [ 0 ] ++ ;
    }
    if ( s . next ( ) == '-' ) {
      a [ i ] [ 1 ] ++ ;
    }
  }
  int [ ] b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    b [ i ] = ( a [ i ] - a [ i ] [ 0 ] ) ;
  }
  ArrayList < Integer > ans = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . next ( ) == 'M' ) {
      ans . add ( b [ i ] ) ;
    }
  }
  Collections . sort ( ans ) ;
  int [ ] ans1 = new int [ ans . size ( ) / 2 ] ;
  int [ ] ans2 = new int [ ans . size ( ) ] ;
  System . out . println ( Arrays . toString ( ans2 ) - Arrays . toString ( ans1 ) ) ;
}
