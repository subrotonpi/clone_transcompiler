static final Scanner input = new Scanner ( System . in ) {
  @ Override public void close ( ) {
  }
}
;
int N = Integer . parseInt ( input . nextLine ( ) ) ;
int ans = 0 ;
List < Integer > A = new ArrayList < > ( ) ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
}
