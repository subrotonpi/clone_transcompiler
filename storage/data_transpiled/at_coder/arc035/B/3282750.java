static final Scanner getScanner ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] a = new int [ N ] ;
  for ( int i = 2 ;
  i < a . length ;
  i ++ ) a [ i ] = ( int ) i ;
  final Counter counter = new Counter ( a ) ;
  final int mod = 10 * 9 + 7 ;
  long ans = 1 ;
  for ( final int v : counter . values ( ) ) ans = ( ans * facmod ( v ) ) ;
  return new Scanner ( ) {
  }
  ;
}
