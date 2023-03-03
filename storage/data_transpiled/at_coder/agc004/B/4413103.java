public static void main ( String input , int n ) {
  int x = Integer . parseInt ( input ) ;
  LinkedList < Integer > a = new LinkedList < Integer > ( ) ;
  a . add ( n ) ;
  int [ ] DP = a . toArray ( ) ;
  int ans = Integer . MIN_VALUE ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    DP = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      DP [ j ] = Math . min ( DP [ j ] , DP [ j - 1 ] ) ;
    }
    ans = Math . min ( ans , Math . min ( DP , a . size ( ) + ( i + 1 ) * x ) ) ;
  }
  System . out . println ( ans ) ;
}
