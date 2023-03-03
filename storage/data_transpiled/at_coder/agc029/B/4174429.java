) public static void input ( ) {
  int [ ] nbs = Ints . fromArray ( input ( ) . boxed ( ) . toArray ( ) ) ;
  int answer = 0 ;
  Map < Integer , Integer > count = new HashMap < > ( ) ;
  for ( int nb : nbs ) {
    count . put ( nb , count . get ( nb ) + 1 ) ;
  }
  for ( int nb : new ArrayList < > ( count . keySet ( ) ) ) {
    int searching = ( 1 << nb ) - nb ;
    int nbCount = count . get ( nb ) ;
    int srCount = count . get ( searching ) ;
    if ( srCount > 0 ) {
      int increment ;
      if ( nb == searching ) {
        increment = nbCount / 2 ;
      }
      else {
        increment = nbCount < srCount ? nbCount : srCount ;
        count . put ( searching , increment ) ;
      }
      answer += increment ;
    }
  }
  System . out . println ( answer ) ;
}
