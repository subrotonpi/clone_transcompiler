static final Scanner input = new Scanner ( System . in ) {
  private List < Integer > inpl = Collections . unmodifiableList ( Arrays . asList ( input . nextLine ( ) . split ( " " ) ) ) ;
  private int N = Integer . parseInt ( input . nextLine ( ) ) ;
  private int [ ] A = inpl . toArray ( ) ;
  private final Set < Integer > aji = new HashSet < > ( ) ;
  int ans = 1 ;
  int left = 0 , right = 0 ;
  for ( ;
  left < N ;
  left ++ ) {
    while ( right < N && ( A [ right ] != null && ! aji . contains ( A [ right ] ) ) ) {
      aji . add ( A [ right ] ) ;
      right ++ ;
    }
    ans = Math . max ( ans , right - left ) ;
    if ( left == right ) right ++ ;
    else aji . remove ( A [ left ] ) ;
  }
  System . out . println ( ans ) ;
}
