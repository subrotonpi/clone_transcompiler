public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < String > S = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    S . add ( input ) ;
  }
  Map < Character , Integer > alphabetMap = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) {
    alphabetMap . put ( ( char ) ( 97 + i ) , 100 ) ;
  }
  for ( String s : S ) {
    Map < Character , Integer > temp = new HashMap < > ( ) ;
    for ( int i = 0 ;
    i < 26 ;
    i ++ ) {
      temp . put ( ( char ) ( 97 + i ) , 0 ) ;
    }
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      temp . put ( s . charAt ( i ) , 1 ) ;
    }
    for ( Character key : alphabetMap . keySet ( ) ) {
      if ( alphabetMap . get ( key ) > temp . get ( key ) ) {
        alphabetMap . put ( key , temp . get ( key ) ) ;
      }
    }
  }
  String result = "" ;
  List < Character > alphabet = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) {
    alphabet . add ( ( char ) ( 97 + i ) ) ;
  }
  for ( Character item : alphabet ) {
    for ( int i = 0 ;
    i < alphabetMap . get ( item ) ;
    i ++ ) {
      result += item ;
    }
  }
  if ( result . equals ( "" ) ) {
    System . out . println ( "\n" ) ;
  }
  else {
    System . out . println ( result ) ;
  }
}
