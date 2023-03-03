def _import ( ) :
    from StringIO import StringIO
    from itertools import chain
    class Main ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
            self.stream = stream
            self.N = int ( self.stream.read ( ) )
            self.D = int ( self.stream.read ( ) )
            self.K = int ( self.stream.read ( ) )
            self.L = [ ]
            self.R = [ ]
            for i in range ( self.N ) :
                self.L.append ( self.read ( ) )
            self.R = [ ]
            for i in range ( self.D ) :
                self.R.append ( self.read ( ) )
            self.S = [ ]
            self.T = [ ]
            for i in range ( self.K ) :
                self.S.append ( self.read ( ) )
            self.T.append ( self.read ( ) )
        def solve ( self ) :
            ans = [ ]
            for i in range ( self.K ) :
                self.ans.append ( self.calc ( self.S [ i ] , self.T [ i ] ) )
            return ans
        def calc ( s , t ) :
            from random import randint
            from random import randint
            from .import choice
            if not choice ( self.S ) or not choice ( self.T ) :
                try :
                    choice = choice ( self.S )
                except :
                    raise
            else :
                if self.intersects ( from , to , L [ i ] , R [ i ] ) :
                    from = min ( from , L [ i ] )
                    to = max ( to , R [ i ] )
            if from <= t <= to :
                return i + 1
        raise ValueError ( 'wtf' )
    def intersects ( from1 , to1 , from2 , to2 ) :
        if to1 < from2 : return False
        if to2 < from1 : return False
        return True
    from itertools import chain , repeat
    return repeat ( [ 1 , 2 ] )
