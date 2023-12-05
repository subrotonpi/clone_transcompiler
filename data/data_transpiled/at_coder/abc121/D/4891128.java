public static int getA ( ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int count1 = Math . max ( 0 , ( B + 1 ) / 2 - ( A + 1 ) / 2 ) ;
  int res = count1 % 2 ;
  if ( A % 2 == 1 ) res ^= A ;
  if ( B % 2 == 0 ) res ^= B ;
  System . out . println ( res ) ;
  return 0 ;
}
