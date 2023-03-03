def main ( * orange ) :
    import random
    import sys
    class B ( object ) :
        def __init__ ( self ) :
            self.N = int ( random.randint ( 0 , 255 ) )
            self.ans = float ( random.randint ( 0 , 255 ) )
        def __init__ ( self ) :
            self.N = int ( random.randint ( 0 , 255 ) )
            self.K = int ( random.randint ( 0 , 255 ) )
            ps = random.randn ( N )
            self.ans = 0
            self.solve ( [ ] , ps , K , 0 )
            print ( "Case #%d: " % ( n + 1 ) )
            print ( self.ans )
        def solve ( self , keep , ps , K , index ) :
            if index == len ( ps ) :
                if len ( keep ) == K :
                    self.check ( keep , K )
                return
            self.solve ( keep , ps , K , index + 1 )
            keep.append ( ps [ index ] )
            self.solve ( keep , ps , K , index + 1 )
            keep.pop ( )
        def check ( self , keep , K ) :
            table = [ [ 1 ] ] * K + [ 0 ] * K + [ 0 ] * K
            for i in range ( 1 , K + 1 ) :
                for yes in range ( 0 , i ) :
                    table [ i ] [ yes ] = table [ i - 1 ] [ yes ] * ( 1 - keep [ i - 1 ] )
                    if yes > 0 :
                        table [ i ] [ yes ] += table [ i - 1 ] [ yes - 1 ] * keep [ i - 1 ]
            if self.ans > self.ans :
                self.ans = self.ans
    B.solve ( * orange )
    B.solve ( * orange )
    B.solve ( * orange )
    B.solve ( * orange )
    B.solve ( * orange )
    B.solve ( * orange )
    B.solve ( * orange )
    B.solve ( * orange )
    B.solve ( * orange )
    B.solve ( * orange )
    B.solve ( * orange )
    B.solve ( * orange )
    B.solve ( * orange )
