public static int n ( ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = input . nextLine ( ) ;
  int cnt = 0 ;
  int ff = s . indexOf ( "." ) ;
  int cost = Math . max ( n - ff - k , 0 ) ;
  if ( ff == - 1 ) cost = 0 ;
  while ( s . length ( ) > k ) {
    ++ cnt ;
  }
  return cnt ;
}
