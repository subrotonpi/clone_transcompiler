@ VisibleForTesting static void solve ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Job > jobs = new ArrayList < > ( ) ;
  jobs . add ( new Job ( 0 , 0 ) ) ;
  jobs . add ( new Job ( ) ) ;
  for ( String l : System . console ( ) . readLine ( ) . split ( " " ) ) {
    jobs . add ( new Job ( l ) ) ;
  }
  final Map < Job , Integer > timetable = new LinkedHashMap < > ( ) ;
  for ( int i = 1 ;
  i < jobs . size ( ) ;
  i ++ ) {
    final Job start = jobs . get ( i ) ;
    final Job end = jobs . get ( i ) ;
    timetable . put ( start , new Job ( end , i ) ) ;
  }
  final long [ ] dp = new long [ 1000001 ] ;
  for ( int t = 999999 ;
  t >= 0 ;
  t -- ) {
    dp [ t ] = Math . max ( dp [ t ] , dp [ t + 1 ] ) ;
    for ( int end = 0 ;
    end < timetable . get ( t ) ;
    end ++ ) {
      final int i = timetable . get ( t ) ;
      dp [ t ] = Math . max ( dp [ t ] , new Job ( dp [ end ] . ordinal ( ) + 1 , - i ) ) ;
    }
  }
  final long ansCount = dp [ 0 ] . longValue ( ) ;
  final long ansList [ ] = new long [ N ] ;
  ansList [ 0 ] = - dp [ 0 ] . longValue ( ) ;
  long nextJob = - dp [ jobs . get ( - dp [ 0 ] . longValue ( ) ) ] . longValue ( ) ;
  while ( nextJob != 0 ) {
    ansList [ N - 1 ] = nextJob ;
    final int endtime = jobs . get ( nextJob ) . intValue ( ) ;
    nextJob = - dp [ endtime ] . longValue ( ) ;
  }
  System . out . println ( ansCount ) ;
  System . out . println ( ( ( long [ ] ) ansList ) ) ;
}
