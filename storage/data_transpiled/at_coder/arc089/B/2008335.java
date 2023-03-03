public static int N = Integer . parseInt ( input ) {
  final int K = input . readInt ( ) ;
  final int [ ] [ ] m = new int [ 3 * K ] [ 3 * K ] ;
  int offset = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = input . readInt ( ) ;
    int y = input . readInt ( ) ;
    final char c = ( char ) ( x + 'a' ) ;
    x = ( int ) ( x + 'a' ) ;
    y = ( int ) ( y + 'a' ) ;
    x %= 2 * K ;
    y %= 2 * K ;
    if ( c == 'B' ) {
      m [ x ] [ y ] ++ ;
    }
    else {
      m [ x ] [ y ] -- ;
      offset ++ ;
    }
  }
  final int K2 = 2 * K ;
  m [ K2 ] = m [ 0 ] ;
  Arrays . fill ( m , ( byte ) 0 ) ;
  m [ K2 ] = m [ 1 ] ;
  System . out . println ( m . length + offset ) ;
}
