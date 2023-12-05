def import import sys , random
class A ( object ) :
    def eval ( s ) :
        type = [ ]
        for i in range ( 500 ) :
            type [ i ] += 1
        return int ( random.uniform ( 0 , 1 ) )
    def uniform ( ) :
        return float ( random.uniform ( 0 , 1 ) )
    def long ( ) :
        return long ( random.uniform ( 0 , 1 ) )
    def add ( x ) :
        while x [ len ( x ) ] == x [ 0 ] :
            x [ len ( x ) ] += 1
        return x [ len ( x ) : ]
    def solve ( ) :
        n = randint ( 1 , 10000 )
        s = [ x + 1 ]
        for i in range ( n ) :
            cur = 0
            for j in range ( len ( s ) ) :
                cur += abs ( s [ i ] - s [ j ] )
            add = min ( add , cur )
        for i in range ( len ( s ) ) :
            s [ i ] = s [ i ]
        next = eval ( s )
        if next == - 1 :
            return next
        else :
            return next + add
    def solve ( ) :
        n = randint ( 1 , 10000 )
        s = [ x + 1 ]
        for i in range ( n ) :
            s.append ( "$" )
        ans = eval ( s )
        sys.stderr.write ( ans )
        if ans == - 1 :
            sys.stderr.write ( "Fegla Won\n" )
        else :
            sys.stderr.write ( ans )
    def run ( ) :
        infile = open ( "A.in" , "r" )
        outfile = open ( "A.out" , "w" )
        t = randint ( 1 , 10000 )
        for i in range ( 1 , t + 1 ) :
            sys.stderr.write ( i )
            sys.stderr.write ( "Case #%d: " % i )
        outfile.close ( )
    return solve ( )
