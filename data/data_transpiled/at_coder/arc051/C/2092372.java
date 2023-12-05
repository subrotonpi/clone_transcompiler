@ VisibleForTesting public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int mul = Integer . parseInt ( input . nextLine ( ) ) , b = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > a = new LinkedList < > ( ) ;
  int mod = 10 * 9 + 7 ;
  a = new ArrayList < > ( a ) ;
  if ( mul == 1 ) {
    for ( int i : a ) System . out . println ( i % mod ) ;
    return ;
  }
  while ( ( b > 0 ) && ( Math . max ( a . size ( ) , Math . min ( a . size ( ) , mul ) ) > Math . min ( a . size ( ) , mod ) ) ) ;
}
