public static void calculate ( ) {
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( c % w == 0 ) {
    return r * ( int ) ( c / w ) + w - 1 ;
  }
  else {
    return r * ( int ) ( c / w ) + w ;
  }
}
