static final String solve ( ) throws Exception {
  final int prec = 100 ;
  {
    final String sa = "" ;
    final String sb = "" ;
    int s = Integer . parseInt ( sa + sb ) ;
    s = String . valueOf ( s * s ) ;
    int e = 2 * sb . length ( ) ;
    sa = s . substring ( 0 , s . length ( ) - e ) ;
    sb = s . substring ( s . length ( ) - e ) ;
    sa = sa . substring ( sa . length ( ) - prec , sa . length ( ) ) ;
    sb = sb . substring ( sb . length ( ) - prec ) ;
    return sa + "." + sb ;
  }
  {
    final String sa = "" ;
    final String sb = "" ;
    final int ta = Integer . parseInt ( sa + sb ) ;
    final int tb = Integer . parseInt ( ta + tb ) ;
    s = String . valueOf ( s * t ) ;
    int e = sb . length ( ) + tb . length ( ) ;
    sa = s . substring ( 0 , s . length ( ) - e ) ;
    sb = s . substring ( sa . length ( ) - e ) ;
    sa = sa . substring ( sa . length ( ) - prec , sa . length ( ) ) ;
    sb = sb . substring ( sb . length ( ) - prec ) ;
    return sa + "." + sb ;
  }
  {
    final String theNumber = "5.23606797749978969640917366873127623544061835961152572427089724541052092563780489941441440837878227496950817615077378350425326772444707386358636012153" ;
    final String [ ] t = {
      "0001.000000" , theNumber }
      ;
      {
        final String a = theNumber ;
        for ( int i = 0 ;
        i < 34 ;
        i ++ ) {
          a = sqr ( a ) ;
          t [ i ] = a ;
        }
      }
      {
        int pow = 1 ;
        String ret = "0001.00000" ;
        while ( n -- > 0 ) {
          if ( ( n % 2 ) != 0 ) {
            ret = time ( ret , t [ pow ] ) ;
          }
          n = n / 2 ;
          pow = pow + 1 ;
        }
        final String ra = ret . substring ( ra . length ( ) - 3 , rb . length ( ) ) ;
        ret = ra . substring ( rb . length ( ) - 3