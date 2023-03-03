public static int N ( int N , int A , int B ) {
  int now = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String s = input . nextLine ( ) ;
    String d = input . nextLine ( ) ;
    if ( s . equals ( "East" ) ) {
      if ( Integer . parseInt ( d ) < A ) now += A ;
      else if ( Integer . parseInt ( d ) > B ) now += B ;
      else now += Integer . parseInt ( d ) ;
    }
    else {
      if ( Integer . parseInt ( d ) < A ) now -= A ;
      else if ( Integer . parseInt ( d ) > B ) now -= B ;
      else now -= Integer . parseInt ( d ) ;
    }
  }
  if ( now > 0 ) System . out . println ( "East" + " " + now ) ;
  else if ( now < 0 ) System . out . println ( "West" + " " + Math . abs ( now ) ) ;
  else System . out . println ( 0 ) ;
  return 0 ;
}
