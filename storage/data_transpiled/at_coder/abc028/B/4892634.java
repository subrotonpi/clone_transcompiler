public static String [ ] countList ( ) {
  String [ ] ansArray = new String [ countList . length ] ;
  LinkedList < String > S_list = new LinkedList < String > ( ) ;
  for ( int i = 0 ;
  i < countList . length ;
  i ++ ) ansArray [ i ] = S_list . stream ( ) . next ( ) ;
  String ans = Arrays . toString ( ansArray ) ;
  return ans ;
}
