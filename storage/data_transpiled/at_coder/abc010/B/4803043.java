public static void print ( int ren ) {
  String [ ] hanaar = String . valueOf ( input . nextLine ( ) ) . split ( "\\s+" ) ;
  int su = 0 ;
  for ( int num = 0 ;
  num < ren ;
  num ++ ) {
    int nu = Integer . parseInt ( hanaar [ num ] ) ;
    for ( int i = 0 ;
    i < nu ;
    i ++ ) {
      if ( nu % 2 == 0 ) {
        nu = nu - 1 ;
        su = su + 1 ;
      }
      else if ( nu > 2 && ( nu - 2 ) % 3 == 0 ) {
        nu = nu - 1 ;
        su = su + 1 ;
      }
      else {
        break ;
      }
    }
  }
  System . out . println ( su ) ;
}
