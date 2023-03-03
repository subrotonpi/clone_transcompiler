public static int run ( int x , int r , int c , int k ) {
  int [ ] [ ] a = new int [ r ] [ c ] ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    for ( int j = ( i & 1 ) ^ x ;
    j < c ;
    j += 2 ) {
      if ( i > 0 ) {
        a [ i - 1 ] [ j ] ++ ;
      }
      if ( j > 0 ) {
        a [ i ] [ j - 1 ] ++ ;
      }
      if ( i + 1 < r ) {
        a [ i + 1 ] [ j ] ++ ;
      }
      if ( j + 1 < c ) {
        a [ i ] [ j + 1 ] ++ ;
      }
    }
  }
  int [ ] b = Arrays . copyOf ( a , a . length ) ;
  Arrays . sort ( b ) ;
  return Arrays . binarySearch ( b , 0 , k ) ;
}
int n = input . nextInt ( ) ;
for ( int i = 1 ;
i <= n ;
i ++ ) {
  r = Integer . parseInt ( input . nextLine ( ) ) ;
  c = Integer . parseInt ( input . nextLine ( ) ) ;
  k = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = Math . min ( run ( 0 , r , c , k ) , run ( 1 , r , c , k ) ) ;
  System . out . println ( "Case #" + i + ": " + ans ) ;
}
