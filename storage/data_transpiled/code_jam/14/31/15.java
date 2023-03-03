static final Function < Integer , Result > TO_RESULT = new Function < Integer , Result > ( ) {
  private final boolean pow2 = x -> x != 0 && ( ( x & ( x - 1 ) ) == 0 ) ;
  private Result solve ( Integer cs , Fraction f ) {
    if ( ! pow2 ( f . denominator ( ) ) ) {
      return cs == 0 ? Result . impossible ( ) : Result . impossible ( ) ;
    }
    int ret = 1 ;
    while ( f . compareTo ( Fraction . ONE ) < 0 ) {
      ret ++ ;
      f . multiply ( 2 ) ;
    }
    return cs == 0 ? Result . success ( ) : Result . success ( ) ;
  }
  private void reducer ( List < Result > l , Result result ) {
    l . add ( result ) ;
  }
}
