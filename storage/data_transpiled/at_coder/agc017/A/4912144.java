public static void main ( String input ) {
  int n = Integer . parseInt ( input ) , p = Integer . parseInt ( input ) ;
  List < Integer > l = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l . add ( Integer . parseInt ( input ) % 2 ) ;
  }
  int a = 0 , b = 0 ;
  for ( int i : l ) {
    if ( i > 0 ) {
      a ++ ;
    }
    else {
      b ++ ;
    }
  }
  if ( a == 0 ) {
    if ( p == 0 ) {
      System . out . println ( 2 * n ) ;
    }
    else {
      System . out . println ( 0 ) ;
    }
  }
  else {
    System . out . println ( 2 * ( n - 1 ) ) ;
  }
}
