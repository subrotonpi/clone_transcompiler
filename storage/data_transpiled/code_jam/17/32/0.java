public static void fin ( File fin ) throws IOException {
  PrintStream fout = new PrintStream ( "2.out" ) ;
  int day = 24 * 60 ;
  int T = Integer . parseInt ( fin . readLine ( ) ) ;
  for ( int test = 0 ;
  test < T ;
  test ++ ) {
    System . out . println ( test + 1 ) ;
    int C = Integer . parseInt ( fin . readLine ( ) ) ;
    int J = Integer . parseInt ( fin . readLine ( ) ) ;
    int [ ] [ ] fixed = new int [ day ] [ day ] ;
    for ( int i = 0 ;
    i < C ;
    i ++ ) fixed [ i ] = new int [ day ] ;
    for ( int c = 0 ;
    c < C ;
    c ++ ) {
      int start = Integer . parseInt ( fin . readLine ( ) ) ;
      int end = Integer . parseInt ( fin . readLine ( ) ) ;
      for ( int t = start ;
      t < end ;
      t ++ ) fixed [ t ] = 1 ;
    }
    for ( int j = 0 ;
    j < J ;
    j ++ ) {
      int start = Integer . parseInt ( fin . readLine ( ) ) ;
      int end = Integer . parseInt ( fin . readLine ( ) ) ;
      for ( int t = start ;
      t < end ;
      t ++ ) fixed [ t ] = 2 ;
    }
    int [ ] [ ] [ ] F = new int [ day ] [ day + 1 ] [ day + 1 ] ;
    for ( int c = 0 ;
    c < day + 1 ;
    c ++ ) {
      for ( int t = 0 ;
      t < day + 1 ;
      t ++ ) {
        for ( int c = 0 ;
        c < day / 2 ;
        c ++ ) {
          if ( fixed [ t - 1 ] != 1 ) F [ t ] [ c ] [ 0 ] = Math . min ( F [ t - 1 ] [ c - 1 ] [ 1 ] + 1 , F [ t - 1 ] [ c - 1 ] [ 0 ] ) ;
          if ( fixed [ t - 1 ] != 2 ) F [ t ] [ c ] [ 1 ] = Math . min ( F [ t - 1 ] [ c ] [ 1 ] , F [ t - 1 ] [ c ] [ 0 ] + 1 ) ;
        }
      }
    }
    int ans = Math . min ( F [ day ] [ day / 2 ] [ 0 ] , F [ day ] [ day / 2 ] [ 1 ] ) ;
    if ( ans % 2 == 1 ) ans ++ ;
    fout . println