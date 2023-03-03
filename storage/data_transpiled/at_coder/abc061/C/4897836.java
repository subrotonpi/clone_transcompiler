public static void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int K = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Pair < Integer , Integer >> A = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int a = Integer . parseInt ( input . nextLine ( ) ) ;
    final int b = Integer . parseInt ( input . nextLine ( ) ) ;
    A . add ( new Pair < > ( a , b ) ) ;
  }
  final List < Pair < Integer , Integer >> sorted = new ArrayList < > ( A ) ;
  Collections . sort ( sorted ) ;
  int cnt = 0 ;
  for ( final Pair < Integer , Integer > pair : sorted ) {
    cnt += pair . second ;
    if ( cnt >= K ) {
      return ;
    }
  }
  if ( className . equals ( "java.util.concurrent.ConcurrentLinkedQueue" ) ) {
    System . out . println ( Main . class . getName ( ) ) ;
  }
}
