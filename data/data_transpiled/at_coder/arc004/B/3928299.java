public static int N = Integer . parseInt ( input ) {
  int [ ] inputs = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    inputs [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int maximum = sum ( inputs ) ;
  int maxLength = max ( inputs ) ;
  int diff = maximum - maxLength ;
  int minimum = 0 <= diff ? 0 : maxLength - diff ;
  System . out . println ( maximum ) ;
  System . out . println ( minimum ) ;
  return minimum ;
}
