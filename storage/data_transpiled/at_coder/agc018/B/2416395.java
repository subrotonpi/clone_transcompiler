static final int HUGE = 2147483647 ;
final int HUGEL = 9223372036854775807 ;
final String ABC = "abcdefghijklmnopqrstuvwxyz" ;
{
  int n = anm . length ;
  int m = anm [ 0 ] . length ;
  int [ ] atte = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int [ ] aim = anm [ i ] ;
    for ( int k = 0 ;
    k < aim . length ;
    k ++ ) {
      if ( held . contains ( aim [ k ] ) ) {
        break ;
      }
    }
    atte [ i ] = aim [ k ] ;
  }
  {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int m = Integer . parseInt ( input . nextLine ( ) ) ;
    List < Integer > anm = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int [ ] aim = new int [ n ] ;
      for ( int k = 0 ;
      k < aim . length ;
      k ++ ) {
        aim [ k ] = Integer . parseInt ( input . nextLine ( ) ) ;
      }
      anm . add ( aim [ i ] ) ;
    }
    Set < Integer > held = new HashSet < > ( ) ;
    held . add ( 1 ) ;
    int res = HUGE ;
    while ( held . size ( ) > 0 ) {
      int [ ] atte = eachAttend ( anm , held ) ;
      Map < Integer , Integer > numAtte = new HashMap < > ( ) ;
      for ( int k = 1 ;
      k <= m ;
      k ++ ) {
        numAtte . put ( atte [ k ] , 1 ) ;
      }
      int ma = Math . max ( numAtte . values ( ) , m ) ;
      res = Math . min ( res , ma ) ;
      Set < Integer > popestSports = new HashSet < > ( ) ;
      for ( int k = 0 ;
      k < m ;
      k ++ ) {
        popestSports . add ( m ) ;
      }
      held . removeAll ( popestSports ) ;
    }
    System . out . println ( res ) ;
  }
}
