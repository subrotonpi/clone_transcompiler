public static int N = Integer . parseInt ( input ) {
  Scanner S = new Scanner ( System . in ) ;
  int R = S . nextInt ( ) ;
  int G = S . nextInt ( ) ;
  int B = S . nextInt ( ) ;
  return R % 2 + G % 2 + B % 2 ;
}
