public static List < Integer > solve ( ) {
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i : input . split ( " " ) ) {
    if ( Arrays . binarySearch ( A , i ) < 0 ) {
      A . forEach ( x -> System . out . println ( x * x ) ) ;
    }
    else {
      System . out . println ( 0 ) ;
    }
  }
  return A ;
}
