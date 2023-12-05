public static void input ( ) {
  String S = input . readLine ( ) ;
  int [ ] alph = new int [ 26 ] ;
  for ( int index = 0 ;
  index < S . length ( ) ;
  index ++ ) {
    char i = S . charAt ( index ) ;
    int pointer = ( i - 'a' ) ;
    alph [ pointer ] ++ ;
  }
  if ( ( S . length ( ) == 26 ) && ( alph [ 0 ] == 0 ) ) {
    if ( ( S . equals ( "zyxwvutsrqponmlkjihgfedcba" ) ) ) {
      System . out . println ( - 1 ) ;
      exit ( ) ;
    }
    else {
      String old = "" ;
      for ( int i = S . length ( ) - 1 ;
      i >= 0 ;
      i -- ) {
        String s1 = S . substring ( i , i + 1 ) ;
        if ( i != 0 && s1 . compareTo ( old . substring ( old . length ( ) - 1 ) ) < 0 ) {
          String out = S . substring ( 0 , S . length ( ) - i - 1 ) + Math . min ( old . length ( ) , alph [ i ] ) ;
          System . out . println ( out ) ;
          exit ( ) ;
        }
        old += s1 ;
      }
    }
  }
  else {
    for ( int i = 0 ;
    i < 26 ;
    i ++ ) {
      if ( ( alph [ i ] == 0 ) && ( alph [ i ] == 0 ) ) {
        System . out . println ( S + ( char ) ( i + 'a' ) ) ;
        exit ( ) ;
      }
    }
  }
}
