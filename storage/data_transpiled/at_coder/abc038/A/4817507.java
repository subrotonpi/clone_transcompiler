public static String moji ( ) {
  String moji = input . nextLine ( ) ;
  List < String > moji_list = new LinkedList < String > ( ) ;
  moji_list . add ( moji ) ;
  if ( moji . charAt ( moji . length ( ) - 1 ) == 'T' ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return moji_list . toString ( ) ;
}
