public static boolean leapYear ( int y ) {
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  /*if (y % 400) return true;*/
  if ( y % 100 == 0 ) return false ;
  if ( y % 4 == 0 ) return true ;
  /*return false;*/
  Map < Integer , Integer > lims = new HashMap < Integer , Integer > ( ) ;
  lims . put ( 1 , 31 ) ;
  return true ;
}
