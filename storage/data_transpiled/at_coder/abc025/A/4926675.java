public static String string25 ( @ NonNull String S , int N ) {
  List < String > sortedS = new ArrayList < > ( S ) ;
  Collections . sort ( sortedS ) ;
  int count = 1 ;
  for ( String c1 : sortedS ) {
    for ( String c2 : sortedS ) {
      if ( count == N ) {
        return c1 + c2 ;
      }
      count ++ ;
    }
  }
  return "hoge" ;
}
