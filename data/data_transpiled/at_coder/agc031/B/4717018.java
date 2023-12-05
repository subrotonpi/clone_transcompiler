public static void main ( String [ ] args ) {
  final int mod = 10 * 9 + 7 ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] nums = new int [ n ] ;
  nums [ 0 ] = - 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int tmp = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( nums [ i ] != tmp ) {
      nums [ i ] = tmp ;
    }
  }
  int m = nums . length ;
  int [ ] dp = new int [ m ] ;
  int [ ] colors = new int [ Math . max ( nums . length + 1 , m ) ] ;
  for ( int i = 1 ;
  i < m ;
  i ++ ) {
    dp [ i ] = 1 ;
    colors [ i ] = 0 ;
  }
  for ( int i = 1 ;
  i < m ;
  i ++ ) {
    dp [ i ] = ( dp [ i - 1 ] + colors [ nums [ i ] ] ) % mod ;
    colors [ nums [ i ] ] = dp [ i ] ;
  }
  System . out . println ( dp [ dp . length - 1 ] ) ;
}
