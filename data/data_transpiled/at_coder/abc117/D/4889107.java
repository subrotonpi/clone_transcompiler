public static void main ( String input ) {
  int n = Integer . parseInt ( input ) , k = Integer . parseInt ( input ) ;
  List < Integer > a = Lists . newArrayList ( ) ;
  for ( int i = 40 ;
  i >= 0 ;
  i -- ) {
    int j = 2 * i ;
    int count = a . stream ( ) . filter ( temp -> temp & j > 0 ) . count ( ) ;
    if ( count < n - count && j <= k ) {
      k -= j ;
      count = n - count ;
    }
    ans += j * count ;
  }
  System . out . println ( ans ) ;
}
