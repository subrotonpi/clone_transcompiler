public static void print ( String s , String t ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = input . nextLine ( ) ;
  String t = input . nextLine ( ) ;
  int l = s . length ( ) + t . length ( ) ;
  for ( int i = n ;
  i > 0 ;
  i -- ) {
    if ( s . contains ( t . substring ( 0 , i ) ) ) {
      System . out . println ( l - i ) ;
      break ;
    }
  }
  else {
    System . out . println ( l ) ;
  }
}
