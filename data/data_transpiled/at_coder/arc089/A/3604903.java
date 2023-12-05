public static void main ( String input ) {
  int N = Integer . parseInt ( input . trim ( ) ) ;
  int [ ] t = new int [ N ] ;
  int [ ] x = new int [ N ] ;
  int [ ] y = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int tm = Integer . parseInt ( input . trim ( ) ) ;
    int xm = Integer . parseInt ( input . trim ( ) ) ;
    int ym = Integer . parseInt ( input . trim ( ) ) ;
    t [ i ] = tm ;
    x [ i ] = xm ;
    y [ i ] = ym ;
  }
  int tn = 0 ;
  int xn = 0 ;
  int yn = 0 ;
  boolean fl = true ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    tn = t [ i ] - tn ;
    xn = x [ i ] - xn ;
    yn = y [ i ] - yn ;
    if ( tn < Math . abs ( xn ) + Math . abs ( yn ) || tn % 2 != ( xn + yn ) % 2 ) {
      fl = false ;
      break ;
    }
  }
  if ( fl ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
