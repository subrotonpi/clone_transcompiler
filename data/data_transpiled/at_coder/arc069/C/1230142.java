public static int [ ] getSorted ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > an = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    an . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  List < Integer > sa = new ArrayList < > ( ( ( Integer ) an . get ( 0 ) ) ) ;
  sa . add ( new Integer ( 0 ) ) ;
  sa . add ( new Integer ( n ) ) ;
  int [ ] result = new int [ n ] ;
  int prevA = sa . get ( 0 ) , minI = 0 ;
  for ( int j = 1 ;
  j < sa . size ( ) ;
  j ++ ) {
    int a = sa . get ( j ) ;
    result [ minI ] += ( j + 1 ) * ( prevA - a ) ;
    minI = Math . min ( minI , i ) ;
    prevA = a ;
  }
  for ( int cnt : result ) {
    System . out . println ( cnt ) ;
  }
  return result ;
}
