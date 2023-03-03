public static void enter ( ) {
  n = Integer . parseInt ( input . readLine ( ) ) ;
  w = input . readLine ( ) ;
  s = new ArrayList < > ( ) ;
  s . add ( w ) ;
  int k = 1 ;
  for ( ;
  ;
  ) {
    int x = input . nextInt ( ) ;
    k ++ ;
    if ( s . contains ( x ) || x != w . charAt ( w . length ( ) - 1 ) ) {
      if ( k % 2 == 0 ) {
        System . out . println ( "WIN" ) ;
      }
      else {
        System . out . println ( "LOSE" ) ;
      }
      exit ( ) ;
    }
    else {
    }
  }
}
