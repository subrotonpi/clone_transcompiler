def codejam ( ) :
    import os
    from .import fileinput
    from ..import horse
    class horse ( object ) :
        def __init__ ( self ) :
            self.f = open ( "src/codejam/A-large.in" )
            lines = [ ]
            T = int ( self.f.readline ( ) )
            for t_i in range ( 1 , T + 1 ) :
                split = self.f.readline ( ).split ( )
                D = int ( split [ 0 ] )
                N = int ( split [ 1 ] )
                k = [ ]
                s = [ ]
                latest = 0
                for n_i in range ( N ) :
                    split = self.f.readline ( ).split ( )
                    k.append ( int ( split [ 0 ] ) )
                    s.append ( int ( split [ 1 ] ) )
                    time = 1.* ( D - k [ n_i ] ) / s [ n_i ]
                    if time > latest :
                        latest = time
                lines.append ( "Case #%d: %.4f\n" % ( t_i , D / latest ) )
    with fileinput.open ( "src/codejam/horse.out" , "w" ) as f :
        print ( "\n".join ( lines ) )
