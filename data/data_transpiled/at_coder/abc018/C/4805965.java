public static int [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] = new int [ R ] [ C ] [ R ] [ C ] [ R ] [ C ] [ K ] [ ] [ ] ;
int [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] = new int [ R ] [ C ] [ R ] [ C ] [ R ] [ C ] [ K ] [ ] ;
for ( int i = 0 ;
i < R ;
i ++ ) {
  String s = input . nextLine ( ) ;
  for ( int j = 0 ;
  j < C ;
  j ++ ) {
    if ( ( s . charAt ( j ) == 'x' ) && ( s . charAt ( j ) == 'y' ) ) {
      for ( int k = 0 ;
      k < K ;
      k ++ ) {
        if ( ( i - k >= 0 ) && ( i + k < R ) ) {
          imo [ i - k ] [ Math . max ( 0 , j - K + k + 1 ) ] ++ ;
          imo [ i - k ] [ Math . min ( C , j + K - k ) ] -- ;
        }
        if ( ( i + k ) < R ) {
          imo [ i + k ] [ j ] += imo [ i ] [ j - 1 ] ;
        }
      }
    }
  }
}
for ( int i = 0 ;
i < R ;
i ++ ) {
  for ( int j = 1 ;
  j < C ;
  j ++ ) {
    imo [ i ] [ j ] [ j ] += 1 ;
  }
}
int ans = 0 ;
for ( int y = 0 ;
y < C - K + 1 ;
y ++ ) {
  for ( int x = 0 ;
  x < R - K + 1 ;
  x ++ ) {
    if ( ( imo [ x ] [ y ] [ x ] == 0 ) && ( imo [ y ] [ x ] [ y ] [ x ] == 0 ] [ y ] [ y ] [ x ] [ y ] [ y ] [ y ] [ x ] [ y ] [ y ] [ y ] [ y ] [ x ] [ y ] [ y ] [ y ] [ y ] [ y ] [ y ] [ y ] [ x ] [ y ] [ y ] [ y ] [ y ] [ y ] [ y ] [ y ] [ y ] [ y ] [ y ] [ y