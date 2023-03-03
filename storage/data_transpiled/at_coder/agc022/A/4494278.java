public static String input ( ) {
  final String S = input ( ) ;
  if ( S . equals ( "zyxwvutsrqponmlkjihgfedcba" ) ) {
    System . out . println ( - 1 ) ;
    System . exit ( 0 ) ;
  }
  final List < Character > atoz = Lists . newArrayList ( ) ;
  atoz . add ( chr ( 97 ) ) ;
  atoz . add ( chr ( 123 ) ) ;
  final Map < String , Integer > charmap = Maps . newHashMap ( ) ;
  for ( char c : atoz ) {
    charmap . put ( c , 0 ) ;
  }
  for ( String s : S ) {
    charmap . put ( s , 1 ) ;
  }
  int flag = 0 ;
  for ( char c : atoz ) {
    if ( charmap . get ( c ) == 0 ) {
      flag = 1 ;
      S = S + c ;
      break ;
    }
  }
  if ( flag == 0 ) {
    int index = 0 ;
    for ( int i = 0 ;
    i < S . length ( ) - 1 ;
    i ++ ) {
      if ( S . charAt ( S . length ( ) - 1 - i ) > S . charAt ( S . length ( ) - 2 - i ) ) {
        index = - 2 - i ;
        break ;
      }
    }
    List < String > tmp = new ArrayList < String > ( Lists . newArrayList ( S . substring ( index + 1 ) ) ) ;
    for ( String t : tmp ) {
      if ( t . compareTo ( S . charAt ( index ) ) > 0 ) {
        S = S . substring ( 0 , index ) + t ;
        break ;
      }
    }
  }
  System . out . println ( S ) ;
  return S ;
}
