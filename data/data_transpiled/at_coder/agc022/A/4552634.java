public static void input ( ) {
  if ( S . equals ( "zyxwvutsrqponmlkjihgfedcba" ) ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  HashMap < String , Integer > tmp = new HashMap < String , Integer > ( ) ;
  for ( char a : "abcdefghijklmnopqrstuvwxyz" . toCharArray ( ) ) {
    tmp . put ( a , 0 ) ;
  }
  for ( String s : S . toCharArray ( ) ) {
    tmp . put ( s , 1 ) ;
  }
  ArrayList < String > tmp2 = new ArrayList < String > ( ) ;
  if ( Arrays . asList ( tmp . values ( ) ) . contains ( 1 ) ) {
    for ( int i = S . length ( ) - 1 ;
    i > 0 ;
    i -- ) {
      tmp2 . add ( S . charAt ( i ) ) ;
      if ( S . charAt ( i - 1 ) < S . charAt ( i ) ) {
        tmp2 . clear ( ) ;
        tmp2 . addAll ( tmp2 ) ;
        System . out . println ( S . substring ( 0 , i - 1 ) + min ( tmp2 ) ) ;
        exit ( ) ;
      }
    }
  }
  else {
    for ( Map . Entry < String , Integer > e : tmp . entrySet ( ) ) {
      if ( e . getValue ( ) == 0 ) {
        tmp2 . add ( e . getKey ( ) ) ;
      }
    }
    System . out . println ( S + min ( tmp2 ) ) ;
  }
}
