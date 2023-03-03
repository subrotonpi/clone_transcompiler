public static void main ( String [ ] args ) {
  int d = input . nextInt ( ) ;
  HashMap < String , Integer > rems = new HashMap < String , Integer > ( ) ;
  rems . put ( "Sunday" , 0 ) ;
  rems . put ( "Monday" , 5 ) ;
  rems . put ( "Tuesday" , 4 ) ;
  rems . put ( "Wednesday" , 3 ) ;
  rems . put ( "Thursday" , 2 ) ;
  rems . put ( "Friday" , 1 ) ;
  rems . put ( "Saturday" , 0 ) ;
  System . out . println ( rems . get ( d ) ) ;
}
