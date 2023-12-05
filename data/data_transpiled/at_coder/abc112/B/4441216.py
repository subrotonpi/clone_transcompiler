def _import ( ) :
    from collections import defaultdict
    from collections import defaultdict
    from collections import defaultdict
    from collections import defaultdict
    from collections import defaultdict
    class Main ( object ) :
        TLE = 'TLE'
        def process ( self ) :
            ( N , T , c , t ) = self.N
            min_cost = defaultdict ( list )
            for cost , time in zip ( c , t ) :
                if time <= T :
                    if min_cost :
                        min_cost = min_cost.min ( curr = cost )
                    else :
                        min_cost = ( cost , time )
            return min_cost
        def main ( self ) :
            case = self._read_from_input ( )
            result = self.process ( case )
            self.output ( result )
        def _read_from_input ( self ) :
            with open ( self.input , 'r' ) as f :
                N , T = f.read ( ).split ( '\n' )
            c = defaultdict ( list )
            t = defaultdict ( list )
            for i in range ( N ) :
                c [ i ].append ( f.read ( ) )
                t [ i ].append ( f.read ( ) )
            return ( N , T , c , t )
        def output ( self , result ) :
            print ( result )
    class Main ( object ) :
        def process ( self ) :
            ( N , T , c , t ) = self.N
            return ( N , T , c , t )
    return Main
