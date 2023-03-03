public static int N = Integer . parseInt ( input ) {
  Scanner s = new Scanner ( System . in ) ;
  int r = s . nextInt ( ) ;
  int g = s . nextInt ( ) ;
  int b = s . nextInt ( ) ;
  return r % 2 + g % 2 + b % 2 ;
}
