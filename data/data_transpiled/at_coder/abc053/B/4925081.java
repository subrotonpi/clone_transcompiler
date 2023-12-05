public static void input ( ) {
  s = input ( ) ;
  a = Arrays . copyOf ( s , s . length ( ) ) ;
  z = Arrays . copyOf ( s , s . length ( ) ) ;
  z . sort ( ) ;
  System . out . println ( z [ z . length - 1 ] - a [ 0 ] + 1 ) ;
}
