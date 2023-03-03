public static void X ( ) {
  String S = input ( ) ;
  StringBuffer newS = new StringBuffer ( ) ;
  for ( char c : S . toCharArray ( ) ) {
    if ( c != X ) {
      newS . append ( c ) ;
    }
  }
  System . out . println ( newS ) ;
}
