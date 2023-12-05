static private int [ ] [ ] color ( int N , List < List < Integer >> rooms ) throws IOException {
  int smallestRoom = Math . min ( rooms . size ( ) , N ) ;
  print ( smallestRoom , rooms ) ;
  for ( int numColors : xrange ( smallestRoom , 0 , - 1 ) ) {
    for ( List < Integer > coloring : new ArrayList < > ( ) ) {
      if ( new TreeSet < > ( ) . addAll ( coloring ) . size ( ) != N ) continue ;
      for ( List < Integer > room : rooms ) {
        if ( new TreeSet < > ( ) . addAll ( coloring ) . size ( ) != numColors ) break ;
      }
      else {
        print ( coloring , numColors ) ;
        return coloring . toArray ( new Integer [ numColors ] ) ;
      }
    }
  }
  return new int [ ] [ ] {
    {
      N , M }
    }
    ;
  }
  