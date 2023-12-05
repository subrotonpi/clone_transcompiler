static String findsol ( int N , int [ ] n , int [ ] m ) throws IOException {
  final int [ ] n2 = new int [ N ] ;
  final int [ ] m2 = new int [ N ] ;
  for ( int ii = 0 ;
  ii < n . length ;
  ++ ii ) {
    n2 [ ii ] = n [ ii ] ;
    m2 [ ii ] = m [ ii ] ;
  }
  Arrays . sort ( n2 ) ;
  Arrays . sort ( m2 ) ;
  int sc2 = 0 ;
  for ( int ii = 0 ;
  ii < n2 . length ;
  ++ ii ) {
    int bsc = 0 ;
    for ( int jj = 0 ;
    jj < m2 . length ;
    ++ jj ) {
      if ( m2 [ jj ] > n2 [ ii ] ) {
        bsc = jj ;
        break ;
      }
    }
    if ( ( n2 [ ii ] > m2 [ bsc ] ) && ( n2 [ bsc ] > m2 [ bsc ] ) ) ++ sc2 ;
    -- m2 [ bsc ] ;
  }
  Arrays . sort ( n ) ;
  Arrays . sort ( m ) ;
  int sc = 0 ;
  for ( int ii = 0 ;
  ii < n . length ;
  ++ ii ) {
    if ( m [ 0 ] > n [ ii ] ) {
      -- m [ m . length - 1 ] ;
    }
    else {
      -- m [ 0 ] ;
      sc ++ ;
    }
  }
  return Integer . toString ( sc ) + " " + Integer . toString ( sc2 ) ;
}
/* Convert numbers to doubles */
final double [ ] a = new double [ N + 1 ] ;
int ii = 0 ;
for ( int jj = 0 ;
jj < n . length ;
++ jj ) {
  if ( n [ jj ] == ' ' ) {
    if ( ( ii < jj ) && ( a [ ii ] > n [ jj ] ) ) {
      a [ ii ] = Double . parseDouble ( n [ ii ] ) ;
      ii = jj + 1 ;
    }
  }
  a [ 0 ] = Double . parseDouble ( n [ ii ] ) ;
  return a [ 0 ] ;
}
