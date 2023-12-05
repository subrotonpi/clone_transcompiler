static final Scanner input = new Scanner ( System . in ) {
  @ Override public void close ( ) throws IOException {
  }
}
;
final PrintWriter fout = new PrintWriter ( new BufferedWriter ( new OutputStreamWriter ( System . out ) ) ) ;
final int l = Integer . parseInt ( input . nextLine ( ) ) ;
for ( int testCase = 0 ;
testCase < l ;
testCase ++ ) {
  final String v = input . nextLine ( ) . trim ( ) ;
  final int alen = Integer . parseInt ( Collections . singleton ( v ) ) ;
  if ( alen < 2 ) {
    alen = 2 ;
  }
  int val = 0 ;
  final int [ ] mapping = new int [ alen ] ;
}
