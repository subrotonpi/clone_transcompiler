def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
    arr = [ ]
    d = defaultdict ( list )
    for i in range ( n ) :
        arr.append ( _main ( ) )
        d [ arr [ i ] ].append ( None )
    set = d.keys ( )
    idx = 0
    for x in set :
        d [ x ] = idx
        idx += 1
    lines = [ ]
    for x in arr :
        lines.append ( d [ x ] + "\n" )
    sys.stdout.write ( "\n".join ( lines ) )
