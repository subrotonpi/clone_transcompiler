@ VisibleForTesting static void from ( LinkedHashMap < Integer , Set < Integer >> vertices , int edges ) {
  int vertices = Integer . parseInt ( input . nextLine ( ) ) ;
  int edges = Integer . parseInt ( input . nextLine ( ) ) ;
  Map < Integer , Set < Integer >> connect = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < edges ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    connect . put ( a , new HashSet < > ( ) ) ;
    connect . put ( b , new HashSet < > ( ) ) ;
  }
  int answer = 0 ;
  Queue < Set < Integer >> queue = new LinkedList < > ( ) ;
  queue . add ( new HashSet < > ( ) ) ;
  queue . add ( new HashSet < > ( ) ) ;
  queue . add ( new HashSet < > ( ) ) ;
  queue . add ( new HashSet < > ( ) ) ;
  queue . add ( new HashSet < > ( ) ) ;
  queue . add ( new HashSet < > ( ) ) ;
}
