public static void main ( ) {
  n = Integer . parseInt ( input ( ) ) ;
  a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  b = new LinkedList ( ) ;
  b . addAll ( a ) ;
  b . addAll ( b ) ;
}
