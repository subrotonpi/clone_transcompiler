public static void main ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  double [ ] d = new double [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    d [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  Set b = new HashSet ( d ) ;
  System . out . println ( b . size ( ) ) ;
}
