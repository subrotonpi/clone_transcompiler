def import _input
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.arrayList = [ ]
    def input ( self ) :
        with open ( self.arrayList , 'r' ) as f :
            self.N = len ( f.read ( ) )
            for i in range ( self.N ) :
                self.arrayList.append ( f.read ( ) )
    def main ( self , args ) :
        self.input ( )
        b = [ ]
        if self.N % 2 == 0 :
            for i in range ( self.N - 1 , 0 , - 2 ) :
                b.append ( self.arrayList [ i ] )
            for i in range ( self.N , self.N + 2 ) :
                b.append ( self.arrayList [ i ] )
        else :
            for i in range ( self.N - 1 , self.N - 2 , - 2 ) :
                b.append ( self.arrayList [ i ] )
            for i in range ( 1 , self.N + 2 ) :
                b.append ( self.arrayList [ i ] )
        for i in range ( self.N ) :
            print ( b [ i ] , end = ' ' )
