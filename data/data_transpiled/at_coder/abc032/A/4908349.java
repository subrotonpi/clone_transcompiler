public static void main ( ) {
  int a = Integer . parseInt ( input ( ) ) ;
  int b = Integer . parseInt ( input ( ) ) ;
  int c = Integer . parseInt ( input ( ) ) ;
  final int x = a * b / MathUtils . gcd ( a , b ) ;
  System . out . println ( - ( - c / x ) * x ) ;
}
