public static void main ( String [ ] args ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a < 0 && b > 0 ) {
    System . out . println ( b - a - 1 ) ;
  }
  else {
    System . out . println ( Math . abs ( b - a ) ) ;
  }
  if ( Class . isPrimitive ( ) ) {
    Class c = Class . forName ( "com.android.internal.R$primitive" ) ;
    System . out . println ( c ) ;
  }
}
