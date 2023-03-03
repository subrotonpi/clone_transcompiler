public static void print ( int x , int width , int space ) {
  int N = 0 ;
  if ( x < width + space ) {
    System . out . println ( "0" ) ;
  }
  else {
    int total_space = width + ( space ) ;
    N = ( x - space ) / total_space ;
  }
  System . out . println ( N ) ;
}
