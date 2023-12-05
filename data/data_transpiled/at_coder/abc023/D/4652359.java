public static int solve ( int mid ) {
  int [ ] a = new int [ n * 2 ] ;
  for ( int h = 0 ;
  h < b . length ;
  h ++ ) {
    int s = b [ h ] ;
    int i = ( mid - h ) / s ;
    if ( i < 0 ) {
      return 0 ;
    }
    a [ Math . min ( i , n ) ] ++ ;
  }
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    a [ i ] += a [ i - 1 ] ;
    if ( a [ i ] > i + 1 ) {
      return 0 ;
    }
  }
  return 1 ;
}
int n = Integer . parseInt ( input ( ) ) ;
int [ ] b = new int [ n ] ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  b [ i ] = Integer . parseInt ( input ( ) ) ;
}
