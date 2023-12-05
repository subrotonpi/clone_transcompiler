@ VisibleForTesting static Iterable < Integer > iterable ( ) {
  final int T = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    System . out . print ( "Case #" + ( t + 1 ) + ": " ) ;
    final int coasterLength = input . nextInt ( ) ;
    final int nCustomers = input . nextInt ( ) ;
    final int ticketsSold = input . nextInt ( ) ;
    final List < Integer > tickets = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < ticketsSold ;
    i ++ ) {
      tickets . add ( Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ) ;
    }
    final int [ ] customers = list ( repeat ( 0 , nCustomers ) ) ;
    final int [ ] positions = list ( repeat ( 0 , coasterLength ) ) ;
    for ( int position = 0 ;
    position < customers . length ;
    position ++ ) {
      customers [ customers . length - position - 1 ] ++ ;
      positions [ position ] ++ ;
    }
    int lowerBound = max ( customers ) ;
    for ( int position = count ( 1 ) ;
    position < customers . length ;
    position ++ ) {
      final int totalTickets = accumulate ( positions ) ;
      lowerBound = max ( ceil ( totalTickets / position ) , lowerBound ) ;
    }
    final int promotions = sum ( max ( 0 , i - lowerBound ) ) ;
    System . out . println ( lowerBound + " " + promotions ) ;
  }
  return new Iterable < Integer > ( ) {
    @ Override public Iterator < Integer > iterator ( ) {
      return tickets . iterator ( ) ;
    }
  }
  ;
}
