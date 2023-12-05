public static int omote ( int omote , int ura ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ura >= k ) {
    System . out . println ( omote + k ) ;
  }
  else {
    System . out . println ( omote + ura - ( k - ura ) ) ;
  }
  return omote ;
}
