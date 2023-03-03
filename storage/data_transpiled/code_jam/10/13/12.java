static final Function < String , Function < String , Integer >> memoize = new Function < String , Function < String , Integer >> ( ) {
  private final Map < String , Integer > cache = new HashMap < > ( ) ;
  @ Override public Function < String , Integer > apply ( String input ) {
    return new Function < String , Integer > ( ) {
      private final int result ;
      @ Override public Integer apply ( String input ) {
        if ( cache . containsKey ( input ) ) {
          return cache . get ( input ) ;
        }
        else {
          final Integer val = function . apply ( input ) ;
          cache . put ( input , val ) ;
          return val ;
        }
      }
    }
    ;
  }
  @ Override public int [ ] solve ( ) {
    final int [ ] S = new int [ input . length ( ) ] ;
    for ( int i = 0 ;
    i < input . length ( ) ;
    i ++ ) {
      S [ i ] = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
    }
    return S ;
  }
  @ Override public int fib ( int n ) {
    if ( n < 2 ) return 1 ;
    else return fib ( n - 1 ) + fib ( n - 2 ) ;
  }
  private int p = fib ( 31 ) ;
  private int q = fib ( 30 ) ;
  private static final double s ( int n ) {
    return Math . ceil ( n * q / p + 1 ) ;
  }
  private static double t ( int n ) {
    return Math . ceil ( n * p / q ) ;
  }
}
