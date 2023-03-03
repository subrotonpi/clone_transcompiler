public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int y = 0 ;
  y < a . length ;
  y ++ ) {
    int yCount = 0 ;
    for ( int x : a ) {
      yCount += ( x - y ) * ( x - y ) ;
    }
    count = Math . min ( count , yCount ) ;
  }
  return count ;
}
