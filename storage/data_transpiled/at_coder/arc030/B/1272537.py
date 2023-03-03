def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.res = 0
        g = [ ]
        def dfs ( u , par , h ) :
            exist = ( h [ u ] == 1 )
            for v in g [ u ] :
                if v == par : continue
                child = dfs ( v , u , h )
                if child :
                    self.res += 2
                exist |= child
        return exist
    def main ( ) :
        sc = _main ( )
        N = sc.count ( )
        k = sc.count ( ) - 1
        g = [ ]
        for a in sc :
            for b in sc :
                g.append ( b )
        dfs ( k , - 1 , h )
        print ( res )
