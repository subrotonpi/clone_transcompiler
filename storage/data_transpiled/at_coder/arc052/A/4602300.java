public static String input ( ) {
  String S = input ( ) ;
  List < String > numbers = Collections . singletonList ( String . valueOf ( 10 ) ) ;
  StringBuffer ans = new StringBuffer ( ) ;
  for ( String string : S ) {
    if ( numbers . contains ( string ) ) {
      ans . append ( string ) ;
    }
  }
  return ans . toString ( ) ;
}
