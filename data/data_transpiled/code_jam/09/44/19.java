static final double findMin ( String fileName ) throws IOException {
  String fileName = "D-small-attempt0.in" ;
  BufferedReader file = new BufferedReader ( new FileReader ( fileName ) ) ;
  int i = - 1 ;
  int j = 0 ;
  String string = "" ;
  int [ ] cases = new int [ 2 ] ;
  String [ ] cases = new String [ 2 ] ;
  for ( i = 0 ;
  i < cases . length ;
  i ++ ) {
    string = ( cases [ i ] - b [ 0 ] ) * ( a [ 0 ] - b [ 0 ] ) + ": " + findMin ( cases [ i ] - b [ 1 ] ) * ( a [ 1 ] - b [ 1 ] ) + "\n" ;
    z = z + 1 ;
  }
  file = new BufferedReader ( new FileReader ( fileName . substring ( 0 , 1 ) + ".out" ) ) ;
  file . write ( string . trim ( ) ) ;
  file . close ( ) ;
  int [ ] [ ] arr = new int [ 2 ] [ 2 ] ;
  while ( 0 < arr . length ) {
    int p = arr [ 0 ] [ 0 ] ;
    int j = arr [ 1 ] [ 0 ] ;
    while ( i < arr . length - 1 ) {
      int j = i + 1 ;
      while ( j < arr . length ) {
        int d = dst ( arr [ i ] , arr [ j ] ) ;
        if ( high [ 2 ] < d ) high = Arrays . binarySearch ( arr [ i ] , j , d ) ;
        j = j + 1 ;
      }
      i = i + 1 ;
    }
    print ( cases [ 0 ] ) ;
    print ( high ) ;
    return ( Math . sqrt ( high [ 2 ] ) + cases [ high [ 0 ] ] [ 2 ] + cases [ high [ 1 ] ] [ 2 ] ) / 2 ;
  }
  int [ ] [ ] findMin = new int [ 2 ] [ 2 ] ;
  int i = 0 ;
  int [ ] high = new int [ 2 ] ;
  int j = 0 ;
  String string = "" ;
  cases [ 0 ] = new String [ 2 ] ;
  for ( ;
  i < cases . length ;
  i ++ ) {
    cases [ i ] [ 0 ] = Integer . parseInt ( string . trim ( ) ) ;
    int N = Integer . parseInt ( string . trim ( ) ) ;
    i = N + 1 ;
  }
  for ( int j = 0 ;
  j < cases . length ;
  j ++ ) {
    cases