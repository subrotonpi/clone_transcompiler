public static void main ( String [ ] args ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int d = Math . abs ( B - A ) ;
  int cnt = d / 10 ;
  d = d - ( d / 10 ) * 10 ;
  if ( d >= 5 ) {
    cnt += 1 + Math . min ( d - 5 , 10 - d ) ;
  }
  else if ( d > 0 ) {
    cnt += Math . min ( 1 + ( 5 - d ) , d ) ;
  }
  else {
  }
  System . out . println ( cnt + "" ) ;
}
