static final String solve ( ) {
  final class Obj {
  }
  ;
  final double dist = ( o1 . x - o2 . x ) * ( o1 . x - o2 . x ) + ( o1 . y - o2 . y ) * ( o1 . y - o2 . y ) + o2 . r + o1 . r ;
  return new Solution ( ) {
    public double solve ( List < Obj > a ) {
      int n = a . size ( ) ;
      if ( n == 1 ) return a . get ( 0 ) . r ;
      if ( n == 2 ) return Math . max ( a . get ( 0 ) . r , a . get ( 1 ) . r ) ;
      double res = Math . max ( dist , a . get ( 0 ) , a . get ( 1 ) . r ) ;
      res = Math . min ( res , Math . max ( dist , a . get ( 0 ) , a . get ( 2 ) ) ) ;
      res = Math . min ( res , Math . max ( dist , a . get ( 1 ) , a . get ( 2 ) ) ) ;
      return res ;
    }
  }
  ;
}
