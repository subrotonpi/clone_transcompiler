static int MAXN = 1005 ;
int [ ] a = new int [ MAXN ] ;
int S ;
while ( ( b > 0 ) && ( a < MAXN ) ) {
  int c = a % b ;
  a = b ;
  b = c ;
}
BufferedReader fi = new BufferedReader ( new FileReader ( "warning.in" ) ) ;
int T = Integer . parseInt ( fi . readLine ( ) ) ;
for ( int iT = 0 ;
iT < T ;
iT ++ ) {
  String s = fi . readLine ( ) ;
  String [ ] s2 = s . split ( " " ) ;
  int N = Integer . parseInt ( s2 [ 0 ] ) ;
  int [ ] data = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    data [ i ] = Integer . parseInt ( s2 [ i + 1 ] ) ;
  }
  int [ ] a = new int [ N ] ;
  int ac = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int j = i + 1 ;
    while ( ( j < N ) && ( a [ j ] < data [ i ] ) ) {
      a [ ac ] = Math . abs ( data [ i ] - data [ j ] ) ;
      ac = ac + 1 ;
      j = j + 1 ;
    }
  }
  for ( int i = 0 ;
  i < ac - 1 ;
  i ++ ) {
    a [ i + 1 ] = GCD ( a [ i ] , a [ i + 1 ] ) ;
  }
  T = a [ ac - 1 ] ;
  S = data [ 0 ] % T ;
  if ( ( S > 0 ) && ( S < MAXN ) ) S = MAXN - S ;
  String res = "Case #" + ( iT + 1 ) + ": " + S ;
  System . out . println ( res ) ;
}
