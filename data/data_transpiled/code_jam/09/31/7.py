def _import ( ) :
    import os
    import sys
    import os
    import sys
    class A ( object ) :
        IFILE = "A-large.in"
        def __init__ ( self ) :
            self.IFILE = "A-large.in"
            self.in_ = open ( IFILE , "r" )
            self.out = open ( "output.txt" , "w" )
            ntest = self.ntest
            self.ntest = self.ntest
            self.ntest = self.ntest
    for test in range ( 1 , ntest + 1 ) :
        print ( "Case #%d: " % test , end = ' ' )
        c = sys.stdin.read ( ).decode ( 'utf-8' )
        n = len ( c )
        d = { c [ 0 ] : 1 }
        mas = [ False ] * 1000
        ss = 1
        for c in c [ 1 : ] :
            if c [ i ] not in d :
                for j in range ( 1000 ) :
                    if not mas [ j ] :
                        ss = max ( j , ss )
                        mas [ j ] = True
                        d [ c [ i ] ] = j
                        break
        ss += 1
        result = 0
        for c in c [ 1 : ] :
            result *= ss
            result += d [ c [ i ] ]
        print ( result , end = ' ' )
    sys.stdout.write ( '\n' )
