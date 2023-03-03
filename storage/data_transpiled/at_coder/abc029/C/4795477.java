@ VisibleForTesting static Iterable < char [ ] > combinations ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  char [ ] [ ] charArray = new char [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    charArray [ i ] = new char [ N ] ;
  }
  for ( char [ ] i : charArray ) {
    char [ ] password = new char [ N ] ;
    for ( char j : i ) {
      password [ j ] = j ;
    }
    System . out . println ( password ) ;
  }
  return Arrays . asList ( charArray ) ;
}
