static int N ( int N , int Ma , int Mb ) {
  int [ ] medic = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) medic [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  @ SuppressWarnings ( "unchecked" ) int inf = ( int ) Math . ceil ( input . nextLine ( ) ) ;
  Map < Integer , Integer > dp = new HashMap < > ( ) ;
  dp . put ( new Integer ( 0 ) , 0 ) ;
  for ( int n = 0 ;
  n < N ;
  n ++ ) {
    Map < Integer , Integer > dpc = dp . copyWithSize ( N ) ;
    int a = medic [ n ] ;
    int b = medic [ n ] ;
    int c = medic [ n ] ;
    for ( Map . Entry < Integer , Integer > d : dpc . entrySet ( ) ) {
      int da = d . getKey ( ) ;
      int db = d . getValue ( ) ;
      dp . put ( new Integer ( da + a ) , new Integer ( db + b ) ) ;
      dp . put ( new Integer ( da + a ) , new Integer ( db + b ) ) ;
      dp . put ( new Integer ( c + b ) , c + cost ) ;
    }
  }
  int ans = inf ;
  int nowa = Ma , nowb = Mb ;
  while ( nowa <= 400 && nowb <= 400 ) {
    ans = Math . min ( ans , dp . get ( nowa , nowb ) ) ;
    nowa += Ma ;
    nowb += Mb ;
  }
  if ( ans > 4000 ) ans = - 1 ;
  System . out . println ( ans ) ;
  return ans ;
}
