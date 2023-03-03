public static void input ( ) {
  String S = input ( ) ;
  List < String > num = Collections . singletonList ( String . valueOf ( 10 ) ) ;
  StringBuffer ans = new StringBuffer ( ) ;
  for ( String s : S ) {
    if ( num . contains ( s ) ) {
      ans . append ( s ) ;
    }
  }
  System . out . println ( ans ) ;
}
