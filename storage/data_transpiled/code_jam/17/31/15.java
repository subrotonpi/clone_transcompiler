static final class Pannukakku {
  int radius = 0 ;
  int height = 0 ;
  int size_h = 0 ;
  int size_r = 0 ;
  int size = 0 ;
  int current_r = 0 ;
  int isoin_index ;
  int isoin_size ;
  int p ;
  int isoin_index ;
  int isoin_size ;
  int i ;
  for ( i = 0 ;
  i < pannukakkuja . length ;
  i ++ ) {
    if ( ( radius > current_r ) && ( height > current_r ) ) {
      return size_h + size_r - Math . PI * current_r * current_r ;
    }
    isoin_index = i ;
    isoin_size = kakut [ 0 ] . size ( current_r ) ;
    for ( p = 1 ;
    p < kakut . length ;
    p ++ ) {
      if ( ( kakut [ p ] . size ( current_r ) > isoin_size ) && ( height > current_r ) ) {
        isoin_index = p ;
        isoin_size = kakut [ p ] . size ( current_r ) ;
      }
    }
  }
  return ( pannukakku ) kakut . pop ( isoin_index ) ;
}
int t = Integer . parseInt ( input ( ) ) ;
for ( i = 1 ;
i <= t ;
i ++ ) {
  pannukakkuja = new int [ pannukakkuja . length ] ;
  tilauksen_koko = new int [ pannukakkuja . length ] ;
  radiuses = new int [ pannukakkuja . length ] ;
  heigths = new int [ pannukakkuja . length ] ;
  sizes = new int [ pannukakkuja . length ] ;
  for ( i = 0 ;
  i < pannukakkuja . length ;
  i ++ ) {
    radiuses [ i ] = 0 ;
  }
  kakut = new Pannukakku [ pannukakkuja . length ] ;
  for ( i = 0 ;
  i <= pannukakkuja . length ;
  i ++ ) {
    r = Integer . parseInt ( input ( ) ) ;
    s = Integer . parseInt ( input ( ) ) ;
    kakut [ i ] . radius = r ;
    kakut [ i ] . heigth = s ;
    kakut [ i ] . size_h = Math . PI * 2 * r * s ;
    kakut [ i ] . size_r = Math . PI * r * r