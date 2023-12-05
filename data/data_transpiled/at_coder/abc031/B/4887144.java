public static int L = Integer . parseInt ( input ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] l = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) l [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < l . length ;
  i ++ ) {
    if ( l [ i ] > H ) System . out . println ( "-1" ) ;
    else System . out . println ( Math . max ( 0 , L - l [ i ] ) ) ;
  }
  return L ;
}
