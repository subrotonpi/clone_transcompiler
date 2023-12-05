public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < List < Integer >> se = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    se . add ( new LinkedList < Integer > ( ) ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    se . add ( new LinkedList < Integer > ( ) ) ;
    se . add ( new LinkedList < Integer > ( ) ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    se . get ( i ) . add ( new Integer ( i ) ) ;
    se . get ( i ) . add ( new LinkedList < Integer > ( ) ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    se . get ( i ) . add ( new Integer ( i ) ) ;
    se . get ( i ) . add ( new LinkedList < Integer > ( ) ) ;
    se . get ( i ) . add ( new Integer ( i ) ) ;
    se . get ( i ) . add ( new Integer ( i ) ) ;
    se . get ( i ) . add ( new Integer ( i ) ) ;
    if ( se . get ( i ) . get ( 1 ) % 5 != 0 ) se . get ( i ) . add ( new Integer ( 5 - se . get ( i ) . get ( 1 ) % 5 ) ) ;
    if ( se . get ( i ) . get ( 1 ) % 100 == 60 ) se . get ( i ) . add ( new Integer ( 40 ) ) ;
  }
  Arrays . sort ( se , new Comparator < List < Integer >> ( ) {
    public int compare ( List < Integer > o1 , List < Integer > o2 ) {
      return o1 . get ( 0 ) . compareTo ( o2 . get ( 0 ) ) ;
    }
  }
  ) ;
  List < List < Integer >> res = new ArrayList < > ( ) ;
  res . add ( se . get ( 0 ) ) ;
  for ( List < Integer > t : se ) {
    if ( res . get ( res . size ( ) - 1 ) . get ( 1 ) < t . get ( 0 ) ) res . add ( t ) ;
    else if ( res . get ( res . size ( ) - 1 ) . get ( 1 ) < t . get ( 1 ) ) res . set ( t . get ( 1 ) ) ;
  }
  for ( List <