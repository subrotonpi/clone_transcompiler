def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.n , self.l = self.n , self.l
        s = [ ]
        for i in range ( self.l + 1 ) :
            s.append ( self.stdin.read ( ) )
        now = - 1
        for i in range ( 2 * self.n - 1 ) :
            if s [ l ] [ i ] == 'o' :
                now = i
                break
        for i in range ( self.l - 1 , - 1 , - 1 ) :
            if now < 0 or now >= 2 * self.n - 1 :
                continue
            if 1 <= now <= s [ i ] [ now - 1 ] == '-' :
                now -= 2
                continue
            if now < 2 * self.n - 2 and s [ i ] [ now + 1 ] == '-' :
                now += 2
                continue
        print ( ( now + 2 ) / 2 )
        self.stdin.close ( )
