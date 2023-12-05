public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int ans = 10 * 9 ;
  LinkedList < Integer > [ ] lis = new LinkedList [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) lis [ i ] = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) num = new ArrayList < Integer > ( ) ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) num . add ( lis [ j ] . get ( 0 ) - 1 ) ;
  ans = Math . min ( Math . max ( num , ans ) , ans ) ;
  for ( int k = 0 ;
  k < n ;
  k ++ ) lis [ k ] . remove ( num . indexOf ( Math . max ( num , 0 ) + 1 ) ) ;
  System . out . println ( ans ) ;
}
