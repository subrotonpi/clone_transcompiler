public static int [ ] [ ] [ ] A , B = map ( input -> {
  if ( Math . abs ( A - B ) <= 1 ) {
    System . out . println ( "Yay!" ) ;
  }
  else {
    System . out . println ( ":(" ) ;
  }
  return new int [ ] [ ] {
    A , B }
    ;
  }
  