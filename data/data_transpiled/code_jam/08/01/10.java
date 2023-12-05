static private int solve1 ( int [ ] Engines , int [ ] Que ) throws IOException {
  final int [ ] m = new int [ Engines . length ] ;
  int n = 0 ;
  while ( ( Que = Que . length ) > 0 ) {
    int q = Que . length ;
    if ( ( m [ Engines [ q ] ] = 1 ) == 0 ) {
      m [ Engines [ q ] ] = 1 ;
      n = n + 1 ;
      if ( ( n == Engines . length ) && ( m [ Engines [ q ] ] = 1 ) == 0 ) {
        Que [ 0 ] = q ;
        return 0 ;
      }
    }
  }
  return 0 ;
}
