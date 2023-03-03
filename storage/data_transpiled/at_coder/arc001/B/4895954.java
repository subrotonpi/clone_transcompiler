@ Sys public static int from ( ) {
  String A , B ;
  A = in . readLine ( ) ;
  B = in . readLine ( ) ;
  int count = 0 ;
  int diff = Math . abs ( A - B ) ;
  count = 0 ;
  while ( ( diff != 0 ) ) {
    if ( diff >= 8 ) diff = Math . abs ( diff - 10 ) ;
    else diff = Math . abs ( diff - 5 ) ;
    else diff = diff - 1 ;
    count ++ ;
  }
  return count ;
}
