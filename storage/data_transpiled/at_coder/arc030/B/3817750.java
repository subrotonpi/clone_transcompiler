public static int dfs ( int n , Integer before ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] H = new int [ N ] ;
  for ( int i = 0 ;
  i < H . length ;
  i ++ ) H [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> AB = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) AB . add ( new LinkedList < Integer > ( ) ) ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    AB . add ( new LinkedList < Integer > ( ) ) ;
  }
  Set < Set < Integer >> s = new HashSet < > ( ) ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    s . add ( new HashSet < Integer > ( ) ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    s . add ( new HashSet < Integer > ( ) ) ;
  }
  return s . size ( ) ;
}
