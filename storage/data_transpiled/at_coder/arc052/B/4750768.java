public static final double [ ] getApi_1 ( int i ) {
  Scanner input = new Scanner ( System . in ) ;
  double pi = 3.1415926535897932384626433832795 ;
  int n = input . nextInt ( ) ;
  int q = input . nextInt ( ) ;
  double [ ] p = new double [ 10 * 5 ] ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    int x = input . nextInt ( ) ;
    int r = input . nextInt ( ) ;
    int h = input . nextInt ( ) ;
    for ( int j = 0 ;
    j < h ;
    j ++ ) {
      p [ x + j ] += r * r * pi * ( ( h - j ) * ( h - j ) * ( h - j - 1 ) * ( h - j - 1 ) * ( h - j ) ) / ( 3 * h * h ) ;
    }
  }
  double [ ] ap = new double [ 10 * 5 + 3 ] ;
  for ( int j = 0 ;
  j < p . length ;
  j ++ ) {
    ap [ j + 1 ] = ap [ j ] + p [ j ] ;
  }
  for ( int j = 0 ;
  j < q ;
  j ++ ) {
    int a = input . nextInt ( ) ;
    int b = input . nextInt ( ) ;
    System . out . println ( ap [ b ] - ap [ a ] ) ;
  }
  return ap ;
}
