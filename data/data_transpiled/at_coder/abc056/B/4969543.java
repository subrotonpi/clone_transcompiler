public static int main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  a = Math . min ( a , b ) ;
  b = Math . max ( a , b ) ;
  return Math . max ( 0 , b - ( a + W ) ) ;
}
