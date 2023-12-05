static final class Memoize {
  private final Memoize memoize = new Memoize ( ) {
    private final Function function = Function . identity ( ) ;
    private final Memoized memoized = new Memoized ( ) ;
    @ Override public Memoized get ( final String name ) {
      if ( ! memoized . containsKey ( name ) ) {
        memoized . put ( name , function . apply ( name ) ) ;
      }
      return memoized ;
    }
    @ Override public Memoized clear ( ) {
      memoized . clear ( ) ;
    }
  }
  private int gcd ( int a , int b ) {
    while ( b > 0 ) {
      a = b ;
      b = a % b ;
    }
    return a ;
  }
  public double abs ( double x ) {
    if ( x < 0 ) return - x ;
    return x ;
  }
  public double maxarg ( final Function f , final List < Integer > args ) {
    double max = - 1 ;
    for ( final Integer a : args ) {
      final double x = f . apply ( a ) ;
      if ( x > max ) {
        best = a ;
        max = x ;
      }
    }
    return max ;
  }
  public double solve ( ) {
    for ( int i = 0 ;
    i < c ;
    i ++ ) {
      for ( int j = i ;
      j < c ;
      j ++ ) {
        final double a = p [ j ] . x - p [ i ] . x ;
        final double b = D * ( Math . pow ( p [ j ] . y , 2 ) - 1 ) ;
        final double x = ( double ) ( b - a ) / 2 ;
        return x ;
      }
    }
    return Double . NaN ;
  }
  @ Override public String toString ( ) {
    return "" ;
  }
}
