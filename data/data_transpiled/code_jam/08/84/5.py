def _import ( ) : return ( [ 1 ] * 3 )
class DHard ( Runnable ) :
    def __init__ ( self , nc , k , n , p ) :
        MOD = 30031
        class Profile ( object ) :
            def __init__ ( self ) :
                self.r = [ ]
                self.mat = [ ]
                for i in range ( k ) :
                    self.r.append ( i )
            def solve ( self ) :
                with open ( 'D-large.in' , 'w' ) as f :
                    self.r.append ( [ ] )
                    self.mat = [ ]
                    for i in range ( 1 << p ) :
                        self.r.append ( [ ] )
                    self.p = [ ]
                    self.nc = [ ]
                    for i in range ( 1 << p ) :
                        self.nc.append ( [ ] )
                for i in range ( 1 << p ) :
                    self.nc.append ( [ ] )
        def getOrder ( self ) :
            v = [ ]
            for i in range ( 1 << p ) :
                self.nc.append ( [ ] )
            v.append ( [ ] )
            for i in range ( 1 << p ) :
                if self.nc [ i ] >= self.nc [ i ] :
                    return None
            v.sort ( )
            return [ ]
        def __eq__ ( self , x ) :
            if self == x : return True
            if not isinstance ( x , type ) or __package__ ( x ) != self.__package__ :
                return False
            profile = x
            if not all ( [ r == profile.r for r in profile.r ] ) :
                return False
            return True
        def __hash__ ( self ) :
            return ( [ ] if r != None else 0 )
