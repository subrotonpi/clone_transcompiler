public static void main ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] d = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    d [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  Set mochi = new TreeSet ( ) ;
  mochi . addAll ( d ) ;
  System . out . println ( mochi . size ( ) ) ;
}
