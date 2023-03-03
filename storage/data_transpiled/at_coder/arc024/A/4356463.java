static final void main ( String [ ] args ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  String input = args [ 0 ] ;
  int L = Integer . parseInt ( input ) ;
  int R = Integer . parseInt ( input ) ;
  List < Integer > l = new LinkedList < Integer > ( ) ;
  List < Integer > r = new LinkedList < Integer > ( ) ;
  l = new ArrayList < Integer > ( l ) ;
  r = new ArrayList < Integer > ( r ) ;
  int i = 0 ;
  int j = 0 ;
  int ans = 0 ;
  while ( i < L && j < R ) {
    if ( l . get ( i ) == r . get ( j ) ) {
      ans ++ ;
      i ++ ;
      j ++ ;
    }
    else if ( l . get ( i ) > r . get ( j ) ) {
      j ++ ;
    }
    else {
      i ++ ;
    }
  }
  System . out . println ( ans ) ;
}
