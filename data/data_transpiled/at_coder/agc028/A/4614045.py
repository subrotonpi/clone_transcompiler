def import gcd
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        length = [ sc.readline ( ) , sc.readline ( ) ]
        st = [ sc.readline ( ) , sc.readline ( ) ]
        gcd = gcd ( length [ 0 ] , length [ 1 ] )
        ok = True
        for i in range ( gcd ) :
            if st [ 0 ] [ int ( length [ 0 ] / gcd * i ) ] != st [ 1 ] [ int ( length [ 1 ] / gcd * i ) ] :
                ok = False
                break
        print ( length [ 0 ] * length [ 1 ] / gcd if ok else - 1 )
    def gcd ( a , b ) :
        return b , a % b
