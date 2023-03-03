static final String print ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int C = Integer . parseInt ( input ( ) ) ;
  List < List < Integer >> stc = new ArrayList < > ( ) ;
  long maxTime = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    List < Integer > tmp = Lists . newArrayList ( ) ;
    for ( int j = 0 ;
    j < C ;
    j ++ ) {
      tmp . add ( Integer . parseInt ( input ( ) ) ) ;
      maxTime = Math . max ( maxTime , tmp . get ( 1 ) ) ;
    }
    stc . add ( tmp ) ;
  }
  Collections . sort ( stc , new Comparator < List < Integer >> ( ) {
    public int compare ( List < Integer > o1 , List < Integer > o2 ) {
      return ( o1 . get ( 0 ) ) - o2 . get ( 0 ) ;
    }
  }
  ) ;
  List < List < Integer >> ongoings = new ArrayList < > ( ) ;
  int ans = 0 ;
  for ( List < Integer > prog : stc ) {
    boolean flag = false ;
    for ( List < Integer > og : ongoings ) {
      if ( og . get ( 2 ) == prog . get ( 2 ) ) {
        og . set ( 1 , prog . get ( 1 ) ) ;
        flag = true ;
        break ;
      }
      else if ( og . get ( 1 ) < prog . get ( 0 ) ) {
        og . set ( 1 , prog . get ( 1 ) ) ;
        og . set ( 2 , prog . get ( 2 ) ) ;
        flag = true ;
        break ;
      }
    }
    if ( ! flag ) {
      ongoings . add ( prog ) ;
    }
    ans = Math . max ( ans , ongoings . size ( ) ) ;
  }
  print ( ans ) ;
}
