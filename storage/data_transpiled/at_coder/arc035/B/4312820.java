@ VisibleForTesting static void shuffle ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > inputs = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) inputs . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  Collections . sort ( inputs ) ;
  int mod = 10 * 9 + 7 ;
  Map < Integer , Integer > counterInputs = new HashMap < > ( inputs ) ;
  int counts = counterInputs . size ( ) ;
  int ans = 1 ;
  for ( Integer value : counterInputs . values ( ) ) ans *= factorial ( value ) ;
  System . out . println ( sum ( accumulate ( inputs ) ) ) ;
  System . out . println ( ans % mod ) ;
}
