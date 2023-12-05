static final PriorityQueue < Integer > queue = new PriorityQueue < Integer > ( ) {
  private final PriorityQueue < Integer > nCr = new PriorityQueue < Integer > ( ) ;
  private final int n ;
  private final int a ;
  private final int b ;
  @ Override public int add ( Integer n ) {
    if ( n == 0 || r == n ) return 1 ;
    if ( r == 1 ) return n ;
    if ( nCr . containsKey ( new Integer ( n ) ) ) return nCr . remove ( new Integer ( n ) ) ;
    nCr . offer ( new Integer ( n ) ) ;
    nCr . offer ( new Integer ( r ) ) ;
    return nCr . poll ( ) ;
  }
  @ Override public int size ( ) {
    return nCr . size ( ) ;
  }
  @ Override public Integer remove ( Integer n ) {
    return nCr . remove ( n ) ;
  }
  @ Override public Integer remove ( Integer n ) {
    return nCr . remove ( n ) ;
  }
  @ Override public Integer remove ( Integer n ) {
    return nCr . remove ( n ) ;
  }
  @ Override public Integer remove ( Integer n ) {
    return nCr . remove ( n ) ;
  }
  @ Override public Integer remove ( Integer n ) {
    return nCr . remove ( n ) ;
  }
  @ Override public Integer remove ( Integer n ) {
    return nCr . remove ( n ) ;
  }
  @ Override public Integer remove ( Integer n ) {
    return nCr . remove ( n ) ;
  }
  @ Override public Integer remove ( Integer n ) {
    return nCr . remove ( n ) ;
  }
  @ Override public Integer remove ( Integer n ) {
    return nCr . remove ( n ) ;
  }
  @ Override public Integer remove ( Integer n ) {
    return nCr . remove ( n ) ;
  }
}
