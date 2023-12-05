public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  String [ ] A = input . split ( "\\s+" ) ;
  String ans ;
  if ( n == 1 ) {
    ans = A [ 0 ] ;
    System . out . println ( ans ) ;
    exit ( ) ;
  }
  else {
    String [ ] A_odd = A [ 0 ] . split ( "\\s+" ) ;
    String [ ] A_even = A [ 1 ] . split ( "\\s+" ) ;
    if ( n % 2 == 0 ) {
      ans = Arrays . copyOfRange ( A_even , 0 , A_odd . length ) + A_odd ;
    }
    else {
      ans = Arrays . copyOfRange ( A_odd , 0 , A_odd . length ) + A_even ;
    }
    System . out . println ( Arrays . toString ( ans ) ) ;
  }
}
