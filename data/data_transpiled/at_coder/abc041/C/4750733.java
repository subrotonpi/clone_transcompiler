public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  HashMap < Integer , Integer > dic = new HashMap < Integer , Integer > ( ) ;
  for ( int idx = 0 ;
  idx < a . length ;
  idx ++ ) {
    dic . put ( a [ idx ] , idx + 1 ) ;
  }
  for ( int x : new ArrayList < Integer > ( a ) ) {
    System . out . println ( dic . get ( x ) ) ;
  }
}
