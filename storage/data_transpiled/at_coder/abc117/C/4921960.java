public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > X = new ArrayList < Integer > ( Collections . nCopies ( M , N ) ) ;
  X . add ( X . get ( 0 ) ) ;
  if ( N >= M ) {
    System . out . println ( 0 ) ;
  }
  else {
    List < Integer > sa = new ArrayList < Integer > ( ) ;
    for ( int i = 0 ;
    i < M - 1 ;
    i ++ ) {
      sa . add ( X . get ( i + 1 ) - X . get ( i ) ) ;
    }
    System . out . println ( Arrays . toString ( sa . subList ( 0 , M - N ) ) ) ;
  }
  return N ;
}
