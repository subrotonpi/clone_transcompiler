public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] P = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P [ i ] = Integer . parseInt ( input ) ;
  }
  int [ ] Index = new int [ N ] ;
  Set < Integer > Used = new HashSet < Integer > ( ) ;
  int [ ] Chain = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Chain [ i ] = 1 ;
  }
}
