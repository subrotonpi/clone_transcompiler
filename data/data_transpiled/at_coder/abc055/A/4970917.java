public static int main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int x = 800 * N ;
  final int y = 200 * ( N / 15 ) ;
  return x - y ;
}
