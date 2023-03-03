public static final int [ ] getBinaryArray ( ) {
  Scanner input = new Scanner ( System . in ) ;
  int n = input . nextInt ( ) , h = input . nextInt ( ) ;
  int [ ] a = new int [ n ] ;
  int [ ] b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = input . nextInt ( ) ;
    int y = input . nextInt ( ) ;
    a [ i ] = x ;
    b [ i ] = y ;
  }
  Arrays . sort ( a ) ;
  Arrays . sort ( b ) ;
  int aMax = a [ 0 ] ;
  int bNage = b [ 0 ] ;
  int count = 0 ;
  for ( int i = 0 ;
  i < bNage ;
  i ++ ) {
    h -= bNage [ i ] ;
    count ++ ;
    if ( h <= 0 ) {
      System . out . println ( count ) ;
      exit ( ) ;
    }
  }
  count += - ( - h / aMax ) ;
  return a ;
}
