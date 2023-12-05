def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.__next__ ( )
        K = sc.__next__ ( )
        D = [ ]
        for i in range ( K ) :
            D.append ( sc.__next__ ( ) )
        dic = set ( [ w for w in D if w ] )
        cur = N
        while cur <= 99999 :
            if _valid ( cur , dic ) : break
            cur += 1
        print ( cur )
    def valid ( N , dic ) :
        cur = str ( N )
        for w in cur :
            if w - '0' in dic : return False
        return True
