public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  HashMap < Integer , ArrayList < String >> dic = new HashMap < Integer , ArrayList < String >> ( ) ;
  for ( int i = 1 ;
  i <= 10 ;
  i ++ ) {
    for ( int j = 1 ;
    j <= 10 ;
    j ++ ) {
      if ( dic . keySet ( ) . contains ( i * j ) ) {
        dic . get ( i * j ) . add ( String . valueOf ( i ) + " x " + String . valueOf ( j ) ) ;
      }
      else {
        dic . put ( i * j , new ArrayList < String > ( ) ) ;
      }
    }
  }
  ArrayList < String > ls = new ArrayList < String > ( dic . get ( 2025 - n ) ) ;
  Collections . sort ( ls ) ;
  for ( int i : ls ) {
    System . out . println ( i ) ;
  }
}
