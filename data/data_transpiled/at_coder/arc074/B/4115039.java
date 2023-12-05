static final void main ( String input ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  final int n = Integer . parseInt ( input ) ;
  int [ ] data = new int [ n ] ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int amax = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    heapq . heapAppend ( data , a [ i ] ) ;
    amax += a [ i ] ;
  }
  int [ ] ansdata = new int [ n ] ;
  ansdata [ n ] = amax ;
  for ( int i = n ;
  i < 2 * n ;
  i ++ ) {
    heapq . heapAppend ( data , a [ i ] ) ;
    amax += a [ i ] ;
    amax -= heapq . heapMax ( data ) ;
    ansdata [ n ] = amax ;
  }
  System . out . println ( max ( ansdata ) ) ;
}
