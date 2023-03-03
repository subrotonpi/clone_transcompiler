public static void main ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int x , r , ans = 0 ;
  for ( ;
  x < n ;
  x ++ ) {
    String s = input . next ( ) ;
    r = s . lastIndexOf ( "." , 0 , r ) ;
    if ( r + 1 > n ) ans ++ ;
    else r = n ;
  }
  System . out . println ( ans ) ;
}
