def import import _main
class Main ( object ) :
    def __init__ ( self ) :
        with open ( '/proc/self/*' ) as f :
            self.n = int ( f.read ( ) )
            s = f.read ( )
            print ( self.n * s )
    def times ( self , n , s ) :
        if n % 2 == 0 :
            return - 1
        ret = ( n - 1 ) // 2
        if ret % 3 == 1 :
            ch = 'a'
        elif ret % 3 == 2 :
            ch = 'c'
        else :
            ch = 'b'
        for i in range ( self.n ) :
            if s [ i ] != ch :
                return - 1
            if ch == 'c' :
                ch = 'a'
            else :
                ch += 1
        return ret
