static final int [ ] getStdIn ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a . add ( new Integer ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int ao = Integer . parseInt ( input . nextLine ( ) ) ;
  int ae = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( Math . max ( ao , ae ) == 0 ) {
    int ai = a . indexOf ( Math . max ( a . get ( 0 ) , a . get ( 0 ) ) ) ;
    List < Integer > Ans = new ArrayList < > ( 1 ) ;
    Ans . add ( N - ai ) ;
    Ans . add ( N ) ;
    System . out . println ( Math . max ( a . get ( 0 ) , a . get ( 0 ) ) ) ;
    System . out . println ( Ans . size ( ) ) ;
    for ( int i : Ans ) {
      System . out . println ( i ) ;
    }
    System . exit ( 0 ) ;
  }
  if ( ao >= ae ) {
    System . out . println ( ao ) ;
    List < Integer > yn = new ArrayList < > ( N ) ;
    yn . add ( N ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( a . get ( i ) % 2 && a . get ( i ) > 0 ) {
        System . out . println ( i ) ;
      }
    }
    System . exit ( 0 ) ;
  }
  List < Integer > listyn = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    listyn . add ( i ) ;
  }
  List < Integer > Ans = new ArrayList < > ( ) ;
  while ( ! listyn . get ( 0 ) . equals ( 1 ) ) {
    Ans . add ( 1 ) ;
    listyn = listyn . subList ( 1 , listyn . size ( ) ) ;
  }
  while ( ! listyn . get ( listyn . size ( ) - 1 ) . equals ( 1 ) ) {
    Ans . add ( listyn . size ( ) ) ;
    listyn = listyn . subList ( 0 , listyn . size ( ) - 1 ) ;
  }
  while ( true ) {
    if ( listyn . size ( ) == 1 ) break ;
    if (