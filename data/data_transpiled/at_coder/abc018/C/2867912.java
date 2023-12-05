static int N = 510 ;
int h = ( int ) input . nextInt ( ) ;
int w = ( int ) input . nextInt ( ) ;
int K = ( int ) input . nextInt ( ) ;
char [ ] [ ] mp = new char [ N * 3 ] [ N ] ;
for ( int i = 0 ;
i <= h ;
i ++ ) {
  mp [ i ] = new char [ N ] ;
}
for ( int i = 0 ;
i <= w ;
i ++ ) {
  mp [ i ] = new char [ N ] ;
}
int [ ] [ ] cnt = new int [ N * 3 ] [ N ] ;
for ( int i = 0 ;
i <= h ;
i ++ ) {
  for ( int j = 0 ;
  j <= w ;
  j ++ ) {
    int u = N + i + j ;
    int v = N + j - i ;
    cnt [ u + 1 ] [ v + 1 ] = mp [ i ] == 'x' ? 1 : 0 ;
  }
}
for ( int i = 0 ;
i <= 3 * N ;
i ++ ) {
  for ( int j = 1 ;
  j <= 3 * N ;
  j ++ ) {
    cnt [ i ] [ j ] += cnt [ i ] [ j - 1 ] ;
  }
}
for ( int j = 0 ;
j <= 3 * N ;
j ++ ) {
  for ( int i = 1 ;
  i <= 3 * N ;
  i ++ ) {
    cnt [ i ] [ j ] += cnt [ i - 1 ] [ j ] ;
  }
}
int ans = 0 ;
for ( int i = 0 ;
i <= h ;
i ++ ) {
  for ( int j = 0 ;
  j <= w ;
  j ++ ) {
    if ( ( i - K + 1 < 0 ) || ( j - K + 1 < 0 ) || ( i + K - 1 >= h ) || ( j + K - 1 >= w ) ) {
      continue ;
    }
    int x = j - ( K - 1 ) ;
    int y = i ;
    int X = j + ( K - 1 ) ;
    int Y = i ;
    int u = N + x + y ;
    int v = N + x - y ;
    int U = N + X + Y ;
    int V = N + X - Y ;
    int val = get ( v , u , V + 1 , U + 1 ) ;
    ans = ans + ( val == 0 ? 1 : 0 ) ;
  }
}
System . out . println ( ans ) ;
return ans