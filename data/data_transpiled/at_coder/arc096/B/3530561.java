public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] x = new int [ n ] , v = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    x [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    v [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] ss = new int [ n ] , sr = new int [ n ] ;
  ss [ 0 ] = v [ 0 ] - x [ 0 ] ;
  sr [ 0 ] = v [ n - 1 ] - c + x [ n - 1 ] ;
  int [ ] mx = new int [ n ] , mxr = new int [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    ss [ i + 1 ] = ss [ i ] + v [ i + 1 ] - x [ i + 1 ] + x [ i ] ;
    sr [ i + 1 ] = sr [ i ] + v [ n - i - 2 ] - x [ n - i - 1 ] + x [ n - i - 2 ] ;
    mx [ i + 1 ] = Math . max ( mx [ i ] , ss [ i + 1 ] ) ;
    mxr [ i + 1 ] = Math . max ( mxr [ i ] , sr [ i + 1 ] ) ;
  }
  int r1 = Math . max ( 0 , mx [ n - 1 ] ) , r2 = Math . max ( 0 , mxr [ n - 1 ] ) ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    r1 = Math . max ( r1 , sr [ i ] + mx [ n - i - 2 ] - c + x [ n - i - 1 ] ) ;
    r2 = Math . max ( r2 , ss [ i ] + mxr [ n - i - 2 ] - x [ i ] ) ;
  }
  System . out . println ( Math . max ( r1 , r2 ) ) ;
}
