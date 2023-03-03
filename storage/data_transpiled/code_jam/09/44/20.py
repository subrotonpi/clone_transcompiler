def _import ( ) :
    import os
    import math
    import os
    import os
    import os
    import os
    import os
    import os
    import os
    import time
    import time
    import math
    class Program ( object ) :
        def __init__ ( self ) :
            self.f = open ( 'D:\\D-small-attempt3.in' , 'r' )
            self.f = open ( 'D:\\D-out.txt' , 'w' )
            ( time.asctime ( ).format ( tt + 1 ) ).save ( self.f )
        def readline ( self ) :
            try :
                return self.f.readline ( )
            except IOError :
                pass
        def __next__ ( self ) :
            while not stk or not stk [ 0 ] :
                self.load_line ( )
            return None
        def __next__ ( self ) :
            while not stk or not stk [ 0 ] :
                self.load_line ( )
            return int ( stk [ 0 ] )
        def __next__ ( self ) :
            while not stk or not stk [ 0 ] :
                self.load_line ( )
            return float ( stk [ 0 ] )
        def next_word ( self ) :
            while not stk or not stk [ 0 ] :
                self.load_line ( )
            return stk [ 0 ]
        def run ( self ) :
            t = self.__next__ ( )
            for tt in range ( t ) :
                n = self.__next__ ( )
                x = [ ]
                y = [ ]
                r = [ ]
                for i in range ( n ) :
                    x.append ( __next__ ( ) )
                    y.append ( __next__ ( ) )
                    r.append ( __next__ ( ) )
                res = None
                if n == 1 :
                    res = r [ 0 ]
                elif n == 2 :
                    res = max ( r [ 0 ] , r [ 1 ] )
                elif n == 3 :
                    res = max ( r [ 0 ] , r [ 1 ] )
                elif n == 4 :
                    res = max ( r [ 0 ] , r [ 2 ] )
            return res
    return Program ( )
