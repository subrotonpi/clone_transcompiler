public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < 2 ;
  i ++ ) {
    a . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans = Math . max ( ans , Integer . valueOf ( a . get ( 0 ) . subList ( 0 , i + 1 ) . size ( ) + Integer . valueOf ( a . get ( 1 ) . subList ( i , i ) . size ( ) ) ) ) ;
  }
  System . out . println ( ans ) ;
}
