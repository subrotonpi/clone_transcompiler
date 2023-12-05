public static void main ( String A , String B , String X ) {
  map ( Integer . parseInt ( input ( ) ) , A , B ) ;
  X = map ( Integer . parseInt ( input ( ) ) , B ) ;
  System . out . println ( A <= X && A + B >= X ? "YES" : "NO" ) ;
}
