def cj2016.r1a ( root , ex ) :
    import os
    import sys
    from cj2016.r1a import solve
    class C ( object ) :
        def __init__ ( self , root ) :
            self.filePrefix = sys.argv [ 1 ] if len ( sys.argv ) > 1 else 'C-large'
            try :
                super ( C , self ).__init__ ( root )
            except :
                print ( sys.argv [ 1 ] , file = sys.stderr )
    def run ( self , filePrefix ) :
        sc = open ( filePrefix + '.in' , 'r' )
        f = open ( filePrefix + '.out' , 'w' )
        ntest = sc.read ( )
        for test in range ( 1 , ntest + 1 ) :
            read ( sc )
            f.write ( 'Case #%d: ' % test )
            print ( 'Case #%d: ' % test , file = sys.stderr )
            solve ( )
        print ( 'Finished.' )
        sc.close ( )
        f.close ( )
    def read ( sc ) :
        N = sc.read ( )
        F = [ sc.read ( ) - 1 ]
        for i in range ( N ) :
            F.append ( sc.read ( ) )
    def write ( s ) :
        f.write ( s )
        print ( s , file = sys.stderr )
    def write ( s ) :
        f.write ( s )
        print ( s , file = sys.stderr )
    def write ( s ) :
        print ( s , file = sys.stderr )
        print ( s , file = sys.stderr )
    def solve ( ) :
        largestSingleCircle = 0
        for i in range ( N ) :
            next = i
            size = 0
            for j in range ( N ) :
                size += 1
                next = F [ next ]
                if next == i :
                    break
            if next == i :
                largestSingleCircle = max ( largestSingleCircle , size )
        sum = 0
        for i in range ( N ) :
            for j in range ( i + 1 , N ) :
                if F [ i ] ==