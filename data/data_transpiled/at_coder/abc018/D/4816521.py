def _import ( ) : return int ( next ( ) )
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.__next__ ( )
        M = sc.__next__ ( )
        P = sc.__next__ ( )
        Q = sc.__next__ ( )
        R = sc.__next__ ( )
        max = 0
        matrix = [ ]
        man = [ ]
        select = [ ]
        for i in range ( 0 , N + 1 ) :
            for j in range ( 0 , M + 1 ) :
                matrix [ i ].append ( 0 )
        man.append ( 0 )
        for i in range ( R + 1 ) :
            x , y , z = sc.__next__ ( )
            matrix [ x ].append ( y )
        tansaku = 1
        for i in range ( N ) :
            tansaku *= 2
        for pp in pop ( ) :
            if pp <= P :
                tmp = i
                for j in range ( 1 , N + 1 ) :
                    select [ j ] = tmp % 2
                    tmp /= 2
                for j in range ( 1 , M + 1 ) :
                    man [ j ] = 0
                    for k in range ( 1 , N + 1 ) :
                        man [ j ] += select [ k ] * matrix [ k ] [ j ]
                man [ j ] = man [ j ]
                tmp = 0
                for j in range ( Q ) :
                    tmp += man [ M - j ]
                max = max ( max , tmp )
    def pop ( self ) :
        counter = 0
        while a > 0 :
            counter += a % 2
            a /= 2
        return counter
