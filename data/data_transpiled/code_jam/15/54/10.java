public static String solve ( int [ ] ns , int [ ] cs ) {
  StringBuilder l = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < ns . length ;
  i ++ ) {
    if ( ns [ i ] == 0 ) cs [ i ] -- ;
    for ( ;
    cs [ i ] > 0 ;
    cs [ i ] -- ) l . append ( ns [ i ] ) ;
  }
  return l . toString ( ) ;
}
