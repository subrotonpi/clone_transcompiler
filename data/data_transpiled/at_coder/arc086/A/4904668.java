@ VisibleForTesting static int [ ] getCounts ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] As = Integer . parseInt ( input . nextLine ( ) ) ;
  Map < Integer , Integer > counts = new HashMap < > ( ) ;
  for ( int a : As ) counts . put ( a , 1 ) ;
  Arrays . sort ( counts . values ( ) ) ;
  if ( counts . size ( ) <= K ) {
    System . out . println ( 0 ) ;
  }
  else {
    int total = 0 ;
    for ( int i = 0 ;
    i < counts . size ( ) - K ;
    i ++ ) {
      total += counts . get ( i ) ;
    }
    System . out . println ( total ) ;
  }
  return counts . values ( ) . toArray ( ) ;
}
