def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.s = sys.stdin.read ( )
            self.coord = [ 0 , 0 ]
            self.ques = 0
            self.operation = self.operation
            for char in self.s :
                if char == 'L' :
                    self.coord [ 0 ] -= 1
                elif char == 'R' :
                    self.coord [ 0 ] += 1
                elif char == 'U' :
                    self.coord [ 1 ] += 1
                elif char == 'D' :
                    self.coord [ 1 ] -= 1
                elif char == '?' :
                    self.ques += 1
            if self.operation == 1 :
                print ( abs ( self.coord [ 0 ] ) + abs ( self.coord [ 1 ] ) + self.ques )
            elif self.operation == 2 :
                if len ( self.s ) > self.ques :
                    if abs ( self.coord [ 0 ] ) + abs ( self.coord [ 1 ] ) - self.ques < 0 :
                        print ( ( self.ques - abs ( self.coord [ 0 ] ) + abs ( self.coord [ 1 ] ) ) % 2 )
                    else :
                        print ( abs ( self.coord [ 0 ] ) + abs ( self.coord [ 1 ] ) - self.ques )
                else :
                    print ( self.ques % 2 )
