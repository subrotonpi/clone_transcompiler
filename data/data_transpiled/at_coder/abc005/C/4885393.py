def _import ( ) :
    from collections import deque
    from os import urandom
    class Main ( object ) :
        def __init__ ( self ) :
            self.TIME = 101
            self.t = self.raw_input ( )
            self.n = self.raw_input ( )
            a_arr = [ ]
            for i in range ( self.TIME ) :
                a_arr [ self.n ] += 1
            m = self.raw_input ( )
            b_arr = [ ]
            for i in range ( self.TIME ) :
                b_arr [ self.n ] += 1
            tako_limits = deque ( )
            print ( "yes" if self.ansbool ( tako_limits ) else "no" )
        def ansbool ( tako_limits ) :
            for i in range ( 1 , self.TIME ) :
                while not self.tako_limits and self.peek ( ) < i :
                    self.tako_limits.popleft ( )
                for j in a_arr [ i ] :
                    self.tako_limits.append ( i + t )
                for j in b_arr [ i ] :
                    if not self.tako_limits or self.peek ( ) < i :
                        return False
                    else :
                        self.tako_limits.popleft ( )
            return True
    return Main
