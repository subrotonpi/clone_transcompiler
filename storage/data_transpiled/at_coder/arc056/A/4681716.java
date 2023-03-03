static final int solve ( ) {
  Scanner input = new Scanner ( System . in ) ;
  int a = input . nextInt ( ) ;
  int b = input . nextInt ( ) ;
  int k = input . nextInt ( ) ;
  int l = input . nextInt ( ) ;
  int res = a * k ;
  if ( k % l == 0 ) res = b * k ;
  return res ;
}
