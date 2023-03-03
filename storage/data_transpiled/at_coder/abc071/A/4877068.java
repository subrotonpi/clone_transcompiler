public static void print ( int x , int a , int b ) {
  String ans = Integer . toString ( input ( ) . split ( " " ) [ 0 ] ) ;
  ans = Math . abs ( x - a ) < Math . abs ( x - b ) ? "A" : "B" ;
  System . out . println ( ans ) ;
}
