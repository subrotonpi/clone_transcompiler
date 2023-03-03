@ VisibleForTesting static void debug ( String ... args ) {
  final Scanner fin = new Scanner ( System . in ) ;
  final int T = Integer . parseInt ( fin . nextLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    final int N = Integer . parseInt ( fin . nextLine ( ) ) ;
    final Map < Integer , Set < Integer >> workerMachine = new HashMap < > ( N ) ;
    final Map < Integer , Set < Integer >> machineWorker = new HashMap < > ( N ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final List < Integer > bitmap = new LinkedList < > ( ) ;
      final Set < Integer > known = new HashSet < > ( ) ;
      for ( int j = 0 ;
      j < bitmap . size ( ) ;
      j ++ ) {
        final char b = bitmap . get ( j ) ;
        if ( b == '1' ) {
          known . add ( j ) ;
          machineWorker . get ( j ) . add ( i ) ;
        }
      }
      workerMachine . put ( i , known ) ;
    }
    debug ( testCase , machineWorker ) ;
    final Map < Integer , Set < Integer >> workerGroups = new HashMap < > ( N ) ;
    final Map < Integer , Set < Integer >> machineGroups = new HashMap < > ( N ) ;
    int group = 0 ;
    final List < Integer > groups = new ArrayList < > ( N ) ;
    int baseCost = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( workerGroups . containsKey ( i ) ) continue ;
      final Queue < Integer > queue = new LinkedList < > ( ) ;
      queue . add ( i ) ;
      group ++ ;
      final List < Integer > groupWorkers = new ArrayList < > ( ) ;
      final List < Integer > groupMachines = new ArrayList < > ( ) ;
      while ( queue . size ( ) > 0 ) {
        final int next = queue . poll ( ) ;
        if ( workerGroups . containsKey ( next ) ) continue ;
        workerGroups . put ( next , group ) ;
        groupWorkers . add ( next ) ;
        final Set < Integer > machines = workerMachine . get ( next ) ;
        for ( int machine : machines ) {
          if ( machineGroups . containsKey ( machine ) ) continue ;
          machineGroups . put ( machine , group ) ;
          groupMachines . add ( machine ) ;
          for ( int worker : machineWorker . get ( machine ) ) {
            queue . add ( worker ) ;
          }
        }
      }
      for (