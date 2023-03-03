public static List < Integer > list ( ) {
  List < Integer > list = Lists . newArrayList ( map ( Integer :: parseInt , input ( ) ) ) ;
  Collections . sort ( list ) ;
  return list ;
}
