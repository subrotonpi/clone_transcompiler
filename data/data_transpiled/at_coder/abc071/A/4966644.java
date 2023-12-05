public static void print ( int x , int a , int b ) {
  for ( int n : input . split ( ) ) {
    System . out . println ( Math . abs ( x - a ) < Math . abs ( b - x ) ? 'A' : 'B' ) ;
  }
}
