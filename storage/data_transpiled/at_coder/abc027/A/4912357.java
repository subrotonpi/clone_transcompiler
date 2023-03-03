public static int [ ] l ( ) {
  l = list ( map ( input ) ) ;
  int i = Arrays . stream ( l ) . mapToInt ( Integer :: valueOf ) . toArray ( ) ;
  return l ;
}
