public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input ( ) ) ;
  String [ ] rr = input ( ) ;
  Map < String , Integer > pp = new HashMap < String , Integer > ( ) ;
  pp . put ( "A" , 4 ) ;
  pp . put ( "B" , 3 ) ;
  pp . put ( "C" , 2 ) ;
  pp . put ( "D" , 1 ) ;
  pp . put ( "F" , 0 ) ;
  int p = 0 ;
  for ( String r : rr ) {
    p += pp . get ( r ) ;
  }
  System . out . println ( p / n ) ;
}
