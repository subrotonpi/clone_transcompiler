public static int N = Integer . parseInt ( input ) {
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  String S = input . nextLine ( ) ;
  int [ ] AC_appearance = new int [ S . length ( ) ] ;
  int counter = 0 ;
  for ( int i = 1 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i - 1 ) == 'A' && S . charAt ( i ) == 'C' ) counter ++ ;
    AC_appearance [ i ] = counter ;
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int l , r ;
    l = Integer . parseInt ( input . nextLine ( ) ) ;
    r = Integer . parseInt ( input . nextLine ( ) ) ;
    l = l - 1 ;
    r = r - 1 ;
    System . out . println ( AC_appearance [ r ] - AC_appearance [ l ] ) ;
  }
  return 0 ;
}
