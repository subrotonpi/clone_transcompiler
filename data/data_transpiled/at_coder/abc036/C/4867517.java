public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  int [ ] c = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( input ) ;
    c [ i ] = x ;
    a [ i ] = x ;
  }
  Arrays . sort ( c ) ;
  Arrays . sort ( c ) ;
  HashMap < Integer , Integer > b = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < c . length ;
  i ++ ) {
    b . put ( c [ i ] , i ) ;
  }
  for ( int k : a ) {
    System . out . println ( b . get ( k ) ) ;
  }
}
