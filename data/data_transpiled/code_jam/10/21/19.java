private static int addDir ( HashMap < String , HashMap < String , Integer >> map , String dir ) throws IOException {
  int newDirs = 0 ;
  String [ ] dirs = dir . split ( "/" ) ;
  while ( dirs . length > 0 ) {
    if ( ! map . containsKey ( dirs [ 0 ] ) ) {
      newDirs ++ ;
      map . put ( dirs [ 0 ] , new HashMap < String , Integer > ( ) ) ;
    }
    map . clear ( ) ;
    map . remove ( dirs [ 0 ] ) ;
    dirs = dirs [ 1 ] . split ( "/" ) ;
  }
  return newDirs ;
}
