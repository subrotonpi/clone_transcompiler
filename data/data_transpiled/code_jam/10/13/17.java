@ String ( filename = "C-small.in" ) public static void main ( String [ ] args ) throws IOException {
  int ll = - 1 ;
  for ( String line : IOUtils . readLines ( new FileInputStream ( filename ) ) ) {
    ll ++ ;
    if ( ll == 0 ) continue ;
    long [ ] data = ArrayUtil . toLongArray ( line . replaceAll ( " " , "" ) . split ( " " ) ) ;
    int ret = 0 ;
    for ( long a = data [ 0 ] ;
    a <= data [ 1 ] ;
    a ++ ) {
      long b_min = Math . max ( ( a + 1 ) / 2 , data [ 2 ] ) ;
      long b_max = Math . min ( a * 2 , data [ 3 ] ) ;
      if ( b_min > b_max ) {
        ret += data [ 3 ] - data [ 2 ] + 1 ;
        continue ;
      }
      ret += b_min - data [ 2 ] + data [ 3 ] - b_max ;
      long [ ] bs = new long [ b_max + 1 ] ;
      for ( long b : bs ) {
        long atmp = a ;
        int turn = 1 ;
        do {
          if ( atmp > b ) {
            if ( ( atmp - 1 ) / b >= 2 ) break ;
            else atmp -= b ;
          }
          else if ( atmp == b ) {
            turn ++ ;
            break ;
          }
          else {
            if ( ( b - 1 ) / atmp >= 2 ) break ;
            else b -= atmp ;
          }
        }
        turn ++ ;
      }
      while ( turn % 2 == 1 ) ;
      ret ++ ;
    }
  }
  System . out . println ( "Case #" + ll + ": " + ret ) ;
}
