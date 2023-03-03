public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] A = new int [ N ] [ N ] ;
  for ( int a = 0 ;
  a < N ;
  a ++ ) {
    A [ a ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] [ ] B = new int [ N ] [ N ] ;
  for ( int b = 0 ;
  b < N ;
  b ++ ) {
    B [ b ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] [ ] C = new int [ N ] [ N ] ;
  for ( int c = 0 ;
  c < N ;
  c ++ ) {
    C [ c ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] parts = A ;
  Arrays . sort ( parts , new Comparator < String > ( ) {
    @ Override public int compare ( String s , String s ) {
      return s . compareTo ( "C" ) ;
    }
  }
  ) ;
  Arrays . sort ( parts , new Comparator < String > ( ) {
    @ Override public int compare ( String s , String s ) {
      return s . compareTo ( "B" ) ;
    }
  }
  ) ;
  return 0 ;
}
