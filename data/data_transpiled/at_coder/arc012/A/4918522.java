public static void input ( ) {
  String s = input ( ) ;
  HashMap tbl = new HashMap ( ) ;
  tbl . put ( "Sunday" , 0 ) ;
  tbl . put ( "Monday" , 5 ) ;
  tbl . put ( "Tuesday" , 4 ) ;
  tbl . put ( "Wednesday" , 3 ) ;
  tbl . put ( "Thursday" , 2 ) ;
  tbl . put ( "Friday" , 1 ) ;
  tbl . put ( "Saturday" , 0 ) ;
  int result = tbl . get ( s ) ;
  System . out . println ( result ) ;
}
