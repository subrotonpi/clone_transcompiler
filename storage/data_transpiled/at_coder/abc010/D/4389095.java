@ VisibleForTesting static int [ ] [ ] forfulkerson ( int a , int b , int [ ] [ ] c ) {
  int n = li ( ) ;
  int [ ] [ ] out = new int [ n + 1 ] [ n + 1 ] ;
  int [ ] [ ] ent = new int [ n + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    out [ i ] [ n ] = i ;
    c [ i ] [ n ] = 1 ;
    ent [ i ] [ n ] = i ;
  }
  for ( int i = 0 ;
  i < e ;
  i ++ ) {
    int a = li ( ) ;
    out [ a ] [ b ] = a ;
    c [ a ] [ b ] = 1 ;
    ent [ a ] [ b ] = a ;
  }
  System . out . println ( forfulkerson ( 0 , n , c ) ) ;
}
