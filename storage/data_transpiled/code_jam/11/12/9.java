static final Comparator < String > sim = new Comparator < String > ( ) {
  @ Override public int compare ( String word , String [ ] d , String [ ] ls ) {
    Arrays . sort ( d , ls ) ;
    String seen = "" ;
    int score = 0 ;
    for ( String l : ls ) {
      Pattern rep ;
      if ( seen . equals ( "" ) ) rep = Pattern . compile ( "." ) ;
      else rep = Pattern . compile ( "[^" + ( seen ) + "]" ) ;
      String wc = word . replaceAll ( rep . pattern , " " ) ;
      for ( String w : d ) {
        if ( w . contains ( l ) && w . replaceAll ( rep . pattern , " " ) . equals ( wc ) ) break ;
      }
      else continue ;
      seen += l ;
      if ( ! word . equals ( l ) ) score ++ ;
    }
    return score ;
  }
}
