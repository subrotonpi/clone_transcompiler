static final int [ ] getCushionThreshold ( ) {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  System . setIn ( stdin ) ;
  /* li */
  final int N = Integer . parseInt ( stdin . readLine ( ) ) ;
  final long large = Long . MAX_VALUE ;
  final HashMap < Integer , Long > memo = new HashMap < > ( ) ;
  / * ▁ Calculate ▁ the ▁ total ▁ number ▁ of ▁ occupied ▁ by ▁ the ▁ first ▁ occupied ▁ by ▁ the ▁ second ▁ occupied ▁ by ▁ the ▁ second ▁ occupied ▁ by ▁ the ▁ third ▁ occupied ▁ by ▁ the ▁ second ▁ occupied ▁ by ▁ the ▁ third ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ second ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ third ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ third ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ third ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ fourth ▁ eight ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ fourth ▁ occupied ▁ by ▁ the ▁ fourth ▁ eight ▁ by ▁ the ▁ fourth ▁ eight ▁ eight ▁ by ▁ the ▁ eight ▁ eight ▁ by ▁ the ▁ eight ▁ eight ▁ eight ▁ and ▁ the ▁ eight ▁ eight ▁ eight ▁ by ▁ the ▁ eight ▁ eight ▁ and ▁ eight ▁ the ▁ eight ▁ eight ▁ are ▁ the ▁ eight ▁ eight ▁ are ▁ the ▁ eight ▁ eight ▁ are ▁ the ▁ eight ▁ are ▁ the ▁ eight ▁ are ▁ the