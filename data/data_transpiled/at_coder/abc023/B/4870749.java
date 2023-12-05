public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  String S = input ;
  String tmp = "b" ;
  int flg = 1 ;
  int count = 0 ;
  if ( N % 2 == 0 ) {
    System . out . println ( - 1 ) ;
  }
  else {
    while ( tmp . length ( ) < N ) {
      switch ( flg ) {
        case 1 : tmp = "a" + tmp + "c" ;
        flg = 2 ;
        break ;
        case 2 : tmp = "c" + tmp + "a" ;
        flg = 3 ;
        break ;
        case 3 : tmp = "b" + tmp + "b" ;
        flg = 1 ;
        break ;
      }
      count ++ ;
    }
  }
  if ( S . equals ( tmp ) ) {
    System . out . println ( count ) ;
  }
  else {
    System . out . println ( - 1 ) ;
  }
}
