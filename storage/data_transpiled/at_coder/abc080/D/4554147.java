@ Function public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] s = new int [ N ] ;
  int t = 0 ;
  int [ ] c = new int [ N ] ;
  Map < Integer , Set < Integer >> channels = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int si = Integer . parseInt ( input . nextLine ( ) ) ;
    int ti = Integer . parseInt ( input . nextLine ( ) ) ;
    int ci = s [ ti ] ;
    for ( t = si - 1 ;
    t < ti ;
    t ++ ) {
      channels . put ( t , ci ) ;
    }
  }
  int nRecorders = 0 ;
  for ( Integer t : channels . keySet ( ) ) {
    nRecorders = Math . max ( nRecorders , channels . get ( t ) . size ( ) ) ;
  }
  System . out . println ( nRecorders ) ;
}
