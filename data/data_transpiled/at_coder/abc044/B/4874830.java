public static void input ( Scanner w ) {
  Map < String , Integer > dct_str = new HashMap < String , Integer > ( ) ;
  dct_str . put ( w . next ( ) , 0 ) ;
  for ( String alp : w ) {
    dct_str . put ( alp , 1 ) ;
  }
  boolean flag = true ;
  for ( String alp : dct_str . keySet ( ) ) {
    if ( dct_str . get ( alp ) % 2 != 0 ) {
      flag = false ;
    }
  }
  if ( flag == true ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
