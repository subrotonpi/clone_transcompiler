public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < String >> s = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s . add ( Collections . singletonList ( input . nextLine ( ) ) ) ;
  }
  int c = 0 ;
  int d = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int k = Integer . parseInt ( s . get ( i ) . get ( 1 ) ) ;
    c += k ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( Integer . parseInt ( s . get ( i ) . get ( 1 ) ) > ( c / 2 ) ) {
      System . out . println ( s . get ( i ) . get ( 0 ) ) ;
      d ++ ;
      break ;
    }
  }
  if ( d == 0 ) {
    System . out . println ( "atcoder" ) ;
  }
}
