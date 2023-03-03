public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( Integer . parseInt ( input ) ) ;
  }
  List < Integer > b = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    b . add ( ( a . get ( i ) ) ) ;
  }
  Collections . sort ( b ) ;
  int [ ] ans = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans [ i ] = 0 ;
  }
  ans [ 0 ] = b . get ( 0 ) . intValue ( ) * n ;
  int minIndex = b . get ( b . size ( ) - 1 ) . intValue ( ) ;
  for ( int i = n - 1 ;
  i > 0 ;
  i -- ) {
    minIndex = Math . min ( minIndex , b . get ( i ) . intValue ( ) ) ;
    if ( b . get ( i - 1 ) . intValue ( ) != b . get ( i ) . intValue ( ) ) {
      ans [ minIndex ] += ( b . get ( i ) . intValue ( ) - b . get ( i - 1 ) . intValue ( ) ) * ( n - i ) ;
    }
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . println ( ans [ i ] ) ;
  }
}
