public static int [ ] [ ] b = new int [ 2 ] [ 3 ] ;
for ( int i = 0 ;
i < 2 ;
i ++ ) {
  for ( int j = 0 ;
  j < 3 ;
  j ++ ) {
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      for ( int j = 0 ;
      j < 3 ;
      j ++ ) {
        for ( int k = 0 ;
        k < 3 ;
        k ++ ) {
          for ( int k = 0 ;
          k < 3 ;
          k ++ ) {
            c [ j ] [ k ] = i ;
          }
        }
      }
    }
  }
  int [ ] [ ] memo = new int [ 1 << 18 ] [ 3 ] ;
  {
    int m = 0 ;
    int t = 0 ;
    if ( t == 9 ) {
      int p = 0 ;
      for ( int y = 0 ;
      y < 3 ;
      y ++ ) {
        for ( int x = 0 ;
        x < 2 ;
        x ++ ) {
          p += ( ( m >> ( y * 3 + x ) * 2 ) & 3 ) ^ ( ( m >> ( y * 3 + x + 1 ) * 2 ) & 3 ) ;
        }
      }
      for ( int x = 0 ;
      x < 3 ;
      x ++ ) {
        for ( int y = 0 ;
        y < 2 ;
        y ++ ) {
          p += ( ( m >> ( y * 3 + x ) * 2 ) & 3 ) ^ ( ( m >> ( ( y + 1 ) * 3 + x ) * 2 ) & 3 ) ;
        }
      }
      return p ;
    }
    else {
      t ++ ;
      int [ ] result = new int [ 9 ] ;
      for ( int i = 0 ;
      i < 9 ;
      i ++ ) {
        int j = 1 << i * 2 ;
        if ( ( m >> ( i * 2 ) ) & 3 == 0 ) {
          int n = t % 2 ? m | j : m | j * 2 ;
          if ( memo [ n ] == 0 ) {
            memo [ n ] = m ;
          }
          result [ t ++ ] = memo [ n ] ;
        }
      }
      return t % 2 ? max ( result ) : min ( result ) ;
    }
  }
}
int p1 = 0 ;
int p2 = Integer . MAX_VALUE - p1 ;
System . out . println ( p1 ) ;
System . out . println ( p2 ) ;
return b ;
}
