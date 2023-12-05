public static int N = Integer . parseInt ( input ) {
  String s = input . nextLine ( ) ;
  int len = s . length ( ) + 1 ;
  char [ ] ans = new char [ len ] ;
  for ( int i = 0 , j = 0 ;
  i < len ;
  i ++ , j ++ ) {
    ans [ i ] = i ;
    ans [ j ] = 'S' ;
    for ( int si = 0 ;
    si < len ;
    si ++ ) {
      if ( ans [ ans . length - 1 ] == 'S' ) {
        if ( si == 'o' ) ans [ j ] = ans [ ans . length - 2 ] ;
        else ans [ j ] = 'W' ;
      }
      else {
        if ( si == 'o' ) ans [ j ] = 'W' ;
        else ans [ j ] = 'S' ;
      }
    }
    if ( len > 2 ) {
      System . out . println ( new String ( ans , 0 , len - 2 ) ) ;
      break ;
    }
  }
  else {
    System . out . println ( - 1 ) ;
  }
  return N ;
}
