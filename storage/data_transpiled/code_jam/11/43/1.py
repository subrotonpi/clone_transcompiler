def _import ( ) :
    from pybind11_tests import Scanner , compile , compile
    from pybind11_tests import SeqIO , SeqIO , SeqIO , SeqIO , log , symbols
    from pybind11_tests import SeqIO , SeqIO , SeqIO , log , symbols
    from pybind11_tests import SeqIO , SeqIO , SeqIO , log , symbols
    from pybind11_tests import SeqIO , SeqIO , SeqIO , log , symbols
    from pybind11_tests import SeqIO , SeqIO , log , symbols
    from pybind11_tests import SeqIO , SeqIO , log , symbols
    from pybind11_tests import SeqIO , SeqIO , log , symbols
    from pybind11_tests import SeqIO , SeqIO , log , symbols
    M = symbols ( 'M' )
    if N == 1 :
        print ( 0 )
        return
    is_prime = [ True for i in range ( 3 , M , 2 ) ]
    is_prime [ 2 ] = True
    for i in range ( 3 , M , 2 ) :
        if is_prime [ i ] :
            for j in range ( i , M + 1 ) :
                is_prime [ j ] = False
    res = 1
    for i in range ( 2 , N + 1 ) :
        if is_prime [ int ( i ) ] :
            num = 2
            j = i * i
            while j * i <= N :
                j *= i
                num += 1
            res += num - 1
        print ( res )
    def run ( ) :
        caseN = SeqIO ( ).next ( )
        for caseID in range ( 1 , caseN + 1 ) :
            print ( "Case #%d: " % caseID , end = ' ' )
            solve ( )
            sys.stdout.flush ( )
    def debug ( * args ) :
        sys.stderr.write ( deeprepr ( args ) )
    with open ( "%s.in" % sys.argv [ 0 ] if sys.argv [ 0 ] else ( "%s.in" % sys.argv [ 0 ] ) ) as f :
        try :
            sys.stdin.write ( f.read ( ) )
        except :
            pass
