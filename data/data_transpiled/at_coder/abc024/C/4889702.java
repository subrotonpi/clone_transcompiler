public static int [ ] [ ] [ ] n = new int [ d ] [ k ] ;
int s , t ;
int start , end ;
int [ ] [ ] move = new int [ d ] [ k ] ;
for ( int i = 0 ;
i < d ;
i ++ ) {
  int [ ] [ ] x = new int [ n ] [ ] ;
  for ( int j = 0 ;
  j < x . length ;
  j ++ ) x [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
  move [ i ] = x ;
}
for ( int i = 0 ;
i < k ;
i ++ ) {
  s = Integer . parseInt ( input . nextLine ( ) ) ;
  t = Integer . parseInt ( input . nextLine ( ) ) ;
  start = s ;
  end = s ;
  if ( s < t ) {
    for ( int j = 0 ;
    j < move . length ;
    j ++ ) {
      if ( move [ j ] [ 0 ] <= start ) {
        end = Math . max ( end , move [ j ] [ 1 ] ) ;
        start = end ;
      }
      if ( end >= t ) {
        System . out . println ( j + 1 ) ;
        break ;
      }
    }
  }
  else {
    for ( int j = 0 ;
    j < move . length ;
    j ++ ) {
      if ( move [ j ] [ 1 ] >= start ) {
        end = Math . min ( end , move [ j ] [ 0 ] ) ;
        start = end ;
      }
      if ( end <= t ) {
        System . out . println ( j + 1 ) ;
        break ;
      }
    }
  }
}
return move ;
}
