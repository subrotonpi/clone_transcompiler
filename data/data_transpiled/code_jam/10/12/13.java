public static void fpR ( File fpW ) throws IOException {
  File fpR = new File ( "b.in" ) ;
  File fpW = new File ( "b.out" ) ;
  int t = Integer . parseInt ( fpR . readLine ( ) ) ;
  int [ ] [ ] memo = new int [ 256 ] [ 256 ] ;
  for ( int i = 0 ;
  i < 101 ;
  i += 1 ) {
    memo [ i ] = new int [ 256 ] ;
    for ( int j = 0 ;
    j < 256 ;
    j += 1 ) {
      memo [ i ] [ j ] = 987654321 ;
    }
  }
  for ( int i = 0 ;
  i < t ;
  i += 1 ) {
    String str = fpR . readLine ( ) ;
    String [ ] arr = str . split ( " " ) ;
    int c1 = Integer . parseInt ( arr [ 0 ] ) ;
    int c2 = Integer . parseInt ( arr [ 1 ] ) ;
    int m = Integer . parseInt ( arr [ 2 ] ) ;
    int n = Integer . parseInt ( arr [ 3 ] ) ;
    str = fpR . readLine ( ) ;
    arr = str . split ( " " ) ;
    for ( int j = 0 ;
    j <= n ;
    j += 1 ) {
      for ( int k = 0 ;
      k <= 256 ;
      k += 1 ) {
        memo [ j ] [ k ] = 987654321 ;
      }
    }
    for ( int j = 0 ;
    j <= 256 ;
    j += 1 ) {
      memo [ 0 ] [ j ] = 0 ;
    }
    for ( int j = 0 ;
    j <= n ;
    j += 1 ) {
      for ( int k = 0 ;
      k <= 256 ;
      k += 1 ) {
        int value = memo [ j ] [ k ] + c1 ;
        memo [ j + 1 ] [ k ] = Math . min ( memo [ j + 1 ] [ k ] , value ) ;
        for ( int l = 0 ;
        l <= 256 ;
        l += 1 ) {
          if ( Math . abs ( k - l ) <= m ) {
            int value = memo [ j ] [ l ] + Math . abs ( k - Integer . parseInt ( arr [ j ] ) ) ;
            memo [ j + 1 ] [ k ] = Math . min ( memo [ j + 1 ] [ k ] , value ) ;
          }
        }
      }
    }
    if ( m != 0 ) {
      int [ ] temp = new int [ n ] ;
      for ( int k = 0 ;
      k <= n ;
      k += 1 ) {
        for