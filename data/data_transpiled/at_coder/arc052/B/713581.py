def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.input1 = sys.stdin.read ( )
            self.input2 = sys.stdin.read ( )
            self.sui = [ [ ] for _sui in self.sui ]
        def __init__ ( self , * args ) :
            self.sui = [ [ ] for _ in self.sui ]
    for repeat_count in range ( self.input2 ) :
        a = int ( self.input1 )
        b = int ( self.input2 )
        answer = 0.0
        normal = 0.0
        rate1 = 1.0
        rate2 = 0.0
        for i in self.sui :
            normal = i [ 1 ] ** i [ 1 ] * i [ 2 ] / 3.0 * math.pi
            flag = True
            if i [ 0 ] <= a and i [ 0 ] + i [ 2 ] >= a :
                rate1 = ( i [ 0 ] + i [ 2 ] - a ) / float ( i [ 2 ] )
                flag = False
            if i [ 0 ] + i [ 2 ] >= b and i [ 0 ] <= b :
                rate2 = ( i [ 0 ] + i [ 2 ] - b ) / float ( i [ 2 ] )
                flag = False
            if i [ 0 ] >= a and i [ 0 ] + i [ 2 ] <= b :
                rate1 = 1.0
                rate2 = 0.0
                flag = False
            if flag :
                rate1 = 0.0
                rate2 = 0.0
            answer += normal * ( rate1 ** 2 - rate1 ** 2 )
            rate1 = 1.0
            rate2 = 0.0
        print ( "%.6f" % answer )
