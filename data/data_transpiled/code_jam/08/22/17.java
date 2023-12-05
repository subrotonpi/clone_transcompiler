public static void prime ( int pmax ) throws IOException {
  HashMap < Integer , Integer > primeHash = new HashMap < Integer , Integer > ( ) ;
  ArrayList < Integer > prime = new ArrayList < Integer > ( ) ;
  for ( int i = 2 ;
  i < pmax ;
  i ++ ) primeHash . put ( i , 1 ) ;
  for ( int i = 2 ;
  i < pmax ;
  i ++ ) if ( primeHash . containsKey ( i ) ) for ( int j = 2 ;
  j <= pmax / i ;
  j ++ ) if ( primeHash . containsKey ( i * j ) ) primeHash . remove ( i * j ) ;
  prime . addAll ( primeHash . keySet ( ) ) ;
  BufferedReader fp = new BufferedReader ( new FileReader ( "B-small.in" ) ) ;
  String line = fp . readLine ( ) ;
  int n = Integer . parseInt ( line ) ;
  for ( int i : xrange ( n ) ) {
    HashMap < Integer , Integer > grp = new HashMap < Integer , Integer > ( ) ;
    HashMap < Integer , Integer > grpV = new HashMap < Integer , Integer > ( ) ;
    line = fp . readLine ( ) ;
    int A = Integer . parseInt ( line ) ;
    int B = Integer . parseInt ( line ) ;
    int P = Integer . parseInt ( line ) ;
    for ( int j : xrange ( A , B + 1 ) ) grp . put ( j , j ) ;
    for ( int j : prime ) {
      if ( j < P ) continue ;
      if ( j > B - A + 1 ) break ;
      int nA = A / j ;
      if ( A % j != 0 ) nA ++ ;
      int nB = B / j ;
      if ( nA == nB ) continue ;
      for ( int k : xrange ( nA , nB + 1 ) ) {
        int x = k * j ;
        int y = ( k + 1 ) * j ;
        if ( A <= x && x <= B && A <= y && y <= B ) {
          int g = x ;
          while ( g != grp . get ( g ) ) g = grp . get ( g ) ;
          int gx = g ;
          g = y ;
          while ( g != grp . get ( g ) ) g = grp . get ( g ) ;
          int gy = g ;
          if ( gx != gy ) grp . put ( gx , gy ) ;
        }
      }
    }
    for ( int j : xrange ( A , B + 1 ) ) {
      int g = j ;
      