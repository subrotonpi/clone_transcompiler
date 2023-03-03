public static int N = Integer . parseInt ( input ) {
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] kuji = new String [ L ] ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    kuji [ i ] = input . nextLine ( ) ;
  }
  String atari = input . nextLine ( ) ;
  int aIdx = atari . indexOf ( 'o' ) ;
  int len = kuji . length ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    try {
      if ( kuji [ i ] . charAt ( aIdx - 1 ) == '-' ) {
        aIdx -= 2 ;
      }
      else if ( kuji [ i ] . charAt ( aIdx + 1 ) == '-' ) {
        aIdx += 2 ;
      }
    }
    catch ( StringIndexOutOfBoundsException e ) {
      continue ;
    }
  }
  if ( aIdx == 0 ) {
    System . out . println ( 1 ) ;
  }
  else if ( aIdx == 2 ) {
    System . out . println ( 2 ) ;
  }
  else {
    System . out . println ( aIdx / 2 + 1 ) ;
  }
  return L ;
}
