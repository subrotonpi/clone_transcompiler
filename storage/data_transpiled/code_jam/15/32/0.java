@ VisibleForTesting static float [ ] [ ] trie ( int K , String keyboard , int L , String word ) {
  int [ ] [ ] x = new int [ xrange ( L + 1 ) ] [ xrange ( L + 1 ) ] ;
  for ( int i = 0 ;
  i < x . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < x [ i ] . length ;
    j ++ ) {
      x [ i ] [ j ] = 0 ;
    }
  }
  for ( String key : keyboard ) {
    for ( int p = 0 ;
    p < x [ i ] . length ;
    p ++ ) {
      String newword = word . substring ( 0 , p ) + key ;
      while ( newword . length ( ) != word . length ( ) ) {
        newword = newword . substring ( 1 ) ;
      }
      x [ p ] [ newword . length ( ) ] += new Fraction ( 1 , K ) ;
    }
  }
  return x ;
}
