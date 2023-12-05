public static int narrow_rectangles_easy ( @ Night int W , int a , int b ) {
  if ( a + W < b ) return b - ( a + W ) ;
  if ( b + W < a ) return a - ( b + W ) ;
  return 0 ;
}
if ( getClass ( ) . equals ( "org.apache.beam.sdk.util.Scanner" ) ) {
  W = Integer . parseInt ( input . nextLine ( ) ) ;
  a = Integer . parseInt ( input . nextLine ( ) ) ;
  b = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = narrow_rectangles_easy ( W , a , b ) ;
  System . out . println ( ans ) ;
}
