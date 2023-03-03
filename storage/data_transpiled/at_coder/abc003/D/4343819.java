public static int div = ( int ) ( 1e9 + 7 ) ;
{
  if ( i < j ) return ( 0 ) ;
  int s = Math . min ( j , i - j ) ;
  int [ ] pi = new int [ s + 1 ] ;
  for ( int ii = i + 1 ;
  ii < s ;
  ii ++ ) {
    if ( ii == 0 ) {
      pi [ 0 ] = 1 ;
    }
    else {
      int [ ] pii = new int [ s + 1 ] ;
      for ( int jj = 0 ;
      jj < s + 1 ;
      jj ++ ) {
        pii [ jj ] += jj != 0 ? pi [ jj - 1 ] : 0 ;
        if ( pii [ jj ] == 0 ) break ;
        else if ( pii [ jj ] >= div ) pii [ jj ] -= div ;
      }
      pi = pii ;
    }
  }
  return ( pi [ pi . length - 1 ] ) ;
}
final Function < Integer , Integer > numdl = ( n , d , l ) -> {
  int num ;
  int r = 0 ;
  int c = 0 ;
  int x = 0 ;
  int y = 0 ;
  int d = 0 ;
  int l = 0 ;
  int area = 0 ;
  while ( i < s ) {
    if ( i * y == d + l ) {
      num = iCj ( n * y , d ) * iCj ( n - d , l ) ;
    }
    else {
      num = numdl . apply ( x * y , d , l ) ;
      num -= numdl . apply ( x * ( y - 1 ) , d , l ) * 2 ;
      num -= numdl . apply ( ( x - 1 ) * y , d , l ) * 2 ;
      num += numdl . apply ( ( x - 2 ) * y , d , l ) ;
      num += numdl . apply ( ( x - 1 ) * y , d , l ) * 4 ;
      num -= numdl . apply ( ( x - 2 ) * y , d , l ) * 2 ;
      num -= numdl . apply ( ( x - 1 ) * y , d , l ) * 4 ;
      num -= numdl . apply ( ( x - 2 ) * y , d , l ) * 2 ;
      num += numdl . apply ( ( x - 1 ) * y , d , l ) * 4 ;
      num -= numdl . apply ( ( x - 1 ) * y , d , l ) * 2 ;
      num += numdl . apply