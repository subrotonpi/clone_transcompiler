static final int [ ] [ ] s ( int i ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] s = new int [ N ] [ ] ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    s [ j ] = input . nextInt ( ) ;
  }
  s = Arrays . copyOf ( s , s . length ) ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    System . out . println ( Arrays . toString ( s [ j ] ) ) ;
  }
  return s ;
}
