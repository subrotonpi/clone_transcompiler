static boolean canswing ( int N , int D , int [ ] d , int [ ] l ) {
  final int [ ] vl = new int [ N ] ;
  Arrays . fill ( vl , - 1 ) ;
  vl [ 0 ] = d [ 0 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( ( vl [ i ] == - 1 ) || ( vl [ i ] == - 1 ) ) continue ;
    final int ll = vl [ i ] ;
    final int dd = d [ i ] ;
    if ( ( ( ll + dd ) >= D ) && ( ( ll + dd ) >= d [ j ] ) ) return true ;
    for ( int j = i + 1 ;
    j < N ;
    j ++ ) {
      if ( ( ( ll + dd ) >= d [ j ] ) && ( ( ll + dd ) >= d [ j ] ) ) {
        int nvl = 0 ;
        if ( ( l [ j ] > ( d [ j ] - d [ i ] ) ) && ( ( l [ j ] > d [ j ] ) ) ) nvl = d [ j ] - d [ i ] ;
        else nvl = l [ j ] ;
        if ( ( nvl > vl [ j ] ) && ( ( nvl > vl [ j ] ) ) ) vl [ j ] = nvl ;
      }
      else break ;
    }
  }
  return false ;
}
