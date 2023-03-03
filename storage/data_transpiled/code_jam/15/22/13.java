static int [ ] solve ( ) throws IOException {
  long time = System . nanoTime ( ) ;
  System . setIn ( new FileInputStream ( "B-large.in" ) ) ;
  System . setOut ( new PrintStream ( "B-large.out" ) ) ;
  {
    int T = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int i = 0 ;
    i < T ;
    i ++ ) System . out . println ( "Case #" + ( i + 1 ) + ": " + Work ( ) ) ;
  }
  System . err . printf ( "completed %.3f\n" , time ) ;
  {
    int n = r * c - n ;
    int B = 0 ;
    List < Integer > vlist = new ArrayList < Integer > ( ) ;
    for ( int i = 0 ;
    i < r ;
    i ++ ) for ( int j = 0 ;
    j < c ;
    j ++ ) {
      if ( ( i + j ) % 2 == 1 ) {
        int ss = 4 ;
        if ( i == 0 ) ss -- ;
        if ( i == r - 1 ) ss -- ;
        if ( j == 0 ) ss -- ;
        if ( j == c - 1 ) ss -- ;
        vlist . add ( ss ) ;
      }
    }
    int rr = Integer . parseInt ( vlist . get ( 0 ) ) ;
    if ( n <= 0 ) return rr ;
    Collections . sort ( vlist , Collections . reverseOrder ( ) ) ;
    return rr - Integer . parseInt ( vlist . get ( 0 ) ) ;
  }
  {
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int inv = WorkInv ( r , c , n ) ;
    int B = 0 ;
    List < Integer > vlist = new ArrayList < Integer > ( ) ;
    for ( int i = 0 ;
    i < r ;
    i ++ ) for ( int j = 0 ;
    j < c ;
    j ++ ) {
      if ( ( i + j ) % 2 == 1 ) {
        B ++ ;
        continue ;
      }
      int ss = 4 ;
      if ( i == 0 ) ss -- ;
      if ( i == r - 1 ) ss -- ;
      if ( j == 0 ) ss -- ;
      if ( j == c - 1 ) ss -- ;
      vlist . add ( ss ) ;
    }
    n -= B ;
    if ( n <= 0 ) return 0 ;
    Collections . sort ( v @ @