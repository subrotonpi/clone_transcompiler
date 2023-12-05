public static void main ( String input ) {
  int A , B , C ;
  A = map ( Integer . parseInt , input . split ( " " ) ) ;
  int ans = 2 * ( A * B + B * C + C * A ) ;
  System . out . println ( ans ) ;
}
