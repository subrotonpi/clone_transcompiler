public static void print ( int x , int a , int b ) {
  String ans = "B" ;
  if ( Math . abs ( x - a ) < Math . abs ( x - b ) ) {
    ans = "A" ;
  }
  System . out . println ( ans ) ;
}
