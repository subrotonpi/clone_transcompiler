public static int bc ( int i ) {
  int r = 0 ;
  while ( i != 0 ) {
    if ( ( i & 1 ) != 0 ) {
      r ++ ;
    }
    i /= 2 ;
  }
  return r ;
}
int T = Integer . parseInt ( input . nextLine ( ) ) ;
for ( int t = 0 ;
t < T ;
t ++ ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] W = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) W [ i ] = Integer . parseInt ( input . nextLine ( ) , 2 ) ;
  Set < Set < Integer >> E = new HashSet < Set < Integer >> ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) E . add ( new HashSet < Integer > ( ) ) ;
  Map < Integer , Integer > V = new HashMap < Integer , Integer > ( ) ;
  int Z = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( W [ i ] == 0 ) {
      Z ++ ;
      continue ;
    }
    Set < Integer > R = new HashSet < Integer > ( ) ;
    int J = W [ i ] ;
    int C = 1 ;
    for ( Iterator < Map . Entry < Integer , Integer >> iterator = V . entrySet ( ) . iterator ( ) ;
    iterator . hasNext ( ) ;
    ) {
      Map . Entry < Integer , Integer > e = iterator . next ( ) ;
      int k = e . getKey ( ) ;
      if ( e . getValue ( ) & W [ i ] ) {
        J |= e . getValue ( ) ;
        C += k ;
        R . add ( e . getValue ( ) ) ;
      }
    }
    for ( int r : R ) V . remove ( r ) ;
    V . put ( J , C ) ;
  }
  int Req = 0 , Used = 0 ;
  List < Pair < Integer , Integer >> O = new ArrayList < Pair < Integer , Integer >> ( ) ;
  for ( Map . Entry < Integer , Integer > e : V . entrySet ( ) ) {
    if ( e . getValue ( ) == bc ( e . getValue ( ) ) ) {
      Req += e . getKey ( ) * e . getValue ( ) ;
      Used += e . getValue ( ) ;
    }
    else O . add ( new Pair < Integer , Integer > ( bc ( e . getValue ( ) ) , e . getKey ( ) ) ) ;
  }
  if ( O . size (