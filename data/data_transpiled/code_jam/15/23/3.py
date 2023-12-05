def import _sys
class c ( object ) :
    def __init__ ( self ) :
        self.input = sys.stdin
        self.T = int ( self.input.read ( ) )
    for t in range ( 1 , T + 1 ) :
        print ( "Case #%d: " % t , end = "" )
        n = int ( self.input.read ( ) )
        finish = [ ]
        lap = [ ]
        for d , h , m in _sys.stdin :
            for i in range ( h ) :
                time = m + i
                ft = time * ( 360.0 - d ) / 360
                finish.append ( ft )
                lap.append ( ( ft + time , time ) )
        lap = [ ]
        res , count = len ( lap ) , len ( lap )
        while not finish :
            while count < 2 * size and lap [ - 1 ].time <= finish [ - 1 ] :
                h = lap.pop ( )
                count += 1
                h.time += h.add
                lap.append ( h )
            if count == 2 * size : break
            count -= 1
            res = min ( res , count )
            x = finish.pop ( )
        print ( res )
class Hiker ( object ) :
    time = float ( 'inf' )
    add = float ( 'inf' )
    def __init__ ( self , tt , aa ) :
        time = tt
        add = aa
    def __call__ ( self , o ) :
        return _sys.modules [ self.input ].__call__ ( self , o )
