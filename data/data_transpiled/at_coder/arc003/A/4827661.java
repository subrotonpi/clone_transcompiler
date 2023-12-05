static final String getInput ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final String r = input . nextLine ( ) ;
  int sum = 0 ;
  sum += r . indexOf ( 'A' ) * 4 ;
  sum += r . indexOf ( 'B' ) * 3 ;
  sum += r . indexOf ( 'C' ) * 2 ;
  sum += r . indexOf ( 'D' ) * 1 ;
  return r ;
}
