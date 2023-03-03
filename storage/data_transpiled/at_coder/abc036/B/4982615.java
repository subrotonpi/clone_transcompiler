public static String [ ] [ ] getStrings ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] [ ] l = new String [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    l [ i ] = new String [ N ] ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    StringBuffer sb = new StringBuffer ( ) ;
    for ( int j = N ;
    j >= 0 ;
    j -- ) {
      sb . append ( l [ j ] [ i ] ) ;
    }
    System . out . println ( sb ) ;
  }
  return l ;
}
