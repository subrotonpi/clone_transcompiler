@ Function public static LinkedList < Integer > inpl ( ) {
  return Lists . newArrayList ( ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > A = inpl ( ) ;
  int [ ] oe = {
    0 , 0 }
    ;
    for ( Map . Entry < Integer , Integer > e : A . entrySet ( ) ) {
      oe [ e . getValue ( ) % 2 ] ++ ;
    }
    if ( oe [ 0 ] % 2 == 0 ) {
      System . out . println ( Arrays . toString ( oe ) ) ;
    }
    else {
      System . out . println ( Arrays . toString ( oe ) - 1 ) ;
    }
    return A ;
  }
  