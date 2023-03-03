public static void main ( String input , int A , int B , int C ) {
  int ans = map ( Integer . parseInt , input . split ( " " ) ) ;
  ans = min ( C , B / A ) ;
  System . out . println ( ans ) ;
}
