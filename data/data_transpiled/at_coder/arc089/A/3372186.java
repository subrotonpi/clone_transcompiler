public static int N = Integer . parseInt ( input ) {
  int st = 0 , sx = 0 , sy = 0 ;
  for ( ;
  ;
  ) {
    int t = Integer . parseInt ( input . readLine ( ) ) ;
    int x = Integer . parseInt ( input . readLine ( ) ) ;
    int y = Integer . parseInt ( input . readLine ( ) ) ;
    int dt = t - st ;
    int dr = Math . abs ( x - sx ) + Math . abs ( y - sy ) ;
    if ( ! ( dt >= dr && ( dt - dr ) % 2 == 0 ) ) {
      System . out . println ( "No" ) ;
      break ;
    }
  }
  else {
    System . out . println ( "Yes" ) ;
  }
  return N ;
}
