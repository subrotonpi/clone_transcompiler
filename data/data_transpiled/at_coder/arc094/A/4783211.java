public static int A = Integer . parseInt ( input ) {
  int wa = A + B + C ;
  int maxnum = Math . max ( A , B ) ;
  if ( wa % 2 == maxnum % 2 ) {
    System . out . println ( ( 3 * maxnum - wa ) / 2 ) ;
  }
  else {
    System . out . println ( ( 3 * ( maxnum + 1 ) - wa ) / 2 ) ;
  }
  return wa ;
}
