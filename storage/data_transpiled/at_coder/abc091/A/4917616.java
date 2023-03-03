public static void main ( String A , String B , String C ) {
  int i = map ( Integer . parseInt , input ( ) . split ( ) ) ;
  System . out . println ( [ "Yes" , "No" ] [ not ( C <= A + B ) ] ) ;
}
