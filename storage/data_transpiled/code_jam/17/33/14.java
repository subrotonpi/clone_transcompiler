static final Function < Integer , Double > TRANSFORM = new Function < Integer , Double > ( ) {
  @ Override public Double apply ( Integer input ) {
    final int n = Integer . parseInt ( input . toString ( ) ) ;
    final int k = Integer . parseInt ( input . toString ( ) ) ;
    final double u = Double . parseDouble ( input . toString ( ) ) ;
    final List < Double > ps = Lists . newArrayList ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      ps . add ( Double . parseDouble ( input . toString ( ) ) ) ;
    }
    return new Function < Double , Double > ( ) {
      @ Override public Double apply ( Double v ) {
        return Math . max ( v , ps . get ( i ) ) ;
      }
    }
    ;
  }
  @ Override public Double apply ( Double v ) {
    return Math . max ( v , ps . get ( i ) ) ;
  }
  @ Override public Double apply ( Double a , Double b , int it ) {
    if ( it == 100 ) {
      return a ;
    }
    double c = 0.5 * ( a + b ) ;
    return Math . max ( 0 , c - p ) <= u ? search ( c , b , it + 1 ) : search ( a , c , it + 1 ) ;
  }
}
