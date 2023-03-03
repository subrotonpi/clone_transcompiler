@ MoreRequires public static String input ( ) {
  int K = Integer . parseInt ( input ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( String s : input ( ) . split ( " " ) ) {
    A . add ( Integer . parseInt ( s ) ) ;
  }
  List < Integer > R = Lists . newArrayList ( ) ;
  for ( Integer acc : A ) {
    R . add ( ( acc > acc ) ? acc : ( a * ceil ( acc / a ) ) ) ;
  }
  String ans = R . get ( 0 ) > R . get ( 1 ) ? - 1 : StringUtils . join ( R , str ) ;
  System . out . println ( ans ) ;
}
