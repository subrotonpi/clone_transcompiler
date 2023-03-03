public static void main ( String input , int n , int q ) {
  String s = input ;
  int [ ] t = new int [ s . length ( ) ] ;
  for ( int i = 0 ;
  i < t . length ;
  i ++ ) {
    t [ i ] = 0 ;
  }
  int count = 0 ;
  for ( int j = 0 ;
  j < s . length ( ) - 1 ;
  j ++ ) {
    if ( s . charAt ( j ) == 'A' && s . charAt ( j + 1 ) == 'C' ) {
      count ++ ;
    }
    t [ j + 1 ] = count ;
  }
  for ( int k = 0 ;
  k < q ;
  k ++ ) {
    int l = Integer . parseInt ( input . substring ( 0 , k ) ) ;
    int r = Integer . parseInt ( input . substring ( k , k + 1 ) ) ;
    System . out . println ( t [ r - 1 ] - t [ l - 1 ] ) ;
  }
}
