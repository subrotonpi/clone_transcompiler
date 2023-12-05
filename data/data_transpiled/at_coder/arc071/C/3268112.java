public static void input ( Scanner input ) {
  String S = input . next ( ) ;
  String T = input . next ( ) ;
  int [ ] ms = new int [ S . length ( ) ] ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == 'A' ) {
      ms [ i ] = ms [ i ] + 1 ;
    }
    else {
      ms [ i ] = ms [ i ] - 1 ;
    }
  }
  int [ ] mt = new int [ T . length ( ) ] ;
  for ( int i = 0 ;
  i < T . length ( ) ;
  i ++ ) {
    if ( T . charAt ( i ) == 'A' ) {
      mt [ i ] = mt [ i ] + 1 ;
    }
    else {
      mt [ i ] = mt [ i ] - 1 ;
    }
  }
  int q = Integer . parseInt ( input . next ( ) ) ;
  for ( ;
  ;
  ) {
    int a = Integer . parseInt ( input . next ( ) ) ;
    int b = Integer . parseInt ( input . next ( ) ) ;
    int c = Integer . parseInt ( input . next ( ) ) ;
    int d = Integer . parseInt ( input . next ( ) ) ;
    if ( ( ms [ b ] - ms [ a - 1 ] ) % 3 == ( mt [ d ] - mt [ c - 1 ] ) % 3 ) {
      System . out . println ( "YES" ) ;
    }
    else {
      System . out . println ( "NO" ) ;
    }
  }
}
