public static void main ( String [ ] args ) {
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] a = new int [ n ] ;
  final int [ ] b = new int [ n ] ;
  int ma ;
  if ( n % 2 != 0 ) {
    ma = n ;
  }
  else {
    ma = n + 1 ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = 1 ;
    j <= n ;
    j ++ ) {
      if ( i + j != ma && i < j ) {
        a [ i ] = i ;
        b [ j ] = j ;
      }
    }
  }
  System . out . println ( a . length ) ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < b . length ;
    j ++ ) {
      if ( a [ i ] < b [ j ] ) {
        System . out . println ( a [ i ] + " " + b [ j ] ) ;
      }
    }
  }
  if ( getClass ( ) . equals ( "java.util.Arrays" ) ) {
    System . out . println ( " " + Arrays . toString ( a ) ) ;
  }
}
