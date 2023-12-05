public static void main ( String [ ] args ) {
  int w = Integer . parseInt ( args [ 0 ] ) ;
  int h = Integer . parseInt ( args [ 1 ] ) ;
  int n = Integer . parseInt ( args [ 2 ] ) ;
  List < Integer > x1 = new ArrayList < > ( ) ;
  List < Integer > x2 = new ArrayList < > ( ) ;
  List < Integer > y3 = new ArrayList < > ( ) ;
  List < Integer > y4 = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( args [ i ] ) ;
    int y = Integer . parseInt ( args [ i ] ) ;
    int a = Integer . parseInt ( args [ i ] ) ;
    switch ( a ) {
      case 1 : x1 . add ( x ) ;
      break ;
      case 2 : x2 . add ( x ) ;
      break ;
      case 3 : y3 . add ( y ) ;
      break ;
      default : y4 . add ( y ) ;
      break ;
    }
  }
}
