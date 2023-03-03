@ VisibleForTesting static void from ( Operator operator ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] red = new int [ n ] [ ] ;
  int [ ] [ ] blue = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    red [ i ] [ 0 ] = a ;
    red [ i ] [ 1 ] = b ;
    blue [ i ] [ 0 ] = min ( a , b ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    int d = Integer . parseInt ( input . nextLine ( ) ) ;
    blue [ i ] [ 1 ] = c ;
    blue [ i ] [ 0 ] = d ;
    blue [ i ] [ 1 ] = min ( c , d ) ;
  }
  Arrays . sort ( red , operator . getComparator ( ) ) ;
  Arrays . sort ( blue , operator . getComparator ( ) ) ;
  Set < Integer > redX = new HashSet < Integer > ( ) ;
  Set < Integer > redY = new HashSet < Integer > ( ) ;
  Set < Integer > blueX = new HashSet < Integer > ( ) ;
  Set < Integer > blueY = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < red . length ;
  i ++ ) {
    redX . add ( red [ i ] [ 0 ] ) ;
    redY . add ( red [ i ] [ 1 ] ) ;
  }
  for ( int i = 0 ;
  i < blue . length ;
  i ++ ) {
    blueX . add ( blue [ i ] [ 0 ] ) ;
    blueY . add ( blue [ i ] [ 1 ] ) ;
  }
  List < Integer > redKouho = new ArrayList < Integer > ( ) ;
  List < Integer > blueKouho = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < red . length ;
  i ++ ) {
    int rx = red [ i ] [ 0 ] ;
    int ry = red [ i ] [ 1 ] ;
    List < Integer > kouho = new ArrayList < Integer > ( ) ;
    for ( int j = 0 ;
    j < blue . length ;
    j ++ ) {
      int bx = blue [ i ] [ j ] ;
      if