@ Sys public static void System ( ) {
  final Scanner sIn = new Scanner ( System . in ) ;
  final NumberReader dIn = new NumberReader ( System . in ) ;
  final NumberReader dsIn = new NumberReader ( System . in ) ;
  final int N = dIn . nextInt ( ) ;
  final List < List < Integer >> S_LIST = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final String s = Collections . getString ( sIn , i ) ;
    S_LIST . add ( Collections . singletonList ( new Integer ( s ) ) ) ;
  }
  Arrays . sort ( S_LIST ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final boolean check_array = Arrays . binarySearch ( S_LIST , i ) ;
    if ( Arrays . equals ( check_array , check_array ) ) ans ++ ;
  }
  System . out . println ( ans * N ) ;
}
