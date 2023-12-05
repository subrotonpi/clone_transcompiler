def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = [ ]
        n = self.s.count ( )
        if n == 0 :
            print ( '0' )
            return
        while n != 0 :
            tmp = n % - 2
            if tmp == - 1 :
                n -= 1
                tmp = 1
            self.s.append ( tmp )
            n /= - 2
        s = ''.join ( reversed ( s ) )
        print ( s )
