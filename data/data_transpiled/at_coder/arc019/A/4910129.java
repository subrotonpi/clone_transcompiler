public static void main ( String [ ] args ) {
  HashMap < String , String > chars = new HashMap < String , String > ( ) ;
  chars . put ( "O" , "0" ) ;
  chars . put ( "D" , "0" ) ;
  chars . put ( "I" , "1" ) ;
  chars . put ( "Z" , "2" ) ;
  chars . put ( "S" , "5" ) ;
  chars . put ( "B" , "8" ) ;
  String s = input . nextLine ( ) ;
  for ( Map . Entry < String , String > e : chars . entrySet ( ) ) {
    s = s . replace ( e . getKey ( ) , e . getValue ( ) ) ;
  }
  System . out . println ( s ) ;
}
