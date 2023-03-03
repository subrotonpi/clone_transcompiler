static final String solve ( ) throws IOException {
  final String input = "" ;
  final BufferedReader r = new BufferedReader ( new FileReader ( input ) ) ;
  final int n = Integer . parseInt ( r . readLine ( ) . toString ( ) ) ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    Arrays . fill ( text , r . readLine ( ) . toString ( ) ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + solve ( text ) ) ;
  }
  {
    final String welcome = "welcome to code jam" ;
    final int row = welcome . length ( ) ;
    final int col = text . length ( ) ;
    final int [ ] [ ] m = ones ( row , col ) ;
    final int n = dp ( m , welcome , text , 0 , 0 ) ;
    final String strn = strN ( n ) ;
    return ( strn ) ;
  }
  private int dp ( final int m , final String welcome , final String text , final int x , final int y ) {
    if ( ( x == welcome . length ( ) ) && ( y == text . length ( ) ) ) return ( 1 ) ;
    else if ( ( y == text . length ( ) ) && ( y == 0 ) ) return ( 0 ) ;
    else if ( m != - 1 ) return ( m ) ;
    else return ( m ) ;
  }
}
