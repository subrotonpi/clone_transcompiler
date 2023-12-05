static final String nextLine ( ) {
  final int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  final Set < Set < Integer >> powerSet = new HashSet < Set < Integer >> ( ) ;
  final Set < Integer > s = new HashSet < Integer > ( ) ;
  powerSet . addAll ( s ) ;
  return Iterables . stream ( Iterables . combinations ( s , r -> r + 1 ) ) . collect ( Collectors . toSet ( ) ) ;
}
