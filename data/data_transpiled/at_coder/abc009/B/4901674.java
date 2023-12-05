public static void main ( ) {
  n = Integer . parseInt ( input ( ) ) ;
  a = [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  System . out . println ( new TreeSet ( new HashSet ( a ) ) . size ( ) - 2 ) ;
}
