static final LinkedHashMap < Integer , Integer > getLetter ( ) {
  final LinkedHashMap < Integer , Integer > letter = new LinkedHashMap < > ( ) ;
  letter . put ( input ( ) , 1 ) ;
  int counter = 0 ;
  for ( int v : letter . values ( ) ) {
    if ( v % 2 == 1 ) {
      counter ++ ;
      break ;
    }
  }
  return counter == 0 ? new LinkedHashMap < > ( ) : new LinkedHashMap < > ( ) ;
}
