public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int [ ] cumsum = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i == 0 ) {
      cumsum [ i ] = a [ i ] % m ;
    }
    else {
      cumsum [ i ] = ( cumsum [ i - 1 ] + a [ i ] ) % m ;
    }
  }
  Arrays . sort ( cumsum ) ;
  HashMap < Integer , Integer > variation = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < cumsum . length ;
  i ++ ) {
    if ( i == 0 ) {
      variation . put ( cumsum [ i ] , 1 ) ;
    }
    else {
      variation . put ( cumsum [ i ] , 1 ) ;
    }
  }
  int ans = 0 ;
  for ( Integer key : variation . keySet ( ) ) {
    if ( key == 0 ) {
      ans += variation . get ( key ) ;
    }
    ans += variation . get ( key ) * ( variation . get ( key ) - 1 ) / 2 ;
  }
  System . out . println ( ans ) ;
}
