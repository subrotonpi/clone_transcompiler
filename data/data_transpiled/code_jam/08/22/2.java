public static String dofile ( String infile , String outfile ) throws IOException {
  String instr = file ( infile ) ;
  String ostr = dostr ( instr ) ;
  file ( outfile , ostr ) ;
  /* eat l */
  String [ ] dat = dat . split ( "\\s+" ) ;
  int N = Integer . parseInt ( dat [ 0 ] ) ;
  dat = dat [ 1 ] . split ( "\\s+" ) ;
  StringBuilder results = new StringBuilder ( ) ;
  for ( int i : xrange ( N ) ) {
    int A = Integer . parseInt ( dat [ 0 ] ) ;
    int B = Integer . parseInt ( dat [ 1 ] ) ;
    int P = Integer . parseInt ( dat [ 2 ] ) ;
    dat = dat [ 3 ] . split ( "\\s+" ) ;
    int res = solve ( A , B , P , i + 1 ) ;
    results . append ( res ) ;
  }
  /* do a little endian */
  for ( int i : xrange ( 2 , N ) ) {
    if ( dat [ i ] . length ( ) % i == 0 ) {
      return false ;
    }
  }
  /* solve a big endian integer */
  List < Integer > primes = Arrays . asList ( xrange ( P , B + 1 ) ) ;
  List < Set < Integer >> sets = new ArrayList < Set < Integer >> ( ) ;
  for ( int i : xrange ( A , B + 1 ) ) {
    if ( isPrime ( i ) ) {
      primes . add ( i ) ;
    }
  }
  for ( int i : xrange ( B , N ) ) {
    sets . add ( new HashSet < Integer > ( ) ) ;
  }
  for ( int p : primes ) {
    List < Set < Integer >> sets2 = new ArrayList < Set < Integer >> ( ) ;
    Set < Integer > newSet = new HashSet < Integer > ( ) ;
    for ( Set < Integer > s : sets ) {
      boolean merge = true ;
      for ( int i : s ) {
        if ( i % p == 0 ) {
          newSet = newSet . union ( s ) ;
          merge = false ;
          break ;
        }
      }
      if ( merge ) {
        sets2 . add ( s ) ;
      }
    }
    if ( newSet . size ( ) > 0 ) {
      sets2 . add ( newSet ) ;
    }
    sets = sets2 . toArray ( new Set [ sets . size ( ) ] ) ;
  }
  /* print sets */
  int res = sets . size (