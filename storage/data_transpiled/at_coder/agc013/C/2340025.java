public static final int [ ] getlis ( ) {
  String [ ] temp = input . split ( " " ) ;
  int n = Integer . parseInt ( temp [ 0 ] ) ;
  int l = Integer . parseInt ( temp [ 1 ] ) ;
  int t = Integer . parseInt ( temp [ 2 ] ) ;
  int [ ] [ ] lis = new int [ n ] [ 2 ] ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) lis [ j ] [ 0 ] = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int cou = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( lis [ i ] [ 1 ] == 1 ) lis [ i ] [ 0 ] += t ;
    else lis [ i ] [ 0 ] -= t ;
    cou += Math . floor ( lis [ i ] [ 0 ] / l ) ;
  }
  int [ ] li = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) li [ i ] = lis [ i ] [ 0 ] % l ;
  Arrays . sort ( li ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) System . out . println ( li [ ( i + cou ) % n ] % l ) ;
  return li ;
}
