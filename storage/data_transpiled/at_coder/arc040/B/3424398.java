public static int N ( int R ) {
  String s = "." + input ;
  int pos = s . length ( ) - s . substring ( 0 , s . length ( ) - 1 ) ;
  int cost = Math . max ( 0 , pos - R ) ;
  while ( pos > 0 ) {
    pos = Math . max ( 0 , pos - R ) ;
    cost ++ ;
    while ( s . charAt ( pos ) != '.' ) pos -- ;
  }
  return cost ;
}
