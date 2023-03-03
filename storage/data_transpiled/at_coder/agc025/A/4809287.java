public static long n = Long . parseLong ( input ) {
  long c = 100000000000000000L ;
  for ( int i = 1 ;
  i <= ( int ) ( n / 2 ) ;
  i ++ ) {
    List < String > a = new LinkedList < > ( String . valueOf ( i ) ) ;
    List < String > b = new LinkedList < > ( String . valueOf ( n - i ) ) ;
    long a1 [ ] = Integer . parseInt ( a ) ;
    long b1 [ ] = Integer . parseInt ( b ) ;
    if ( Math . abs ( a1 [ 0 ] + b1 [ 0 ] ) < c ) {
      c = Math . abs ( a1 [ 0 ] + b1 [ 0 ] ) ;
    }
  }
  System . out . println ( c ) ;
  return c ;
}
