public static void main ( Scanner input ) {
  int N = input . nextInt ( ) ;
  List < Pair > As = new ArrayList < > ( ) , Bs = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int A = Integer . parseInt ( input . nextLine ( ) ) ;
    int B = Integer . parseInt ( input . nextLine ( ) ) ;
    As . add ( new Pair ( A , i ) ) ;
    Bs . add ( new Pair ( B , i ) ) ;
  }
  int ansA = Math . min ( ansA , N ) ;
  int ansB = Math . min ( ansB , N ) ;
  List < Pair > Cs = new ArrayList < > ( ) ;
  Cs . addAll ( As ) ;
  Cs . addAll ( Bs ) ;
  boolean [ ] useds = new boolean [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    useds [ i ] = false ;
  }
  int sumC = 0 ;
  for ( Pair C : Cs . subList ( 0 , N ) ) {
    useds [ i ] = true ;
    sumC += C ;
  }
}
