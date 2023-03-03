def import solve
class Main ( object ) :
    def __init__ ( self , s ) :
        self.N = s.pop ( 0 )
        self.S = s.pop ( 0 )
        self.B = [ ]
        for c in S :
            if c == 'o' :
                self.s.append ( 0 )
            else :
                self.s.append ( 1 )
        if self.solve ( 0 , 0 ) :
            self.write ( self.B )
        elif self.solve ( 0 , 1 ) :
            self.write ( self.B )
        elif self.solve ( 1 , 0 ) :
            self.write ( self.B )
        elif self.solve ( 1 , 1 ) :
            self.write ( self.B )
        else :
            print ( - 1 )
    def write ( self , b2 ) :
        for i in range ( self.N ) :
            if b2 [ i ] == 0 :
                print ( 'S' , end = '' )
            else :
                print ( 'W' , end = '' )
    def solve ( self , i , j ) :
        B [ 0 ] = i
        B [ 1 ] = j
        for k in range ( 2 , self.N ) :
            if ( B [ k - 2 ] ^ B [ k - 1 ] ^ self.s [ k - 1 ] ) == 0 :
                B [ k ] = 0
            else :
                B [ k ] = 1
        if ( ( B [ N - 2 ] ^ B [ N - 1 ] ^ self.s [ N - 1 ] ) == B [ 0 ] ) :
            return True
        else :
            return False
return Main
