public static int N = Integer . parseInt ( input ) {
  String S = input . nextLine ( ) ;
  int count = 0 ;
  String kouho = "b" ;
  while ( true ) {
    if ( kouho . equals ( S ) ) {
      System . out . println ( count ) ;
      break ;
    }
    kouho = "a" + kouho + "c" ;
    count ++ ;
    if ( kouho . equals ( S ) ) {
      System . out . println ( count ) ;
      break ;
    }
    kouho = "c" + kouho + "a" ;
    count ++ ;
    if ( kouho . equals ( S ) ) {
      System . out . println ( count ) ;
      break ;
    }
    kouho = "b" + kouho + "b" ;
    count ++ ;
    if ( kouho . equals ( S ) ) {
      System . out . println ( count ) ;
      break ;
    }
    if ( count > N ) {
      System . out . println ( - 1 ) ;
      break ;
    }
  }
  return count ;
}
