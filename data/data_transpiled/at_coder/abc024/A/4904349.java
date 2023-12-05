public static void main ( String a , String b , String c , int k ) {
  Arrays . sort ( input . split ( " " ) ) ;
  Arrays . sort ( input . split ( " " ) ) ;
  int s = input . split ( " " ) . length ;
  int t = input . split ( " " ) . length ;
  int price = 0 ;
  if ( s + t >= k ) {
    price -= ( s + t ) * c ;
  }
  price += s * a + t * b ;
  System . out . println ( price ) ;
}
