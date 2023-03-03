public static String print ( int sx , int sy , int tx , int ty ) {
  int [ ] [ ] route = new int [ 2 ] [ 2 ] ;
  int y = ty - sy ;
  int x = tx - sx ;
  route [ 0 ] [ 0 ] = "U" ;
  return route [ 0 ] [ 1 ] ;
}
