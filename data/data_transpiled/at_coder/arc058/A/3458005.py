def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.moji = [ True for i in range ( 10 ) ]
            self.N = self.sc.randint ( 0 , 10 )
            self.K = self.sc.randint ( 0 , 10 )
            for i in range ( self.K ) :
                self.moji [ self.sc.randint ( 0 , 10 ) ] = False
    ss = [ 0 ] * 10 - K
    a = 0
    for i in range ( 10 ) :
        if moji [ i ] :
            ss [ a ] = i
            a += 1
    min = 114514
    tmp = 0
    for i in range ( a ) :
        for j in range ( a ) :
            for k in range ( a ) :
                for l in range ( a ) :
                    for m in range ( a ) :
                        tmp = 10000 * ss [ i ] + 1000 * ss [ j ] + 100 * ss [ k ] + 10 * ss [ l ] + ss [ m ]
                        if tmp < min and tmp >= N :
                            min = tmp
    for i in range ( a ) :
        for j in range ( a ) :
            for k in range ( a ) :
                for l in range ( a ) :
                    for m in range ( a ) :
                        tmp = 1000 * ss [ i ] + 100 * ss [ j ] + 10 * ss [ k ] + ss [ l ]
                        if tmp < min and tmp >= N :
                            min = tmp
    for i in range ( a ) :
        for j in range ( a ) :
            for k in range ( a ) :
                tmp = 100 * ss [ i ] + 10 * ss [ j ]
                if tmp < min and tmp >= N :
                    min = tmp
    for i in range ( a ) :
        for j in range ( a ) :
            for k in range ( a ) :
                tmp = 100 * ss [ i ] + 10 * ss [ j ]
                if tmp < min and tmp >= N :
                    min = tmp
