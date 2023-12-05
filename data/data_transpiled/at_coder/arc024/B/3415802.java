public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  if ( new HashSet ( a ) . size ( ) == 1 ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  a += a ;
  int m = 0 ;
  int c = 0 ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    c = a [ i ] ;
  }
}
