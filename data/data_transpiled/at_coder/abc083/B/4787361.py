def import import _sys , string , glob
class Main ( object ) :
    def __init__ ( self , arg ) :
        sc = sys.stdin
        S = sc.read ( )
        sc.close ( )
        print ( sum ( S ) )
    def sum ( S ) :
        s = S.split ( )
        N = int ( s [ 0 ] )
        A = int ( s [ 1 ] )
        B = int ( s [ 2 ] )
        ss = [ ]
        a = 0
        sum = 0
        for i in range ( 1 , N + 1 ) :
            ss.append ( str ( i ) )
        for j in range ( 1 , N + 1 ) :
            tmp = ss [ j ].split ( "" )
            for k in tmp :
                a += int ( k )
            if a >= A and a <= B :
                sum += int ( ss [ j ] )
            a = 0
        return sum
