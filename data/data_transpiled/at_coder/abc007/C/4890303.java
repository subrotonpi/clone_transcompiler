static final int R = Integer . parseInt ( input ) {
  int C = Integer . parseInt ( input . readLine ( ) ) ;
  int sy = Integer . parseInt ( input . readLine ( ) ) ;
  int sx = Integer . parseInt ( input . readLine ( ) ) ;
  sy -- ;
  sx -- ;
  int gy = Integer . parseInt ( input . readLine ( ) ) ;
  int gx = Integer . parseInt ( input . readLine ( ) ) ;
  gy -- ;
  gx -- ;
  char [ ] m = new char [ R ] ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) m [ i ] = input . charAt ( i ) ;
  int [ ] [ ] Done = new int [ C ] [ R ] ;
  for ( int j = 0 ;
  j < R ;
  j ++ ) for ( int i = 0 ;
  j < R ;
  j ++ ) {
    Done [ j ] [ i ] = 0 ;
  }
  Queue < Integer > q = new LinkedList < Integer > ( ) ;
  /* check for loop */
  while ( ! q . isEmpty ( ) ) {
    int [ ] now = q . poll ( ) ;
    int i = Integer . parseInt ( now [ 0 ] ) ;
    int j = Integer . parseInt ( now [ 1 ] ) ;
    int c = Integer . parseInt ( now [ 2 ] ) ;
    if ( i == gy && j == gx ) {
      System . out . println ( c ) ;
      exit ( ) ;
    }
    if ( m [ i - 1 ] [ j ] == '.' && Done [ i - 1 ] [ j ] == 0 ) {
      Done [ i + 1 ] [ j ] = 1 ;
      q . add ( i , j , c + 1 ) ;
    }
  }
  q . add ( sy , sx , 0 ) ;
  return 0 ;
}
