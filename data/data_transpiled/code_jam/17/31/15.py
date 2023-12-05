def round1c ( ) :
    import math
    import random
    import random
    import random
    class ProbA ( prob ) :
        def setup ( self ) :
            self.bin = True
            self.bout = True
            self.in_file = 'A-large.in'
            self.out_file = 'aout-large.txt'
        def main ( self ) :
            self.setup ( )
            self.re_direct ( )
            T = random.randint ( 1 , 10 )
            for cas in range ( 1 , T + 1 ) :
                ans = self.run ( )
                print ( 'Case #%d: %.9f' % ( cas , ans ) )
        def run ( self ) :
            n = random.randint ( 1 , 10 )
            k = random.randint ( 1 , 10 )
            pancake = [ [ random.randint ( 0 , n ) , random.randint ( 0 , n ) ] for n in range ( 2 ) ]
            ans = 0
            for i in range ( n ) :
                curr = self.calc_side ( pancake [ i ] ) + self.calc_area ( pancake [ i ] [ 0 ] )
                arr = [ ]
                for j in range ( n ) :
                    if j != i :
                        if pancake [ j ] [ 0 ] <= pancake [ i ] [ 0 ] :
                            arr.append ( self.calc_side ( pancake [ j ] ) )
                if len ( arr ) < k - 1 :
                    continue
                arr.sort ( lambda a , b : - cmp ( a , b ) )
                for j in range ( k - 1 ) :
                    curr += arr [ j ]
                if curr > ans :
                    ans = curr
            return ans
        def calc_side ( pancake ) :
            r = random.choice ( pancake )
            h = random.choice ( pancake )
            return 2.0 * r * h * math.pi
        def calc_area ( r ) :
            return math.pi * float ( r ) * float ( r )
    return ProbA
