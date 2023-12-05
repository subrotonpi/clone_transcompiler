public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A . add ( i ) ;
  }
  List < Integer > even = Arrays . asList ( A . get ( i ) ) ;
  List < Integer > odd = Arrays . asList ( A . get ( i ) ) ;
  if ( n % 2 == 0 ) {
    print ( Joiner . on ( ' ' ) . join ( Lists . reverse ( odd ) ) + even ) ;
  }
  else {
    print ( Joiner . on ( ' ' ) . join ( Lists . reverse ( even ) ) + odd ) ;
  }
}
