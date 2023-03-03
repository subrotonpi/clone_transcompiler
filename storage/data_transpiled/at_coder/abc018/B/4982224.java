public static String [ ] s ( ) {
  s = Arrays . stream ( input . split ( " " ) ) . map ( Integer :: valueOf ) . toArray ( String [ ] :: new ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s [ r ] = s [ l - i ] ;
  }
  String ans = "" ;
  for ( String i : s ) {
    ans += i ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
