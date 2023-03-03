def _ ( d ) :
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.res = [ ]
            high = long ( math.pow ( 10 , d - 1 ) )
            low = 1
            for i in range ( d // 2 ) :
                self.res.append ( high - low )
                high //= 10
                low *= 10
            return self.res
        def calc ( vs , D ) :
            res = 1
            ten = 10
            for i in range ( len ( vs ) ) :
                now = 0
                while D % ten and now < 9 :
                    D -= vs [ i ]
                    now += 1
                D = abs ( D )
                ten *= 10
                res *= ( 9 - now ) if i == 0 else ( 10 - now )
            return D , res
    def main ( ) :
        with open ( "/proc/sys/stdin" , "r" ) as infile :
            D = infile.read ( )
        res = 0
        for d in range ( 1 , 20 ) :
            vs = build_values ( d )
            next = calc ( vs , D )
            if d % 2 == 1 :
                next *= 10
            res += next
        print ( res )
    def rev ( x ) :
        s = "0"
        while x > 0 :
            s += "%s" % ( x % 10 , )
            x //= 10
        return int ( s )
    return Main ( )
