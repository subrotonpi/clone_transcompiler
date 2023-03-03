public static List < Integer > convert ( ) {
  List < Integer > list = Lists . newArrayList ( map ( Integer . parseInt , input ( ) ) ) ;
  return list . isEmpty ( ) ? "Yes" : new TreeSet < Integer > ( list ) . add ( list ) ;
}
