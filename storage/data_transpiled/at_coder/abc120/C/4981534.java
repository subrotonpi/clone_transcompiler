public static void main ( String className ) {
  if ( className . equals ( "java.util.Scanner" ) ) {
    String string = input . nextLine ( ) ;
    int zeroCount = string . indexOf ( '0' ) ;
    int oneCount = string . indexOf ( '1' ) ;
    System . out . println ( Math . min ( zeroCount , oneCount ) * 2 ) ;
  }
}
