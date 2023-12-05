static final void solve ( int H , int W , @ Nonnull int [ ] [ ] a ) {
  List < List < Integer >> ans = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W - 1 ;
    j ++ ) {
      if ( a [ i ] [ j ] % 2 == 1 ) {
        ans . add ( Arrays . asList ( i + 1 , j + 1 , i + 1 , j + 1 + 1 ) ) ;
        a [ i ] [ j ] -- ;
        a [ i ] [ j + 1 ] ++ ;
      }
    }
  }
  int j = W - 1 ;
  for ( int i = 0 ;
  i < H - 1 ;
  i ++ ) {
    if ( a [ i ] [ j ] % 2 == 1 ) {
      ans . add ( Arrays . asList ( i + 1 , j + 1 , i + 1 + 1 , j + 1 ) ) ;
      a [ i ] [ j ] -- ;
      a [ i + 1 ] [ j ] ++ ;
    }
  }
  System . out . println ( ans . size ( ) ) ;
  for ( List < Integer > a : ans ) {
    System . out . println ( Arrays . toString ( a ) ) ;
  }
  return ;
}
