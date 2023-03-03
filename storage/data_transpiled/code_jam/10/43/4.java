static int foo ( BufferedReader iReader ) throws IOException {
  final int n = Integer . parseInt ( iReader . readLine ( ) ) ;
  final Map < Point , Integer > a = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) {
    final int [ ] t = new int [ 4 ] ;
    for ( String s : iReader . readLine ( ) . split ( " " ) ) {
      t [ 0 ] = Integer . parseInt ( s ) ;
    }
    for ( int i1 = t [ 0 ] ;
    i1 <= t [ 2 ] ;
    ++ i1 ) {
      for ( int i2 = t [ 1 ] ;
      i2 <= t [ 3 ] ;
      ++ i2 ) {
        a . put ( new Point ( i1 , i2 ) , 1 ) ;
      }
    }
  }
  int res = 0 ;
  while ( a . size ( ) > 0 ) {
    final Map < Point , Integer > b = new HashMap < > ( ) ;
    for ( int x = 0 ;
    x < n ;
    ++ x ) {
      final int y = a . get ( x ) ;
      if ( ( x - 1 ) != ( y + 1 ) ) {
        b . put ( new Point ( x , y + 1 ) , 1 ) ;
      }
      if ( ( x + 1 ) != ( y - 1 ) ) {
        b . put ( new Point ( x + 1 , y ) , 1 ) ;
      }
      if ( ( x - 1 ) != ( y - 1 ) || ( x - 1 ) != ( y - 1 ) ) {
        b . put ( new Point ( x , y ) , 1 ) ;
      }
    }
    a = b ;
    ++ res ;
  }
  return res ;
}
