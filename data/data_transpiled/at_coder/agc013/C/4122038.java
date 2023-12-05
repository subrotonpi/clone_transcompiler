public static int iipt = lambda ( ) {
  int i = Integer . parseInt ( input ( ) ) ;
  int miipt = lambda ( ) ;
  int n = miipt ( ) ;
  int l = miipt ( ) ;
  int t = miipt ( ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = miipt ( ) ;
  int d = 0 ;
  for ( int j = 0 ;
  j < a . length ;
  j ++ ) {
    int x = a [ j ] ;
    int w = a [ j ] ;
    d += ( x + ( w == 1 ? t : - t ) ) / l ;
  }
  d = d % n ;
  int [ ] e = new int [ n ] ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) e [ j ] = ( x + ( w == 1 ? t : - t ) ) % l ;
  Arrays . sort ( e ) ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) System . out . println ( e [ ( d + j ) % n ] ) ;
  return e [ n ] ;
}
