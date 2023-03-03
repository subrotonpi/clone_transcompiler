public static int getDigit ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int nim = 0 ;
  for ( ;
  ;
  ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    int z = Integer . parseInt ( input . nextLine ( ) ) ;
    int m = Integer . parseInt ( input . nextLine ( ) ) ;
    int xmin = 10 * 16 ;
    int ymin = 10 * 16 ;
    int zmin = 10 * 16 ;
    int xmax = 0 ;
    int ymax = 0 ;
    int zmax = 0 ;
    for ( ;
    ;
    ) {
      int a = Integer . parseInt ( input . nextLine ( ) ) ;
      int b = Integer . parseInt ( input . nextLine ( ) ) ;
      int c = Integer . parseInt ( input . nextLine ( ) ) ;
      xmin = Math . min ( xmin , a ) ;
      xmax = Math . max ( xmax , a ) ;
      ymin = Math . min ( ymin , b ) ;
      ymax = Math . max ( ymax , b ) ;
      zmin = Math . min ( zmin , c ) ;
      zmax = Math . max ( zmax , c ) ;
    }
    int xup = xmin ;
    int xdo = x - xmax - 1 ;
    int yup = ymin ;
    int ydo = y - ymax - 1 ;
    int zup = zmin ;
    int zdo = z - zmax - 1 ;
    nim = nim ^ xup ^ xdo ^ yup ^ ydo ^ zup ^ zdo ;
  }
  if ( nim != 0 ) {
    System . out . println ( "WIN" ) ;
  }
  else {
    System . out . println ( "LOSE" ) ;
  }
  return nim ;
}
