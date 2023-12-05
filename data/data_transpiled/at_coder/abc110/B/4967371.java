public static void main ( String input , int n , int m , int x , int y ) {
  int [ ] xArray = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    xArray [ i ] = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
  }
  Arrays . sort ( xArray ) ;
  int [ ] yArray = new int [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    yArray [ i ] = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
  }
  Arrays . sort ( yArray ) ;
  boolean flag = false ;
  for ( int i = x + 1 ;
  i <= y ;
  i ++ ) {
    if ( xArray [ xArray . length - 1 ] < i && i <= yArray [ 0 ] ) {
      flag = true ;
      break ;
    }
  }
  if ( flag ) {
    System . out . println ( "No War" ) ;
  }
  else {
    System . out . println ( "War" ) ;
  }
}
