public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] l = new int [ n ] , c = new int [ n ] ;
  int res = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l [ i ] = input . nextInt ( ) ;
  }
  System . out . println ( n - new LinkedList < Integer > ( l ) ) ;
}
