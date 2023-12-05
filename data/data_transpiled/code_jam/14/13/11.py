def _import ( ) :
    from os import path
    from random import randint
    from random import seed
    class ProperShuffle :
        def __init__ ( self ) :
            random.seed ( )
    filename = 'data/r1c-C-small-attempt0.in'
    LEN = 1000
    TRY_COUNT = 1000 * LEN
    def main ( ) :
        fp = open ( path.join ( filename , 'r' ) , 'rb' )
        with fp :
            count = [ [ i for i in range ( LEN ) ] for i in range ( TRY_COUNT ) ]
            arr = [ i for i in range ( LEN ) ]
            for i in range ( TRY_COUNT ) :
                arr = arr [ : ]
                shuffle ( arr )
                for j in range ( LEN ) :
                    count [ arr [ j ] [ i ] ] += 1
            T = sum ( [ i for i in range ( LEN ) ] )
            for t , n in enumerate ( arr ) :
                prob = 1.0
                for i in range ( n ) :
                    s = random.randint ( 0 , LEN )
                    prob *= float ( count [ s ] [ i ] ) / float ( TRY_COUNT / LEN )
                if prob > 1.0 :
                    self.out ( t , 'BAD' )
                else :
                    self.out ( t , 'GOOD' )
    def shuffle ( arr ) :
        arr = [ arr ]
        for k in range ( len ( arr ) ) :
            p = random.randrange ( len ( arr ) )
            t = arr [ p ]
            arr [ p ] = arr [ k ]
            arr [ k ] = t
    def out ( t , ans ) :
        print ( 'Case #{}: {}'.format ( t + 1 , ans ) )
