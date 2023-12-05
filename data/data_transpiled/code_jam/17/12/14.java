static final int [ ] getTests ( ) throws IOException {
  final String testdata = "6\n2 1\n500 300\n900\n660\n2 1\n500 300\n1500\n809\n2 2\n50 100\n450 449\n1100 1101\n2 1\n500 300\n300\n500\n1 8\n10\n11 13 17 11 16 14 12 18\n3 3\n70 80 90\n1260 1500 700\n800 1440 1600\n1700 1620 900\n" ;
  final CommandLine cmd = new CommandLine ( ) ;
  cmd . addSwitch ( "test cases" , false ) ;
  cmd . addSwitch ( "-d" , "count" ) ;
  cmd . addSwitch ( "inputfile" , "?" ) ;
  final int nparams = cmd . getOptionValue ( "test" ) ;
  final int ncases = cmd . getOptionValue ( "test" ) ;
  LOG . info ( "" + nparams + " cases" ) ;
  for ( int i = 0 ;
  i < ncases ;
  i ++ ) {
    final int ans = nextcase ( cmd . getOptionValue ( "test" ) , i ) ;
    final String outstr = "Case #" + ( i + 1 ) + ans ;
    LOG . info ( outstr ) ;
    print ( ">" + outstr ) ;
  }
  LOG . info ( "Complete" ) ;
  return new int [ ] {
    ncases }
    ;
  }
  