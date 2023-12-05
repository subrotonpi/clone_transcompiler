def main ( * orange ) :
    import sys
    import random
    import sys
    class C ( object ) :
        def __init__ ( self ) :
            self.N = 1
            self.ans = 0
    def __init__ ( self , * orange ) :
        input = sys.stdin
        self.numCases = len ( orange )
        for n in range ( self.numCases ) :
            X = random.randint ( 0 , X )
            Y = random.randint ( 0 , Y )
            Z = random.randint ( 0 , Z )
            K = random.randint ( 0 , K )
            print ( "Case #%d: " % ( n + 1 ) )
            if K >= Z :
                print ( X * Y * Z )
                for i in range ( X ) :
                    for j in range ( Y ) :
                        for k in range ( Z ) :
                            print ( ( i + 1 ) , ( j + 1 ) , ( k + 1 ) )
            elif K >= Y :
                print ( X * Y * K )
                for i in range ( X ) :
                    for j in range ( Y ) :
                        for k in range ( K ) :
                            print ( ( i + 1 ) , ( j + 1 ) , ( k + 1 ) )
            else :
                print ( K * X * Y )
                for i in range ( Y ) :
                    for j in range ( X ) :
                        for k in range ( K ) :
                            print ( ( j + 1 ) , ( ( i + j + k ) % Y + 1 ) , ( i + 1 ) )
