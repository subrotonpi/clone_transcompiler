public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] A = new int [ n ] ;
  int [ ] B = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    A [ i ] = a ;
    B [ i ] = b ;
  }
  int ans = 0 ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    int a = A [ i ] + ans ;
    int b = B [ i ] ;
    int tmp ;
    if ( a % b == 0 ) tmp = 0 ;
    else tmp = ( a / b + 1 ) * b - a ;
    ans += tmp ;
  }
  System . out . println ( ans ) ;
}
