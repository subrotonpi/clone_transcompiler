public static void print ( int n ) {
  int [ ] lis = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) lis [ i ] = Integer . parseInt ( input ( ) ) ;
  HashMap < Integer , Integer > cou = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( cou . containsKey ( lis [ i ] ) ) cou . put ( lis [ i ] , 1 ) ;
    else cou . put ( lis [ i ] , 1 ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( cou . containsKey ( i ) ) ans += cou . get ( i ) ;
    else ans += Math . abs ( cou . get ( i ) - i ) ;
  }
  System . out . println ( ans ) ;
}
