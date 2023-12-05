static final String solve ( String S ) {
  final Map < Integer , String > sums = Maps . newHashMap ( ) ;
  for ( String s : S ) {
    sums . put ( s , s ) ;
  }
  for ( int n = 2 ;
  n < S . length ( ) ;
  n ++ ) {
    for ( String pair : new String [ ] {
      S , n }
      ) {
        final int num = Integer . valueOf ( pair ) ;
        if ( sums . containsKey ( num ) ) {
          return String . format ( "\n%s\n%s" , StringUtils . join ( sums . get ( num ) , " " ) , StringUtils . join ( pair , " " ) ) ;
        }
        sums . put ( num , pair ) ;
      }
    }
    return " Impossible" ;
  }
  