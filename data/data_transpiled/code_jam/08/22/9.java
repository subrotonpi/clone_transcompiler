@ VisibleForTesting static void loadFile ( String input ) throws IOException {
  final Scanner fin = new Scanner ( new File ( "2_input.txt" ) ) ;
  final PrintStream fout = new PrintStream ( "2_output.txt" ) ;
  final int cases = Integer . parseInt ( fin . nextLine ( ) ) ;
  final HashMap < Integer , Boolean > cached = new HashMap < > ( ) ;
  final int i ;
  if ( cached . containsKey ( input ) ) {
    return cached . get ( input ) ;
  }
  if ( i == 2 ) return true ;
  for ( i = 2 ;
  i <= ( int ) ( i * 0.5 ) ;
  i ++ ) {
    if ( i % i == 0 ) {
      cached . put ( input , false ) ;
      return ;
    }
  }
  cached . put ( input , true ) ;
  /* Check for the first case */
  for ( i = 0 ;
  i < cases ;
  i ++ ) {
    final int num = Integer . parseInt ( fin . nextLine ( ) ) ;
    if ( i == 0 && ( a % num == 0 && b % num == 0 ) ) {
      return ;
    }
  }
  final long t0 = System . currentTimeMillis ( ) ;
  for ( int casenr = 0 ;
  casenr < cases ;
  casenr ++ ) {
    final int A = Integer . parseInt ( fin . nextLine ( ) ) ;
    final int B = Integer . parseInt ( fin . nextLine ( ) ) ;
    final int P = Integer . parseInt ( fin . nextLine ( ) ) ;
    final int n = B - A ;
    final HashMap < Integer , Integer > setId = new HashMap < > ( ) ;
    for ( int i = A ;
    i <= B ;
    i ++ ) {
      setId . put ( i , i - A ) ;
    }
    int setCount = n + 1 ;
    for ( int p0 = A ;
    p0 <= B ;
    p0 ++ ) {
      for ( int p1 = p0 + 1 ;
      p1 <= B ;
      p1 ++ ) {
        if ( ( setId . get ( p0 ) == setId . get ( p1 ) ) ) {
          continue ;
        }
        if ( checkForP ( p0 , p1 , P ) ) {
          setCount -- ;
          final int ex = setId . get ( p1 ) ;
          for ( Integer k : setId . keySet ( ) ) {
            if ( setId . get ( k ) == ex ) {
              setId . put ( k , setId . get ( p0 ) ) ;
            }
          }
        }
      }
    }
    System . out . println ( setCount ) ;
    fout . println ( "Case #" + ( casenr