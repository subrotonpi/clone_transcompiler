public static int n ( int x ) {
  int [ ] xlist = Integer . parseInt ( input . nextLine ( ) ) . split ( " " ) ;
  List < Integer > disList = new ArrayList < Integer > ( ) ;
  for ( int y : xlist ) {
    disList . add ( Math . abs ( x - y ) ) ;
  }
  Arrays . sort ( disList ) ;
  /* go to the gcd */
  int gcd = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    gcd = Math . abs ( x - i ) ;
  }
  if ( gcd == 0 ) {
    return num1 ;
  }
  else {
    return goTo ( gcd , num1 % num2 ) ;
  }
}
