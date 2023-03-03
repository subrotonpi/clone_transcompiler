def _import ( ) :
    import numpy as np
    import numpy
    import numpy.util as np
    import numpy.util as np
    import numpy.util as np
    import numpy.util as np
    import Scanner
    class Main ( object ) :
        class Interval :
            def __init__ ( self , start , end ) :
                self.start = start
                self.end = end
            def __eq__ ( self , other ) :
                if self is other : return True
                if not isinstance ( other , type ) or self.__class__ != self.__class__ : return False
                interval = self.start
                return self.start == interval.start and self.end == interval.end
            def __hash__ ( self ) :
                return np.hash ( self.start )
            def __lt__ ( self , other ) :
                if self.start < other.start :
                    return - 1
                elif self.start == other.start :
                    if self.end < other.end :
                        return - 1
                    elif self.end == other.end :
                        return 0
                    else :
                        return 1
                else :
                    return 1
        def main ( self ) :
            Scanner.__init__ ( self )
            n = np.size ( self )
            mod = 1000000007L
            colors = np.array ( [ i for i in range ( n ) ] )
            dedupe_colors = [ ]
            for i in range ( 1 , len ( dedupe_colors ) ) :
                if i > 0 and colors [ i ] == colors [ i - 1 ] :
                    continue
                dedupe_colors.append ( colors [ i ] )
            color_pos = { }
            for i , color in enumerate ( dedupe_colors ) :
                pos = color_pos.get ( color , [ ] )
                pos.append ( i )
                color_pos [ color ] = pos
            dp = np.array ( dp )
            dp [ 0 ] = dp [ 0 ] [ 1 ]
            dp [ 1 ] = dp [ 0 ] [ 1 ]
            dp [ 1 ] = dp [ 1 ] [ 1 ]
            dp [ 1 ] = dp [ 1 ] [ 1 ]
            dp [ 1 ] = dp [ 1 ] [ 1 ]
            dp [ 1 ] = dp [ 1 ] [ 1 ]
    return Main
