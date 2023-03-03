public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  List < Integer > bo = Lists . newArrayList ( ) ;
  for ( int b : bo ) {
    ans += Math . min ( b , Math . abs ( b - k ) ) ;
  }
  System . out . println ( ans * 2 ) ;
}
