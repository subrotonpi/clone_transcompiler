public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < String >> x = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) x . add ( Collections . singletonList ( input . nextLine ( ) ) ) ;
  int p = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) p += Integer . parseInt ( x . get ( i ) . get ( 1 ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( Integer . parseInt ( x . get ( i ) . get ( 1 ) ) > p / 2 ) {
      System . out . println ( x . get ( i ) . get ( 0 ) ) ;
      exit ( ) ;
    }
  }
  else System . out . println ( "atcoder" ) ;
}
