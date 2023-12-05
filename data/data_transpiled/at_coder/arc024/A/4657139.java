public static void main ( String [ ] args ) {
  L = Integer . parseInt ( input . nextLine ( ) ) ;
  R = Integer . parseInt ( input . nextLine ( ) ) ;
  L = L . split ( " " ) ;
  R = R . split ( " " ) ;
  int res = 0 ;
  for ( int i = 10 ;
  i < 41 ;
  i ++ ) {
    res += Math . min ( left . count ( i ) , right . count ( i ) ) ;
  }
  System . out . println ( res ) ;
}
