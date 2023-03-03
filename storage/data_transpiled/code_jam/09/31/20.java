@ String fileIn = "A.in" ;
String fileout = "A.out" ;
{
  StringBuilder sb = new StringBuilder ( ) ;
  for ( char c : row ) {
    if ( ! ( sb . toString ( ) . contains ( c ) ) ) {
      sb . append ( c ) ;
    }
  }
  int base = Math . max ( 2 , sb . toString ( ) . length ( ) ) ;
  int [ ] trans = {
    1 , 0 }
    ;
    for ( int i = 2 ;
    i < base ;
    i ++ ) {
      trans [ i ] = 1 ;
    }
    Map < Integer , Integer > map = new HashMap < > ( ) ;
    for ( int i = 0 ;
    i < trans . length ;
    i ++ ) {
      map . put ( i , trans [ i ] ) ;
    }
    int [ ] digits = new int [ base ] ;
    for ( int i = 0 ;
    i < digits . length ;
    i ++ ) {
      digits [ i ] = map . get ( i ) ;
    }
    int N = data [ 0 ] ;
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      String text = "Case #" + ( i + 1 ) + ": " + solve ( data [ i ] ) ;
      dataOut . write ( text + '\n' ) ;
      System . out . println ( text ) ;
    }
    dataOut . close ( ) ;
    System . out . println ( "Wrote " + fileout ) ;
  }
  